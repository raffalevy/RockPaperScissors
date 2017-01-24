package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.raphaellevy.cs1.rockpaperscissors.RPSListener;

public class RPSPanel extends RPSContentPane {
	JLabel label;
	ModeButton rockButton;
	ModeButton paperButton;
	ModeButton scissorsButton;
	JLabel countdown;

	public RPSPanel(RPSFrame frame, RPSListener rpslistener) {
		super(frame);

		label = new JLabel("Would you like to play Rock, Paper, or Scissors?");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setFont(frame.actions.lato(32));

		rockButton = new ModeButton("Rock", frame);
		frame.actions.addActionListener(rockButton, rpslistener::onRock);
		paperButton = new ModeButton("Paper", frame);
		frame.actions.addActionListener(paperButton, rpslistener::onPaper);
		scissorsButton = new ModeButton("Scissors", frame);
		frame.actions.addActionListener(scissorsButton, rpslistener::onScissors);

		countdown = new JLabel("Rock…");
		countdown.setFont(frame.actions.lato(72));
		countdown.setHorizontalAlignment(SwingConstants.CENTER);
		countdown.setAlignmentX(CENTER_ALIGNMENT);
		countdown.setVisible(false);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createRigidArea(new Dimension(0, 35)));
		add(label);
		add(Box.createRigidArea(new Dimension(0, 35)));
		add(new JPanel() {
			{
				setOpaque(false);
				setAlignmentX(CENTER_ALIGNMENT);
				add(rockButton);
				add(paperButton);
				add(scissorsButton);
				setMaximumSize(getPreferredSize());
			}
		});
		add(Box.createRigidArea(new Dimension(0, 20)));
		add(countdown);
	}

	public void enableButtons() {
		rockButton.setEnabled(true);
		paperButton.setEnabled(true);
		scissorsButton.setEnabled(true);
	}

	public void disableButtons() {
		rockButton.setEnabled(false);
		paperButton.setEnabled(false);
		scissorsButton.setEnabled(false);
	}
}
