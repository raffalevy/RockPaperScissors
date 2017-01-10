package com.raphaellevy.cs1.rockpaperscissors;

/**
 * Contains constants for other classes to access.
 * 
 * @author raffa
 */
public class GameConstants {

	/**
	 * Message to be displayed at end of game or when quitted.
	 */
	static final String EXIT_MESSAGE = "\n--------------------------\n| Thank you for playing! |\n--------------------------";
	/**
	 * Instructions to be displayed at start of game so that the user knows how
	 * to use the menus.
	 */
	static final String MENU_INSTRUCTIONS = "Welcome! To select an item from any of the menus in this game,\ntype the shortcut shown at the beginning of the menu option and press ENTER.";
	/**
	 * Message displayed when game started
	 */
	static final String WELCOME_MESSAGE = "Rock Paper Scissors\n" + "-------------------";

	/**
	 * Int value representing Rock.
	 */

	public static final int ROCK = 0;

	/**
	 * Int value representing Paper.
	 */

	public static final int PAPER = 1;

	/**
	 * Int value representing Scissors.
	 */
	public static final int SCISSORS = 2;
}
