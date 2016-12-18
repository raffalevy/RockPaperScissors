/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;

/**
 * Menu to choose between Rock, Paper, and Scissors.
 * 
 * @author student
 */
class RockPaperScissorsMenu extends ConsoleMenu {

	private List<ConsoleMenuItem> items;

	RockPaperScissorsMenu(Main mainClass, RPSListener listener) {
		super(mainClass);
		items = new ArrayList<>();
		items.add(new ConsoleMenuItem("R", "Rock", listener::onRock));
		items.add(new ConsoleMenuItem("P", "Paper", listener::onPaper));
		items.add(new ConsoleMenuItem("S", "Scissors", listener::onScissors));
		items.add(ConsoleMenuItem.getExitItem());
	}

	@Override
	List<ConsoleMenuItem> getItems() {
		return items;
	}

	@Override
	String getPrompt() {
		return "Would you like to play Rock, Paper, or Scissors?";
	}

}
