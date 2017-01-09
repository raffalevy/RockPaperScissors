package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.raphaellevy.cs1.rockpaperscissors.RockPaperScissors;

public abstract class RPSContentPane extends JPanel {
	public RPSContentPane() {
		super();
		setPreferredSize(new Dimension(RPSFrame.WINDOW_WIDTH, RPSFrame.WINDOW_HEIGHT));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(new ImageIcon(RockPaperScissors.class.getResource("/assets/backgroundimage.png")).getImage(), 0, 0, null);
	}
}
