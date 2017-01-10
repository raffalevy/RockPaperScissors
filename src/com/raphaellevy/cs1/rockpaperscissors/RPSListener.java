package com.raphaellevy.cs1.rockpaperscissors;

/**
 * A class that implements this can handle input of Rock, Paper, or Scissors.
 * 
 * @author raffa
 */
public interface RPSListener {
	/**
	 * Called when the player chooses Rock.
	 */
	void onRock();

	/**
	 * Called when the player chooses Paper.
	 */
	void onPaper();

	/**
	 * Called when the player chooses Scissors.
	 */
	void onScissors();
}
