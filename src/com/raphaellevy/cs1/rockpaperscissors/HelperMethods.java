package com.raphaellevy.cs1.rockpaperscissors;

import java.io.IOException;
import java.util.Random;

/**
 * Contains static methods to be used by other classes.
 * 
 * @author raffa
 */
public class HelperMethods {
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
	 * Randomly generate a value of {@link GameConstants#ROCK},
	 * {@link GameConstants#PAPER}, or {@link GameConstants#PAPER}.
	 */
	public static int generateRockPaperScissors() {
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

	/**
	 * Execute {@link Thread#sleep(long)} in a try/catch block.
	 */
	static void tryThreadSleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read all bytes from System.in to make sure previous input does not
	 * interfere with menus.
	 */
	static void clearSysIn() {
		try {
			while (System.in.available() != 0)
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
