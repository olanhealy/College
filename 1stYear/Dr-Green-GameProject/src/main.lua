--from space shooter lab we did for scene so we have a menu to go to

local composer = require( "composer" )
 
-- Hide status bar
display.setStatusBar( display.HiddenStatusBar )
 

 
-- Go to the menu screen
composer.gotoScene( "menu", {time = 1000 , effect = "crossFade"} )