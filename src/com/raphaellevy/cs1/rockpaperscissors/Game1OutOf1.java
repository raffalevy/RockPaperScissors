/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.ROCK;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.PAPER;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.SCISSORS;
import static com.raphaellevy.cs1.rockpaperscissors.GameEnd.*;
/**
 * Represents a 1 out of 1 game.
 * @author student
 */
class Game1OutOf1 extends RPSComponent implements RPSListener {

	Game1OutOf1(Main mainClass) {
		super(mainClass);
	}

	/**
	 * Start the game! (1/1)
	 */
	public void play() {
		new RockPaperScissorsMenu(mainClass, this).showMenu();
	}

	/**
	 * Called on a tie.
	 */
	void tie() {
		System.out.println("You tied. Why don't you play another round?");
		new RockPaperScissorsMenu(mainClass, this).showMenu();
	};
	
	@Override
	public void onRock() {
		int opponentInput = HelperMethods.generateRockPaperScissors();
		switch (opponentInput) {
		case ROCK:
			tie();
		case PAPER:
			lose();
		case SCISSORS:
			win();
		}
	}

	@Override
	public void onPaper() {
		int opponentInput = HelperMethods.generateRockPaperScissors();
		switch (opponentInput) {
		case ROCK:
			win();
		case PAPER:
			tie();
		case SCISSORS:
			lose();
		}
	}

	@Override
	public void onScissors() {
		int opponentInput = HelperMethods.generateRockPaperScissors();
		switch (opponentInput) {
		case ROCK:
			lose();
		case PAPER:
			win();
		case SCISSORS:
			tie();
		}
	}
}