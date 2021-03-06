package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.raphaellevy.cs1.rockpaperscissors.RockPaperScissors;

public class RPSFrame extends JFrame {
	public static final int WINDOW_WIDTH = 740;
	public static final int WINDOW_HEIGHT = 470;

	private RPSMenuBar menuBar;

	private JPanel panel = null;

	public RPSFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new RPSWindowListener());
		this.actions = new GlobalActions(this);
		menuBar = new RPSMenuBar(this);
		setJMenuBar(menuBar);
		setVisible(true);
	}

	GlobalActions actions;

	public static void runApp() {
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Rock Paper Scissors");
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		com.apple.eawt.Application.getApplication()
				.setDockIconImage(new ImageIcon(RockPaperScissors.class.getResource("/assets/icon.png")).getImage());
		try {
			// File f = new
			// File(RockPaperScissors.class.getResource("/assets/Lato-Regular.ttf").getFile());
			// GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(Font.createFont(Font.TRUETYPE_FONT,
			// f));
			GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(Font.createFont(Font.TRUETYPE_FONT,
					RockPaperScissors.class.getResourceAsStream("/assets/Lato-Regular.ttf")));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RPSFrame frame = new RPSFrame();
		synchronized (frame.actions) {
			frame.actions.notifyAll();
		}
		frame.actions.welcome();
		frame.pack();

	}

	// void after() {
	// setContentPane(new ModeMenuPanel(this));
	// pack();
	// revalidate();
	// repaint();
	// }

}
