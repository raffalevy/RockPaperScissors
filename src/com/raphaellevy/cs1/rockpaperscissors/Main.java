package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Scanner;

/**
 * Contains main method which runs at start of program. The instance of Main
 * contains objects and data needed by various classes for the game, allowing
 * classes to reference each other.
 */
public class Main {
	/**
	 * Contains single instance of Main
	 */
	private static Main instance;

	/**
	 * @return Single instance of Main
	 */
	static Main getInstance() {
		return instance;
	}
	
	/**
	 * Called when user chooses to exit game.
	 */
	void onExit() {
		System.out.println(GameConstants.EXIT_MESSAGE);
		System.exit(0);
	}
	
	/**
	 * Main Method - runs at start of program
	 */
	public static void main(String[] args) {
		instance = new Main();
		instance.start();
	}

	/**
	 * This {@link Scanner} will be used by all classes which need it, as opposed to using separate Scanners for each, in order to avoid undefined behavior.
	 */
	Scanner scan;

	/**
	 * Private constructor for Main singleton object
	 */
	private Main() {
		scan = new Scanner(System.in);
	};

	/**
	 * Start the actual application.
	 */
	private void start() {
		System.out.println(GameConstants.WELCOME_MESSAGE);
		System.out.println(GameConstants.MENU_INSTRUCTIONS);
		new ModeMenu(this).showMenu();
	}

}
