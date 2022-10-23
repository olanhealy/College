enemy = display.newImage("images/bird.png")
enemy.name = enemy
enemy.y = screenXcenter - 20 --minmum height so you can't go under

function spawnEnemy()
    enemy.x = 500
    enemySpawned = true --spawns enemy
end

function updateEnemy()
    enemy.x = enemy.x - speed
    if (enemy.x < -(screenXcenter-1)) then
        resetEnemy()
        enemySpawned = false
    end
end

function resetEnemy()
    enemy.x = 4000
end