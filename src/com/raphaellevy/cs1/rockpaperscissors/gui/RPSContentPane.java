package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.raphaellevy.cs1.rockpaperscissors.RockPaperScissors;

public class RPSContentPane extends JPanel {
	public RPSContentPane() {
		super();
		setPreferredSize(new Dimension(RPSFrame.WINDOW_WIDTH, RPSFrame.WINDOW_HEIGHT));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(0xF4F4F4));
		g.fillRect(0,0,RPSFrame.WINDOW_WIDTH, RPSFrame.WINDOW_HEIGHT);
		g.drawImage(new ImageIcon(RockPaperScissors.class.getResource("/assets/backgroundimage.png")).getImage(), 0,0,RPSFrame.WINDOW_WIDTH, RPSFrame.WINDOW_HEIGHT, null);
	}
}
