package com.raphaellevy.cs1.rockpaperscissors.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class GlobalActions {
	public GlobalActions(RPSFrame frame) {
		this.frame = frame;
	}
	
	private RPSFrame frame;
	
	public void welcome() {
		frame.setContentPane(new WelcomePanel(frame));
		Timer t = new Timer(4000,new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.after();
			}
			
		});
		t.start();
	}
	
	public void newGame() {
		disposeAll();
		frame.setContentPane(new ModeMenuPanel(frame));
		frame.revalidate();
		frame.repaint();
	}
	public void new1OutOf1() {
		
	}
	public void new2OutOf3() {
		
	}
	public void instructions() {
		
	}
	JPanel empty = new JPanel();
	public void disposeAll() {
		frame.setContentPane(empty);
		frame.revalidate();
		frame.repaint();
	}
	public void addActionListener(AbstractButton comp, Runnable r) {
		new Thread(() -> {
			try {
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			SwingUtilities.invokeLater(() -> {
				comp.addActionListener(new AbstractAction() {

					@Override
					public void actionPerformed(ActionEvent e) {
						r.run();
					}
					
				});
			});
			
		}).start();;
	}
}
