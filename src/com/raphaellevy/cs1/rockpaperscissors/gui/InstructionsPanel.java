package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InstructionsPanel extends JPanel {
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
		iframe.setVisible(true);
	}
	private InstructionsPanel(GlobalActions act) {
		super();
		this.act = act;
	}
}
