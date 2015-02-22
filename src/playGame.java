import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collection;

public class playGame {
	public static void main (String [] args){
		Stack<Integer> draw=new Stack<Integer>();
		Stack<Integer> discard= new Stack<Integer>();
		int numPlay;
		Game g1;
		g1= new Game();
		//g1.newGame();
		Scanner s=new Scanner(System.in);
		System.out.println("How many players are there?");
		numPlay=s.nextInt();
		Player p1= new Player(null, null, 0);
		Player p2= new Player(null, null, 0);
		if (numPlay>=3){
			Player p3= new Player(null,null,0);
		}
		if (numPlay==4){
			Player p4= new Player(null, null, 0);
		}
		g1.newGame(numPlay);
		g1.newHand();
		//starts the game by asking for player number
		//deals cards for new hand
		//asks each player where the want to draw from
		//asks each player which card they want to swap
		//player discards
		//next turn
		//continues until racko
		//scores are tallied
		//new hand
		//repeat until someone has 500 points
	}
}
