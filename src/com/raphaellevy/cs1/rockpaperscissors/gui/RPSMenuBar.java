package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class RPSMenuBar extends JMenuBar {
	public RPSMenuBar() {
		JMenu game = new JMenu("Game");
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.META_DOWN_MASK));
		game.add(newGame);

		JMenuItem newGame11 = new JMenuItem("New 1/1 Game");
		newGame11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, KeyEvent.META_DOWN_MASK));
		game.add(newGame11);

		JMenuItem newGame23 = new JMenuItem("New 2/3 Game");
		newGame23.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, KeyEvent.META_DOWN_MASK));
		game.add(newGame23);

		add(game);

		JMenu help = new JMenu("Help");

		JMenuItem instructions = new JMenuItem("Instructions");
		instructions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.META_DOWN_MASK));
		help.add(instructions);

		help.addSeparator();

		JMenuItem doc = new JMenuItem("Code Documentation");
		doc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.META_DOWN_MASK));
		help.add(doc);

		JMenuItem git = new JMenuItem("Github Repository");
		git.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.META_DOWN_MASK));
		git.setAction(new Action() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://github.com/raffalevy/RockPaperScissors"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public Object getValue(String key) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void putValue(String key, Object value) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setEnabled(boolean b) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void addPropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public void removePropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub

			}

		});
		help.add(git);

		add(help);
	}
}