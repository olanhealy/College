-- music loading -- 
local jump
jump = audio.loadSound("music/jump.mp3")

local bMusic 
bMusic = audio.loadStream("music/mainMusicGreen.mp3")

-- Creating Animated Character

function killHero()
	hero.isAlive = false 
  end

function resetHero()
	hero.x = screenXcenter
	hero.y =280 -- start on bottom of screen
	hero.gravity= -6
	hero.accel = 0.05
	hero.isAlive = true
	hero:setSequence("running")
	hero:play()
	hero.rotation = 0
end

local options =
{
    width = 100,
    height = 100,
    numFrames = 7
}
local imageSheet = graphics.newImageSheet( "images/drTreeMan.png", options )

local sequenceData =
{
    { name="running", frames={ 1, 2, 3, 4, 5, 6 }, time=600 },
    { name="jumping", start=7, count=1, time=300 }
}
hero = display.newSprite( imageSheet, sequenceData )

resetHero()

collisionRect = display.newRect(hero.x + 22, hero.y, 1, 70)
collisionRect.strokeWidth = 1
collisionRect:setFillColor(140, 140, 140)
collisionRect:setStrokeColor(180, 180, 180)
collisionRect.alpha = 0

character = display.newGroup()
character:insert(hero)
character:insert(collisionRect)

characters:insert(character)

function updateCharacter()
	--if our hero is jumping then switch to the jumping animation
	--if not keep playing the running animation
	if(hero.isAlive == true) then
		audio.play(bMusic)
		if(onGround) then
		
			if(wasOnGround) then
				
				
			

			else
				hero:setSequence("running")
				hero:play()
			end
		else
			hero:setSequence("jumping")
			hero:play()
			hero.gravity = -5
		
		end
		
		if(hero.accel > 0) then
			audio.play(jump) 
			audio.stop(3)
			hero.accel = hero.accel - 0.7
		end
		
		hero.y = hero.y - hero.accel
		hero.y = hero.y - hero.gravity
	end
	collisionRect.y = hero.y

end