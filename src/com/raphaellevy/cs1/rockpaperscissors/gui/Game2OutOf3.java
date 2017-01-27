package com.raphaellevy.cs1.rockpaperscissors.gui;

import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.PAPER;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.ROCK;
import static com.raphaellevy.cs1.rockpaperscissors.GameConstants.SCISSORS;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import com.raphaellevy.cs1.rockpaperscissors.HelperMethods;
import com.raphaellevy.cs1.rockpaperscissors.RPSListener;

public class Game2OutOf3 implements RPSListener {
	RPSFrame frame;
	RPSPanel p;
	int roundsWon = 0;
	int roundsLost = 0;

	public Game2OutOf3(RPSFrame frame) {
		p = new RPSPanel(frame, this);
		this.frame = frame;
	}

	void askPlayAgain() {
		Timer t = new Timer(2000, new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// frame.actions.disableAll(frame);
				// frame.actions.enableAll(frame);
				if (frame.getContentPane().equals(p)) {
					int i = JOptionPane.showOptionDialog(frame, "Would you like to play again?", "Play Again",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
					switch (i) {
					case JOptionPane.YES_OPTION:
						frame.actions.enableAll(frame);
						frame.actions.enableAll(frame.getJMenuBar());
						frame.actions.enableAll(frame.getJMenuBar().getMenu(0));
						frame.actions.newGame();
						break;
					case JOptionPane.NO_OPTION:
						System.exit(0);
						break;
					}
				}
			}
		});
		t.setRepeats(false);
		t.start();
	}

	@Override
	public void onRock() {
		execute(ROCK);
	}

	public void continueRock() {
		int opponentInput = HelperMethods.generateRockPaperScissors();
		sayWhatOpponentPlayed(opponentInput);
		switch (opponentInput) {
		case ROCK:
			tie();
			return;
		case PAPER:
			lose();
			return;
		case SCISSORS:
			win();
			return;
		}
	}

	@Override
	public void onPaper() {
		execute(PAPER);
	}

	public void continuePaper() {
		int opponentInput = HelperMethods.generateRockPaperScissors();
		sayWhatOpponentPlayed(opponentInput);
		switch (opponentInput) {
		case ROCK:
			win();
			return;
		case PAPER:
			tie();
			return;
		case SCISSORS:
			lose();
			return;
		}
	}

	@Override
	public void onScissors() {
		execute(SCISSORS);
	}

	public void continueScissors() {
		int opponentInput = HelperMethods.generateRockPaperScissors();
		sayWhatOpponentPlayed(opponentInput);
		switch (opponentInput) {
		case ROCK:
			lose();
			return;
		case PAPER:
			win();
			return;
		case SCISSORS:
			tie();
			return;
		}
	}

	private void execute(int input) {
		p.countdown.setVisible(true);
		p.disableButtons();
		class CountdownAction extends AbstractAction {
			volatile int counter = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				switch (counter) {

				case 0:
					p.countdown.setText("Rock…");
					p.revalidate();
					p.repaint();
					break;
				case 1:
					p.countdown.setText("Paper…");
					p.revalidate();
					p.repaint();
					break;
				case 2:
					p.countdown.setText("Scissors…");
					p.revalidate();
					p.repaint();
					break;
				case 3:
					p.countdown.setText("Shoot!");
					p.revalidate();
					p.repaint();
					break;
				case 4:
					((Timer) e.getSource()).stop();
					switch (input) {
					case ROCK:
						continueRock();
						break;
					case PAPER:
						continuePaper();
						break;
					case SCISSORS:
						continueScissors();
						break;
					}
					return;
				}
				counter++;

			}

			Game2OutOf3 game;

			CountdownAction(Game2OutOf3 game) {
				super();
				this.game = game;
			}
		}
		Timer t = new Timer(1000, new CountdownAction(this));
		t.start();
	}

	public void sayWhatOpponentPlayed(int rps) {
		p.countdown.setFont(frame.actions.lato(48));
		switch (rps) {
		case ROCK:
			p.countdown.setText("The opponent played Rock!");
			break;
		case PAPER:
			p.countdown.setText("The opponent played Paper!");
			break;
		case SCISSORS:
			p.countdown.setText("The opponent played Scissors!");
			break;
		}
		p.revalidate();
		p.repaint();
	}

	void win() {
		GlobalActions.invokeLater(1800, () -> {
			roundsWon++;
			p.countdown.setText("You win this round! Score " + roundsWon + " to " + roundsLost);
			GlobalActions.invokeLater(1800, () -> {
				logic();
			});
		});
	}

	void tie() {
		GlobalActions.invokeLater(1800, () -> {
			p.countdown.setText("This round is a tie! Score " + roundsWon + " to " + roundsLost);
			GlobalActions.invokeLater(1800, () -> {
				logic();
			});
		});
	}

	void lose() {
		GlobalActions.invokeLater(1800, () -> {
			roundsLost++;
			p.countdown.setText("You lose this round… Score " + roundsWon + " to " + roundsLost);
			GlobalActions.invokeLater(1800, () -> {

				logic();
			});
		});
	}

	void logic() {
		if (roundsWon >= 2) {
			gameWon();
		} else if (roundsLost >= 2) {
			gameLost();
		} else {
			p = new RPSPanel(frame, this);
			frame.setContentPane(p);
			frame.revalidate();
			frame.repaint();
		}
	}

	void gameLost() {
		p.countdown.setText("Oh no… You lost the game!");
		askPlayAgain();
	}

	void gameWon() {
		p.countdown.setText("Congratulations! You won!");
		askPlayAgain();
	}
}
