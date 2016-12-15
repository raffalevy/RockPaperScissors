/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

import java.util.List;

/**
 * A menu that is displayed in the console, allowing for choice between multiple
 * options.
 * 
 * @author raffa
 */
abstract class ConsoleMenu extends RPSComponent {
	ConsoleMenu(Main mainClass) {
		super(mainClass);
	}

	/**
	 * @return The {@link java.util.List List} of items that can be chosen with
	 *         this menu.
	 */
	abstract List<ConsoleMenuItem> getList();

	/**
	 * Displays the menu and gets input from console
	 */
	void showMenu() {

	}
}
