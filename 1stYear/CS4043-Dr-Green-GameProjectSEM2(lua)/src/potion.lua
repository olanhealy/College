potion = display.newImage("images/potion.png")
potion.name = potion
potion.y = screenXcenter --variables for potion will spawn on the floor

function spawnPotion()
    potion.x = 500
    potionSpawned = true --spawns potion
end

function updatePotion()
    potion.x = potion.x - speed 
    if (potion.x < -(screenXcenter - 1)) then
        resetPotion()
        potionSpawned = false --updates potion when goes off screen
    end
end


function resetPotion()
    potion.x = 4000
end

