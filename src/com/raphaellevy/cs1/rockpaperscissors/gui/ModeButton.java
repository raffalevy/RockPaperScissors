package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class ModeButton extends JButton {
	public ModeButton(String text, RPSFrame frame) {
		super(text);
		setFont(frame.lato(25));
		setPreferredSize(new Dimension(160, 85));
	}

}
