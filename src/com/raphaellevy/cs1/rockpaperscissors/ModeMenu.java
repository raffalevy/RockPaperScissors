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

	ModeMenu(Main mainClass) {
		super(mainClass);
		items = new ArrayList<>();
		items.add(new ConsoleMenuItem("1", "1 out of 1", () -> {
		}));
		items.add(new ConsoleMenuItem("2", "2 out of 3", () -> {
		}));
		items.add(new ConsoleMenuItem("Q", "Quit Application", () -> {
			System.out.println(GameConstants.EXIT_MESSAGE);
			System.exit(0);
		}));
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
