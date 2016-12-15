/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

/**
 * Represents an item in a {@link ConsoleMenu}.
 * 
 * @author raffa
 */
class ConsoleMenuItem {
	/**
	 * The {@link Action} to be executed ({@link Action #run()}) when this item
	 * is selected.
	 */
	final Action action;

	/**
	 * Can be typed by the user instead of the full {@link #text} of the item.
	 */
	final String shortcut;

	/**
	 * The name of the item displayed. The user can enter either this or the
	 * {@link #shortcut} to select the item.
	 */
	final String text;

	/**
	 * Create a new {@link ConsoleMenuItem} with the specified parameters.
	 * 
	 * @param shortcut
	 * @param text
	 * @param action
	 */
	ConsoleMenuItem(String shortcut, String text, Action action) {
		this.shortcut = shortcut;
		this.text = text;
		this.action = action;
	}
}
