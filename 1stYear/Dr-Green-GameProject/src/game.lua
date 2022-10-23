--scene code from lab again
local composer = require("composer")

local scene = composer.newScene()

-- -----------------------------------------------------------------------------------
-- Code outside of the scene event functions below will only be executed ONCE unless
-- the scene is removed entirely (not recycled) via "composer.removeScene()"
-- -----------------------------------------------------------------------------------




-- -----------------------------------------------------------------------------------
-- Scene event functions
-- -----------------------------------------------------------------------------------

-- create()
function scene:create(event)

    local sceneGroup = self.view
    -- Code here runs when the scene is first created but has not yet appeared on screen

    -- Game Variables
    screenXwidth = display.contentWidth
    screenXcenter = screenXwidth / 2
    screenYheight = display.contentHeight
    screenYcenter = screenYheight / 2 - 20 --the display of game

    inEvent = 0 --declare not in
    eventRun = 0

    enemySpawned = false
    potionSpawned = false

    potionTimer = 300
    potionActive = false


    -- Groups
    blocks = display.newGroup() --ground.lua
    characters = display.newGroup()-- hero.lua
    screen = display.newGroup()
    --require all of our .lua files in here so the game can run
    require("ground")
    require("background")
    require("collisions")
    require("events")
    require("hero")
    require("game_over")
    require("scoreboard")
    require("speed")
    require("enemies")
    require("potion")


    -- insert all the different graphic aspects
    sceneGroup:insert(backbackground)
    sceneGroup:insert(backgroundfar1)
    sceneGroup:insert(backgroundfar2)
    sceneGroup:insert(backgroundnear1)
    sceneGroup:insert(backgroundnear2)
    sceneGroup:insert(blocks)
    sceneGroup:insert(hero)
    sceneGroup:insert(collisionRect)
    sceneGroup:insert(scoreText)
    sceneGroup:insert(gameOver)
    sceneGroup:insert(enemy)
    sceneGroup:insert(potion)


    -- initalize audio for game over sound
    local endGamee
    endGamee = audio.loadSound("music/gameOver.wav")

  

    local function update(event)
        if hero.isAlive then
            --if hero is alive, check if been hit, update speed, update looping background, the blocks and characters
            checkCollisions()
            updateSpeed()
            updateBackgrounds()
            updateBlocks()
            updateCharacter()
            if (enemySpawned) then
                -- if enemy is spawned then insert him
                updateEnemy()
            end
            if (potionSpawned) then
                updatePotion()
            end
            if (potionActive) then
                potionTimer = potionTimer - 1
                if (potionTimer == 0) then
                    potionActive = false
                    potionTimer = 300
                    hero.gravity = -6
                end
            end
        else
            endGame() --the hero is dead so game over is played, play the game over music too
            audio.play(endGamee)
            audio.stop(1)


        end
    end

    function touched(event)
        if hero.isAlive then
            if (event.phase == "began") then
                if (onGround) then
                    hero.accel = hero.accel + 20
                    speed = baseSpeed
                end
            end
        else
            restartGame()
        end
    end

    timer.performWithDelay(1, update, -1)
    Runtime:addEventListener("touch", touched, -1)
end


-- show()
function scene:show(event)

    local sceneGroup = self.view
    local phase = event.phase

    if (phase == "will") then
        -- Code here runs when the scene is still off screen (but is about to come on screen)

    elseif (phase == "did") then
        -- Code here runs when the scene is entirely on screen

    end
end


-- hide()
function scene:hide(event)

    local sceneGroup = self.view
    local phase = event.phase

    if (phase == "will") then
        -- Code here runs when the scene is on screen (but is about to go off screen)

    elseif (phase == "did") then
        -- Code here runs immediately after the scene goes entirely off screen
        composer.removeScene("game")
    end
end


-- destroy()
function scene:destroy(event)

    local sceneGroup = self.view
    -- Code here runs prior to the removal of scene's view

end


-- -----------------------------------------------------------------------------------
-- Scene event function listeners
-- -----------------------------------------------------------------------------------
scene:addEventListener("create", scene)
scene:addEventListener("show", scene)
scene:addEventListener("hide", scene)
scene:addEventListener("destroy", scene)
-- -----------------------------------------------------------------------------------

return scene
