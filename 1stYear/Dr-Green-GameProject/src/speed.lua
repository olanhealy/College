-- initalize speed
baseSpeed = 5
speed = baseSpeed
lastSpeed = speed 

function updateSpeed()
	 --speed up game over time
	speed = speed + .01
	lastSpeed = speed
	

end

function resetSpeed()
	--reset the speed again
	speed = baseSpeed
	lastSpeed = baseSpeed
end
