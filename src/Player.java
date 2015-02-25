import java.util.ArrayList;
import java.util.Scanner;
public class Player {
	private Game g1;
	private ArrayList<Integer> hand;
	private ArrayList<Integer> rack;
	private int score;
	private int handscore = 0;
	private Scanner scan;
	private int swap;
	//ints k and j are used to scan racks for scores at the end of each hand
	private int k=0;
	private int j=-1;
	/*public Player(ArrayList<Integer> h, ArrayList<Integer> r, int s){
		hand=h; //the value to player is currently waiting to swap or discard
		rack=r; //the ten cards in front of a player
		score=s;
	}*/
	public Player(Game a){
		g1 = a;
		hand = new ArrayList<Integer>();//the value to player is currently waiting to swap or discard
		rack = new ArrayList<Integer>();//the ten cards in front of a player
		score=0;
	}
	public void drawDraw(){
		//draw from the drawstack
		hand.add(g1.getDraw().pop());
	}
	public void drawDiscard(){
		//put unwanted card on top of discard pile
		hand.add(g1.getDiscard().pop());
	}
	public void swap(){
		//changes desired card in rack with card in hand
		scan=new Scanner(System.in);
		System.out.println("What card would you like to swap (or simply discard the card you just drew).");
		swap=scan.nextInt();
		hand.add(rack.remove(swap-1));
		rack.add(swap-1, hand.remove(0));
		
	}
	public void discardHand(){
		//put unwanted card on top of discard pile
		g1.getDiscard().push(hand.remove(0));
	}
	public boolean rackO(){
		//check to see if a player has "RACK-O" (ascending number array list)
		for (int i=0; i<rack.size(); i++){
			if (rack.get(i+1)<rack.get(i)) {
				return false;
			} 
		}
		return true;
	}
	public int sumScore(){
		//adds player's hand score at end of each round with total score
		if (this.rackO()== true){
			handscore+=75;
		}else{
			//this do/while moves through the player's rack adding five points for every card until it finds a number drop, not gain
			do{
				j++;
				k++;
				handscore+=5;
			}while (rack.get(j)<rack.get(k) && j<rack.size());
			
		}
		//this if statement adds five points if the last card is bigger than the second to last, as the do/while would miss that last card otherwise
		if (rack.get(9)>rack.get(8))
			handscore+=5;
		this.score+=handscore;
		return this.score;
	}
	public int getScore(){
		//shows current player score
		return score;
	}
	public ArrayList<Integer> getRack(){
		//getter for the player's rack
		return rack;
	}
	public ArrayList<Integer> getHand(){
		//getter for the player's hand
		return hand;
	}

	public static void main (String[]args){
		Game a = new Game();
		Player s = new Player(a);
		System.out.println(s.getScore());
	}	
}
