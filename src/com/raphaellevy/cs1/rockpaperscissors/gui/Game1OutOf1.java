package com.raphaellevy.cs1.rockpaperscissors.gui;

import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.PAPER;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.ROCK;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.SCISSORS;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import com.raphaellevy.cs1.rockpaperscissors.HelperMethods;
import com.raphaellevy.cs1.rockpaperscissors.RPSListener;

public class Game1OutOf1 implements RPSListener {
	RPSPanel p;
	RPSFrame frame;
	public Game1OutOf1(RPSFrame frame) {
		p = new RPSPanel(frame, this);
	}

	void win() {

	}

	void tie() {

	}

	void lose() {

	}

	@Override
	public void onRock() {
		execute(ROCK);
		int opponentInput = HelperMethods.generateRockPaperScissors();
		switch (opponentInput) {
		case ROCK:
			tie();
		case PAPER:
			lose();
		case SCISSORS:
			win();
		}
	}

	@Override
	public void onPaper() {
		execute(PAPER);
		int opponentInput = HelperMethods.generateRockPaperScissors();
		switch (opponentInput) {
		case ROCK:
			win();
		case PAPER:
			tie();
		case SCISSORS:
			lose();
		}
	}

	@Override
	public void onScissors() {
		execute(SCISSORS);
		int opponentInput = HelperMethods.generateRockPaperScissors();
		switch (opponentInput) {
		case ROCK:
			lose();
		case PAPER:
			win();
		case SCISSORS:
			tie();
		}
	}
	private void execute(int input) {
		p.countdown.setVisible(true);
		p.disableButtons();
		class CountdownAction extends AbstractAction {
			int counter = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				if (counter==3) {
					((Timer)e.getSource()).stop();
					p.enableButtons();
					
				} else {
					System.out.print(counter);
					switch(counter) {
					case 0:
						p.countdown.setText("Rock…");
						p.revalidate();
					case 1:
						p.countdown.setText("Paper…");
						p.revalidate();
						p.repaint();
					case 2:
						p.countdown.setText("Scissors…");
						p.revalidate();
					}
					counter++;
				}
				
			}
			Game1OutOf1 game;
			CountdownAction(Game1OutOf1 game) {
				super();
				this.game=game;
			}
		}
		Timer t = new Timer(1000, new CountdownAction(this));
		t.start();
	}

}
