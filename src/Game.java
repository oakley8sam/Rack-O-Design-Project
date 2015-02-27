import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Stack;

public class Game {
	private Stack<Integer> draw;
	private Stack<Integer> discard;
	private String deckReplace;
	private Player p1;
	private Player p2;
	private Player p3;
	private Player p4;
	int round;

	public Game() {
		//creates a game with a deck for the draw pile, and an initially empty deck for the discard pile
		draw = new Stack<Integer>();
		discard = new Stack<Integer>();
		round = 0;
	}

	public void newGame(int n) {
		// ask how many players
		p1 = new Player(this);
		p2 = new Player(this);
		if (n >= 3) {
			p3 = new Player(this);
		}
		if (n == 4) {
			p4 = new Player(this);
		}
	}

	public void newHand(int n) {
		int b = 0;
		//empties hands and decks if they are filled with any values in order to start a new hand
		//creates a deck and deals to all players based on number of players entered by the user
		draw.clear();
		discard.clear();
		if (n==2){
			p1.getRack().clear();
			p2.getRack().clear();
		}
		if (n == 3) {
			p1.getRack().clear();
			p2.getRack().clear();
			p3.getRack().clear();
		}
		if (n == 4){
			p1.getRack().clear();
			p2.getRack().clear();
			p3.getRack().clear();
			p4.getRack().clear();
		}
		do {
			b++;
			draw.push(b);
		} while (b < 20 + n * 10);
		// shuffle and deal 10 to each player
		Collections.shuffle(draw);
		
		while (draw.size() > 20) {
			if (n== 2){
				p1.getRack().add(draw.pop());
				p2.getRack().add(draw.pop());
			}
			if (n == 3) {
				p1.getRack().add(draw.pop());
				p2.getRack().add(draw.pop());
				p3.getRack().add(draw.pop());
			}
			if (n == 4) {
				p1.getRack().add(draw.pop());
				p2.getRack().add(draw.pop());
				p3.getRack().add(draw.pop());
				p4.getRack().add(draw.pop());
			}
		}
	}

	public void disToDraw() {
		// when the draw pile is empty, move all cards to draw pile and shuffle
		if (draw.size() == 0) {
			while (discard.size() > 0) {
				draw.add(discard.pop());
			}
		}
		deckReplace = "The draw pile was emptied, so the discard pile is being reshuffled into the draw pile.";
		JOptionPane.showMessageDialog(null, deckReplace);
		Collections.shuffle(draw);
		
	}

	public Stack<Integer> getDraw() {
		// getter for the draw pile
		return draw;
	}

	public Stack<Integer> getDiscard() {
		// getter for the discard pile
		return discard;
	}

	public Player getPlayer1() {
		//getter for player 1
		return p1;
	}

	public Player getPlayer2() {
		//getter for player 2
		return p2;
	}

	public Player getPlayer3() {
		//getter for player 3
		return p3;
	}

	public Player getPlayer4() {
		//getter for player 4
		return p4;
	}

	public int getRound() {
		//getter for round
		return round;
	}

	public void setRound(int a) {
		//setter for round
		round = a;
	}

}
