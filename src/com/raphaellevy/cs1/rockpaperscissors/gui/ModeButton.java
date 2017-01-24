package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Dimension;

import javax.swing.JButton;

public class ModeButton extends JButton {
	public ModeButton(String text, RPSFrame frame) {
		super(text);
		setFont(frame.actions.lato(25));
		setPreferredSize(new Dimension(160, 85));
	}

}
