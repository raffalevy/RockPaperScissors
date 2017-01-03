package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Scanner;

import com.raphaellevy.cs1.rockpaperscissors.gui.RPSFrame;

/**
 * Contains main method which runs at start of program. The instance of Main
 * contains objects and data needed by various classes for the game, allowing
 * classes to reference each other.
 */
public class RockPaperScissors {
	/**
	 * Contains single instance of Main
	 */
	private static RockPaperScissors instance;

	/**
	 * @return Single instance of Main
	 */
	static RockPaperScissors getInstance() {
		return instance;
	}

	/**
	 * Main Method - runs at start of program
	 */
	public static void main(String[] args) {
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		RPSFrame frame = new RPSFrame();
		// instance = new Main();
	}

	Scanner scan;

	/**
	 * Private constructor for Main singleton object
	 */
	private RockPaperScissors() {
		scan = new Scanner(System.in);
		System.out.println(GameConstants.WELCOME_MESSAGE);
		System.out.println(GameConstants.MENU_INSTRUCTIONS);
		new ModeMenu(this).showMenu();
	};

}
