package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GlobalActions {
	public GlobalActions(RPSFrame frame) {
		this.frame = frame;
	}

	RPSFrame frame;

	public void welcome() {
		frame.setContentPane(new WelcomePanel(frame));
		Timer t = new Timer(4000, new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// frame.after();
				if (frame.getContentPane() instanceof WelcomePanel) {
					newGame();
				}
			}
		});
		t.setRepeats(false);
		t.start();
	}

	public void newGame() {
		if (!(frame.getContentPane() instanceof ModeMenuPanel)) {
			frame.actions.enableAll(frame);
			disposeAll();
			frame.setContentPane(new ModeMenuPanel(frame));
			frame.revalidate();
			frame.repaint();
		}
	}

	public void new1OutOf1() {
		frame.setContentPane(new Game1OutOf1(frame).p);
		frame.revalidate();
		frame.repaint();
	}

	public void new2OutOf3() {
		frame.setContentPane(new Game2OutOf3(frame).p);
		frame.revalidate();
		frame.repaint();
	}

	public void instructions() {
		InstructionsPanel.createPanel(this);
	}

	public void onInstructionsExit() {

	}

	JPanel empty = new JPanel();

	public void disposeAll() {
		frame.setContentPane(empty);
		frame.revalidate();
		frame.repaint();
	}

	public void addActionListener(AbstractButton comp, Runnable r) {
		comp.addActionListener(new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				r.run();
			}

		});
	}

	public Font lato(int size) {
		return new Font("Lato", Font.PLAIN, size);
	}

	public void disableAll(Container comp) {
		comp.setEnabled(false);
		for (Component cp : comp.getComponents()) {
			cp.setEnabled(false);
			if (cp instanceof Container) {
				disableAll((Container) cp);
			}
		}
	}

	public void enableAll(Container comp) {
		comp.setEnabled(true);
		comp.revalidate();
		comp.repaint();
		if (comp instanceof JMenu) {
			for (Component i : ((JMenu) comp).getMenuComponents()) {
				i.setEnabled(true);

			}
		}
		for (Component cp : comp.getComponents()) {
			cp.setEnabled(true);
			cp.revalidate();
			cp.repaint();
			if (cp instanceof Container) {
				enableAll((Container) cp);
			}
		}
	}

	static void invokeLater(int time, Runnable r) {
		Timer t = new Timer(time, new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				r.run();
			}

		});
		t.setRepeats(false);
		t.start();
	}
}
