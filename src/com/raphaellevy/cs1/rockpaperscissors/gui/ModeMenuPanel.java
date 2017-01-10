package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModeMenuPanel extends RPSContentPane {
	JButton mode11;
	JButton mode23;
	JButton instructionsButton;
	JLabel label;

	public ModeMenuPanel(RPSFrame frame) {
		super(frame);
		label = new JLabel("Would you like to play 1/1 or 2/3?");
		label.setFont(frame.lato(40));
		label.setAlignmentX(CENTER_ALIGNMENT);

		mode11 = new ModeButton("1/1", frame);
		frame.actions.addActionListener(mode11, frame.actions::new1OutOf1);
		mode23 = new ModeButton("2/3", frame);
		frame.actions.addActionListener(mode23, frame.actions::new2OutOf3);

		instructionsButton = new JButton("Instructions");
		instructionsButton.setFont(frame.lato(25));
		instructionsButton.setAlignmentX(CENTER_ALIGNMENT);
		frame.actions.addActionListener(instructionsButton, frame.actions::instructions);

		BoxLayout lo = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(lo);

		add(Box.createRigidArea(new Dimension(0, 60)));

		add(label);

		add(Box.createRigidArea(new Dimension(0, 40)));

		add(new JPanel() {
			{
				setOpaque(false);
				setAlignmentX(CENTER_ALIGNMENT);
				add(mode11);
				add(mode23);
				setMaximumSize(getPreferredSize());
			}
		});

		add(Box.createRigidArea(new Dimension(0, 40)));

		add(instructionsButton);
		synchronized (frame.actions) {
			frame.actions.notifyAll();
		}
	}
}
