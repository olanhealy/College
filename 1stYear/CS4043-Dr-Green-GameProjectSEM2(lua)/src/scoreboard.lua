-- Creating Scoreboard
score = 0
scoreText = display.newText("Distance Covered: 0", 0, 0, "fonts/BorisBlackBloxx.ttf", 20)
scoreText.anchorX, scoreText.anchorY = 0, .5
scoreText.x, scoreText.y = 10, 20

function updateScore()
    -- for every metre travelled, score will go up by 1. installed custom font which makes text display micer

    score = score + 1
    scoreText.text = "Distance Covered: " .. score.."m"
    scoreText.anchorX, scoreText.anchorY = 0, .5
    scoreText.x, scoreText.y = 10, 20
end

function resetScore()
    --after death, the text goes back to zero
    score = 0
    scoreText.text = "Distance Covered: " .. score.."m"
end


