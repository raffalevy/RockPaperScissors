package com.raphaellevy.cs1.rockpaperscissors;

public class Main {

	static Main instance;

	static final String WELCOME_MESSAGE = "Rock Paper Scissors\n" + "-------------------";

	static Main getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		instance = new Main();
	}

	private Main() {
		System.out.println(WELCOME_MESSAGE);
	};

}
