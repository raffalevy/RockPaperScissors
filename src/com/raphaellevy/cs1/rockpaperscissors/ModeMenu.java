package com.raphaellevy.cs1.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;

/**
 * Main menu - displayed at start of game. Allows for choice between 1/1 and 2/3
 * 
 * @author raffa
 */
class ModeMenu extends ConsoleMenu {
	/**
	 * The specific prompt to be displayed at the beginning of a ModeMenu.
	 */
	static final String PROMPT = "Would you like to play 1 out of 1, 2 out of 3, or exit?";

	private List<ConsoleMenuItem> items;

	ModeMenu(RockPaperScissors mainClass) {
		super(mainClass);
		items = new ArrayList<>();
		items.add(new ConsoleMenuItem("1", "1 out of 1", new Game1OutOf1(mainClass)::play));
		items.add(new ConsoleMenuItem("2", "2 out of 3", new Game2OutOf3(mainClass)::play));
		items.add(ConsoleMenuItem.getExitItem());
	}

	@Override
	List<ConsoleMenuItem> getItems() {
		return items;
	}

	@Override
	String getPrompt() {
		return PROMPT;
	}

}
