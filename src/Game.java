import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;

public class Game {
	private Stack<Integer> draw;
	private Stack<Integer> discard;
	private int b = 0;
	private Player p1;
	private Player p2;
	private Player p3;
	private Player p4;
	int round;

	public Game() {
		draw = new Stack<Integer>();
		discard = new Stack<Integer>();
		round = 0;
	}

	public void newGame(int n) {
		// ask how many players and create a stack for a deck of that many
		// people
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
		draw.clear();
		discard.clear();
		p1.getRack().clear();
		p2.getRack().clear();
		if (n >= 3) {
			p3.getRack().clear();
		}
		if (n == 4){
			p4.getRack().clear();
		}
		do {
			b++;
			draw.push(b);
		} while (b < 20 + n * 10);
		// shuffle and deal 10 to each player
		Collections.shuffle(draw);
		while (draw.size() > 20) {
			p1.getRack().add(draw.pop());
			p2.getRack().add(draw.pop());
			if (n >= 3) {
				p3.getRack().add(draw.pop());
			}
			if (n == 4) {
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
		return p1;
	}

	public Player getPlayer2() {
		return p2;
	}

	public Player getPlayer3() {
		return p3;
	}

	public Player getPlayer4() {
		return p4;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int a) {
		round = a;
	}

}
