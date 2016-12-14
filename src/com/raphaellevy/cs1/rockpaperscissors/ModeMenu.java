package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Scanner;

/**
 * Menu to choose between 1/1 and 2/3
 * @author raffa
 */
class ModeMenu {
	private Scanner scan;
	private Main mainClass;
	ModeMenu(Main mainClass) {
		this.mainClass = mainClass;
		scan = mainClass.scan;
	}
	
}
