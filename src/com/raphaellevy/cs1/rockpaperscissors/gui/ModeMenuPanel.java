package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModeMenuPanel extends RPSContentPane {
	JButton mode11;
	JButton mode23;
	JLabel label;
	public ModeMenuPanel(RPSFrame frame) {
		super();
		label = new JLabel("Would you like to play 1/1 or 2/3?");
		label.setFont(frame.lato(40));
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		mode11 = new JButton("1/1");
		mode11.setFont(frame.lato(25));
		mode11.setPreferredSize(new Dimension(160, 85));
		mode23 = new JButton("2/3");
		mode23.setFont(frame.lato(25));
		
		BoxLayout lo = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(lo);
		
		add(Box.createRigidArea(new Dimension(0,60)));
		
		add(label);
		
		add(Box.createRigidArea(new Dimension(0,40)));
		
		add(new JPanel() {{
			setOpaque(true);
			setAlignmentX(CENTER_ALIGNMENT);
			setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
			add(mode11);
			add(mode23);
		}});
		
	}
}
