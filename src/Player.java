import java.util.ArrayList;
public class Player {
	private ArrayList<Integer> hand;
	private ArrayList<Integer> rack;
	private int score = 0;
	public Player(ArrayList<Integer> h, ArrayList<Integer> r, int s){
		hand=h; //the value to player is currently waiting to swap or discard
		rack=r; //the ten cards in front of a player
		score=s;
	}
	private int drawDraw(){
		//draw from the draw stack
		hand.add(draw.pop());
	}
	private int drawDiscard(){
		//draw from the discard stack
		hand.add(discard.pop());
	}
	private void swap(){
		//changes desired card in rack with card in hand
	}
	private int discardHand(){
		//put unwantted card on top of discard pile
		discard.push(hand.remove(0));
	}
	private boolean rackO(){
		//check to see if a player has "RACK-O" (ascending number array list)
	}
	private int sumScore(){
		//adds player's hand score at end of each round with total score
	}
	private int getScore(){
		//shows current player score
		return score;
	}

}
