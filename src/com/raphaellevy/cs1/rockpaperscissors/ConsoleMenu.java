/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Scanner;

/**
 * @author raffa
 * A menu that is displayed in the console, allowing for choice between multiple options.
 */
abstract class ConsoleMenu extends RPSComponent{
	ConsoleMenu(Main mainClass) {
		super(mainClass);
	}
	
	/**
	 * Displays the menu and gets input from console
	 */
	void showMenu() {
		
	}
}
