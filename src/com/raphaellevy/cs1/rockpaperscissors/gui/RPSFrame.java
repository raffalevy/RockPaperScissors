package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.raphaellevy.cs1.rockpaperscissors.RockPaperScissors;

public class RPSFrame extends JFrame {
	public static final int WINDOW_WIDTH = 740;
	public static final int WINDOW_HEIGHT = 470;
	public Font lato(int size) {
		return new Font("Lato",Font.PLAIN,size);
	};

	private RPSMenuBar menuBar;
	
	private JPanel panel = null;
	
	public RPSFrame() {
		menuBar = new RPSMenuBar();
		setJMenuBar(menuBar);
		setVisible(true);
	}
	
	public static void runApp() {
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Rock Paper Scissors");
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		com.apple.eawt.Application.getApplication().setDockIconImage(new ImageIcon(RockPaperScissors.class.getResource("/assets/icon.png")).getImage());
		try {
			File f = new File(RockPaperScissors.class.getResource("/assets/Lato-Regular.ttf").getFile());
			GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(Font.createFont(Font.TRUETYPE_FONT, f));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		RPSFrame frame = new RPSFrame();
		frame.setContentPane(new ModeMenuPanel(frame));
		frame.pack();
		frame.revalidate();
		
	}
	
}
