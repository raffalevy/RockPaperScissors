/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

import javax.naming.OperationNotSupportedException;

/**
 * Represents a 2 out of 3 game.
 * 
 * @author student
 */
class Game2OutOf3 extends RPSComponent {

	Game2OutOf3(Main mainClass) {
		super(mainClass);
	}

	/**
	 * Start the game! (2/3)
	 */
	public void play() {
		try {
			throw new OperationNotSupportedException("2/3 game not yet implemented.");
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}
}
