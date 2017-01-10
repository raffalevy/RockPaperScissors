package com.raphaellevy.cs1.rockpaperscissors.gui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RPSPanel extends RPSContentPane {
	JLabel label;
	JButton rockButton;
	JButton paperButton;
	JButton scissorsButton;

	public RPSPanel(RPSFrame frame) {
		super(frame);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

	}
}
