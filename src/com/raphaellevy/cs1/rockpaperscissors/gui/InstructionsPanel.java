package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class InstructionsPanel extends JPanel {
	public static final String INSTRUCTIONS_BODY = "The main menu displays at the start of the game. To get back to the main menu, use Command-N."
			+ "<br><br>From the main menu, choose 1/1 or 2/3. In a 1/1 game the goal is to just win one game, while	 in 2/3 "
			+ "you are trying to win 2 games out of 3. You can also play a 1/1 game by typing Command-1 and a 2/3 "
			+ "game by typing Command-2." + "<br><br>Once you choose an option, you will be given the choice of Rock, "
			+ "Paper, or Scissors. Rock beats Scissors, Scissors beats Paper, and Paper beats Rock. Finally, after you finish your game, "
			+ "you will be given the option to play again.<br><br>"
			+ "To access these instructions again at any time, just type Command-I. If you want to see the source code, type Command-G.";
	public static final String INSTRUCTIONS = "<font face='lato' size='14'> <center>How to play</center></font><br>"
			+ "<font face='lato' size='5'>" + INSTRUCTIONS_BODY + "</font>";
	GlobalActions act;

	public static void createPanel(GlobalActions act) {
		JFrame iframe = new JFrame("Instructions");
		iframe.setContentPane(new InstructionsPanel(act));
		iframe.pack();
		iframe.setResizable(false);
		iframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		iframe.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {

			}

			@Override
			public void windowClosing(WindowEvent e) {
				iframe.dispose();
				act.onInstructionsExit();
			}

			@Override
			public void windowClosed(WindowEvent e) {

			}

			@Override
			public void windowIconified(WindowEvent e) {

			}

			@Override
			public void windowDeiconified(WindowEvent e) {

			}

			@Override
			public void windowActivated(WindowEvent e) {

			}

			@Override
			public void windowDeactivated(WindowEvent e) {

			}

		});
		iframe.setJMenuBar(act.frame.getJMenuBar());
		iframe.setVisible(true);
	}

	private InstructionsPanel(GlobalActions act) {
		super();
		this.act = act;
		this.setPreferredSize(new Dimension(610, 450));
		this.setLayout(null);
		JTextPane tp = new JTextPane();
		tp.setEditable(false);
		tp.setFont(act.lato(14));
		tp.setContentType("text/html");
		tp.setText(INSTRUCTIONS);
		tp.setBounds(10, 10, 590, 430);
		tp.setOpaque(false);
		this.add(tp);
	}
}
