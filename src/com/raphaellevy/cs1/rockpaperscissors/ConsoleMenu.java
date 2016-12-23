/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

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
	abstract List<ConsoleMenuItem> getItems();

	/**
	 * @return The prompt to be displayed at the beginning of the menu.
	 */
	abstract String getPrompt();

	/**
	 * Displays the menu and gets input from console
	 */
	void showMenu() {
		HelperMethods.tryThreadSleep(400);
		System.out.println();
		System.out.println(getPrompt());
		HelperMethods.tryThreadSleep(400);
		for (ConsoleMenuItem item : getItems()) {
			System.out.println("  " + item.shortcut + ": " + item.text);
		}
		HelperMethods.clearSysIn();
		while (true) {
			String input = scan.nextLine();
			for (ConsoleMenuItem item : getItems()) {
				if (item.shortcut.equalsIgnoreCase(input) || item.text.equalsIgnoreCase(input)) {
					if (item.action != null) {
						item.action.run();
					}
				}
			}
			System.out.println("Sorry, I don't know what that meant. Try again with one of the options from the menu.");
		}

	}
}
