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
		String[] names = {"Appy","Javabot","RockPaperScissorsMaster","Grandmaster"};
		return Integer.toHexString(rand.nextInt(0xFFFF)) + names[rand.nextInt(names.length)] + Integer.toHexString(rand.nextInt(0xFFFF));
	}
}
