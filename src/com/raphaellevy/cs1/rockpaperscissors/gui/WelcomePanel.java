package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePanel extends RPSContentPane {
	public WelcomePanel(RPSFrame frame) {
		super(frame);
		setLayout(new BorderLayout());
		JLabel label = new JLabel("Welcome!");
		label.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		// label.setAlignmentY(JFrame.CENTER_ALIGNMENT);
		label.setFont(frame.actions.lato(50));
		add(label, BorderLayout.CENTER);
	}
}
