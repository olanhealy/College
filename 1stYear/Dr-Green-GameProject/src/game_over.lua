-- Creating Game Over
gameOver = display.newImageRect("images/gameOver.png", 500, 200)
gameOver.name = "gameOver"
gameOver.x = 0
gameOver.y = 500




function endGame()
	speed = 0 -- set stuff to end

   
	gameOver.x = screenXcenter
	gameOver.y = screenYcenter
	hero:setSequence("jumping")
	hero:pause()

	  
	

end

function restartGame()
	--resets all of the game functions from other .lua files
	gameOver.x = 0
	gameOver.y = screenYheight * 2
	
	resetScore()
	resetSpeed()
	resetHero()
	resetGround()
	resetBackgrounds()
	resetEnemy()
	

end