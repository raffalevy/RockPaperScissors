package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Random;

/**
 * Contains static methods to be used by other classes.
 * 
 * @author raffa
 */
class HelperMethods {
	static Random rand = new Random();

	/**
	 * @return A cool name for a computer opponent
	 */
	static String computerName() {
		String[] names = { "Appy", "Javabot", "RockPaperScissorsMaster", "Grandmaster", "Cal" };
		return Integer.toHexString(rand.nextInt(0xFFFF)) + names[rand.nextInt(names.length)]
				+ Integer.toHexString(rand.nextInt(0xFFFF));
	}

	/**
	 * Randomly generate a value of {@link GameConstants#ROCK}, {@link GameConstants#PAPER}, or {@link GameConstants#PAPER}.
	 */
	static int generateRockPaperScissors() {
		switch (rand.nextInt(2)) {
		case 0:
			return GameConstants.ROCK;
		case 1:
			return GameConstants.PAPER;
		case 2:
			return GameConstants.SCISSORS;
		}
		return 0;
	}
}
