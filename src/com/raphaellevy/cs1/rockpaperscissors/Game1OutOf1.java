/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

/**
 * @author student
 *
 */
class Game1OutOf1 extends RPSComponent implements RPSListener{

	Game1OutOf1(Main mainClass) {
		super(mainClass);
	}

	/**
	 * Start the game! (1/1)
	 */
	public void play() {
		new RockPaperScissorsMenu(mainClass, this).showMenu();
	}

	@Override
	public void onRock() {
		System.out.println("sds");
	}

	@Override
	public void onPaper() {
		
	}

	@Override
	public void onScissors() {
		
	}
}