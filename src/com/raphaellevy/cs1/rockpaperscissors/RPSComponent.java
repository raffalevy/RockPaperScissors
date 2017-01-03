package com.raphaellevy.cs1.rockpaperscissors;

import java.util.Scanner;

/**
 * Most classes extend this other than {@link RockPaperScissors}. Contains important
 * information such as the {@link Scanner} and Main instance.
 * 
 * @author raffa
 */
abstract class RPSComponent {
	protected RockPaperScissors mainClass;
	protected Scanner scan;

	RPSComponent(RockPaperScissors mainClass) {
		this.mainClass = mainClass;
		scan = mainClass.scan;
	}
}
