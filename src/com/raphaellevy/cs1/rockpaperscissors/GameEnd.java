/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

/**
 * Contains events for winning and losing the game.
 * @author raffa
 */
class GameEnd {
	static void win() {
		System.out.println("You win!");
		RockPaperScissors.getInstance().onExit();
	};
	static void lose() {
		System.out.println("You lose...");
		RockPaperScissors.getInstance().onExit();
	};
}
