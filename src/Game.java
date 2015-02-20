import java.util.Collections;
import java.util.Stack;
public class Game {
	private Stack<Integer> draw;
	private Stack<Integer> discard;
	public Game (){
		
	}
	public void newGame(){
		// ask how many players and create a stack for a deck of that many people 
	}
	public void newHand(){
		//shuffle and deal 10 to each player
		Collections.shuffle(draw);
		
	}
	public void disToDraw(){
		// when the draw pile is empty, move all cards to draw pile and shuffle
		while (discard.size()>0){
			draw.add(discard.pop());
		}
		Collections.shuffle(draw);
	}
}
