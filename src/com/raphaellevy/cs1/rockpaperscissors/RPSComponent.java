package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Scanner;

/**
 * @author raffa
 * Most classes extend this other than {@link Main}. Contains important information such as the {@link Scanner} and Main instance.
 */
abstract class RPSComponent {
	protected Scanner scan;
	protected Main mainClass;
	RPSComponent(Main mainClass) {
		this.mainClass = mainClass;
		scan = mainClass.scan;
	}
}