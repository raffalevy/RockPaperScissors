package com.raphaellevy.cs1.rockpaperscissors.gui;

import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.PAPER;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.ROCK;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.SCISSORS;

import com.raphaellevy.cs1.rockpaperscissors.HelperMethods;
import com.raphaellevy.cs1.rockpaperscissors.RPSListener;

public class Game1OutOf1 implements RPSListener {
	public Game1OutOf1() {

	}

	void win() {

	}

	void tie() {

	}

	void lose() {

	}

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
