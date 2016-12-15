package com.raphaellevy.cs1.rockpaperscissors;

import java.util.List;
import java.util.Scanner;

/**
 * Main menu - displayed at start of game. Allows for choice between 1/1 and 2/3
 * 
 * @author raffa
 */
class ModeMenu extends ConsoleMenu {
	private Main mainClass;
	private Scanner scan;

	ModeMenu(Main mainClass) {
		super(mainClass);
	}

	@Override
	List<ConsoleMenuItem> getList() {
		return null;
	}

}
