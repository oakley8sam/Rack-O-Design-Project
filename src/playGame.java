import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collection;

public class playGame {
	public static void main (String [] args){
		int numPlay;
		Game g1;
		g1= new Game();
		g1.newGame();
		/*Scanner s=new Scanner(System.in);
		System.out.println("How many players are there? (2-4)");
		numPlay=s.nextInt();
		Player p1= new Player();
		Player p2= new Player();
		if (numPlay>=3){
			Player p3= new Player();
		}
		if (numPlay==4){
			Player p4= new Player();
		}*/
		//g1.newGame(numPlay);
		System.out.println(g1.getDraw());
		g1.newHand();
		
		System.out.println(g1.getPlayer1().getRack());
		System.out.println(g1.getPlayer2().getRack());
		System.out.println(g1.getDraw());
		g1.getPlayer1().drawDraw();
		System.out.println(g1.getPlayer1().getHand());
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
