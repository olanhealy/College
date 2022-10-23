
--from lab

local composer = require( "composer" )
 
local scene = composer.newScene()
print("Filename accsessed")


-- -----------------------------------------------------------------------------------
-- Code outside of the scene event functions below will only be executed ONCE unless
-- the scene is removed entirely (not recycled) via "composer.removeScene()"
-- -----------------------------------------------------------------------------------
local function gotoGame()
    composer.gotoScene( "game" )
    --goes to the game scene 
end
 

 
 
-- -----------------------------------------------------------------------------------
-- Scene event functions
-- -----------------------------------------------------------------------------------
 
-- create()
function scene:create( event )
 
    local sceneGroup = self.view
    -- Code here runs when the scene is first created but has not yet appeared on screen
    local backdrop = display.newImageRect( sceneGroup, "images/backdrop.png", 800, 1400 )
    backdrop.x = display.contentCenterX
    backdrop.y = display.contentCenterY --the backdrop

    local title = display.newImageRect( sceneGroup, "images/title.png", 500, 800 )
   title.x = display.contentCenterX
   title.y = display.contentCenterY --our game logo 

    local playButton = display.newImageRect( sceneGroup, "images/playButton.png",  200,  200)
    playButton.x = 225
    playButton.y = 225 --the play button display



    playButton:addEventListener( "tap", gotoGame ) -- a tap event to actually go to game.lua
 
    
    



end
 
 
-- show()
function scene:show( event )
 
    local sceneGroup = self.view
    local phase = event.phase
 
    if ( phase == "will" ) then
        -- Code here runs when the scene is still off screen (but is about to come on screen)
 
    elseif ( phase == "did" ) then
        -- Code here runs when the scene is entirely on screen
       
    end
end
 
 
-- hide()
function scene:hide( event )
 
    local sceneGroup = self.view
    local phase = event.phase
 
    if ( phase == "will" ) then
        -- Code here runs when the scene is on screen (but is about to go off screen)
 
    elseif ( phase == "did" ) then
        -- Code here runs immediately after the scene goes entirely off screen
       
    end
end
 
 
-- destroy()
function scene:destroy( event )
 
    local sceneGroup = self.view
    -- Code here runs prior to the removal of scene's view

end
 
 
-- -----------------------------------------------------------------------------------
-- Scene event function listeners
-- -----------------------------------------------------------------------------------
scene:addEventListener( "create", scene )
scene:addEventListener( "show", scene )
scene:addEventListener( "hide", scene )
scene:addEventListener( "destroy", scene )

-- -----------------------------------------------------------------------------------
 
return scene