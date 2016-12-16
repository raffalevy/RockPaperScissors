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

	RockPaperScissorsMenu(Main mainClass) {
		super(mainClass);
		items = new ArrayList<>();
		items.add(new ConsoleMenuItem("R", "Rock", null));
		items.add(new ConsoleMenuItem("P", "Paper", null));
		items.add(new ConsoleMenuItem("S", "Scissors", null));
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
