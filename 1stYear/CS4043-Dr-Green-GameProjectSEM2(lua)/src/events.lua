function checkEvent()
    --first check to see if we are already in an event, we only want 1 event going on at a time
    if (eventRun > 0) then
        --if we are in an event decrease eventRun. eventRun is a variable that tells us how
        --much longer the event is going to take place. Everytime we check we need to decrement
        --it. Then if at this point eventRun is 0 then the event has ended so we set inEvent back
        --to 0.
        eventRun = eventRun - 1
        if (eventRun == 0) then
            inEvent = 0
        end
    end
    --if we are in an event then do nothing
    if (inEvent > 0 and eventRun > 0) then
        --Do nothing
    else
        local randomMax = 10
        check = math.random(randomMax)

        --this first event is going to cause the elevation of the ground to change. For this game we
        -- just want random holes in the ground the player has to jump over
        if (check == randomMax) then
            -- randomly choose the event that happens
            inEvent = math.random(1000)
            eventRun = 1
        end
    end
    --if we are in an event call runEvent to figure out if anything special needs to be done
    if (inEvent > 0) then
        runEvent()
    end
end

function runEvent()
    if (inEvent % 10 == 0 and inEvent % 50 > 0) then
        groundLevel = 4000
    else
        groundLevel = groundMin
    end

    if (inEvent % 50 == 0) then
        if (enemySpawned == false) then
            spawnEnemy()
        end
    end

    if (inEvent == 1) then
        if (potionSpawned == false and potionActive == false) then
            spawnPotion()
        end
    end
end