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
	 * Message displayed when game started
	 */
	static final String WELCOME_MESSAGE = "Rock Paper Scissors\n" + "-------------------";

	/**
	 * @return Single instance of Main
	 */
	static Main getInstance() {
		return instance;
	}

	/**
	 * Main Method - runs at start of program
	 */
	public static void main(String[] args) {
		instance = new Main();
	}

	Scanner scan;

	/**
	 * Private constructor for Main singleton object
	 */
	private Main() {
		scan = new Scanner(System.in);
		System.out.println(WELCOME_MESSAGE);
	};

}
