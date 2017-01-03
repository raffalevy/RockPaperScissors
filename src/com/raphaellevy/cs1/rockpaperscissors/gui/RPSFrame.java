package com.raphaellevy.cs1.rockpaperscissors.gui;

import javax.swing.JFrame;

public class RPSFrame extends JFrame {
	public static final int WINDOW_WIDTH = 740;
	public static final int WINDOW_HEIGHT = 470;

	private RPSMenuBar menuBar;

	public RPSFrame() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		menuBar = new RPSMenuBar();
		setJMenuBar(menuBar);
		;
		setVisible(true);
	}

}
