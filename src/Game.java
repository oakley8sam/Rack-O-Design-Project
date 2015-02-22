import java.util.Collections;
import java.util.Stack;
public class Game {
	private Stack<Integer> draw;
	private Stack<Integer> discard;
	private int b = 0;
	private int numPlay=0;
	private Player p1;
	private Player p2;
	private Player p3;
	private Player p4;
	public Game(){
		draw = new Stack();
		discard = new Stack();
	}
	public void newGame(Integer n){
		numPlay=n;
		// ask how many players and create a stack for a deck of that many people 
		/*s=new Scanner(System.in);
		System.out.println("How many players are there?");
		numPlay=s.nextInt();
		p1= new Player(null, null, 0);
		p2= new Player(null, null, 0);
		if (numPlay>=3){
			p3= new Player(null,null,0);
		}
		if (numPlay==4){
			p4= new Player(null, null, 0);
		}*/
		do{
			b++;
			draw.push(b);
		} while (b<20+numPlay*10);
	}
	public void newHand(){
		//shuffle and deal 10 to each player
		Collections.shuffle(draw);
		while (draw.size()>20){
			p1.getRack().add(draw.pop());
			p2.getRack().add(draw.pop());
			if (numPlay>=3){
				p3.getRack().add(draw.pop());
			}
			if (numPlay==4){
				p4.getRack().add(draw.pop());
			}
		}
	}
	public void disToDraw(){
		// when the draw pile is empty, move all cards to draw pile and shuffle
		if (draw.size()==0){
			while (discard.size()>0){
				draw.add(discard.pop());
			}
		}
		Collections.shuffle(draw);
	}
	public Stack<Integer> getDraw(){
		//getter for the draw pile
		return draw;
	}
	public Stack<Integer> getDiscard(){
		//getter for the discard pile
		return discard;
	}
	
	public static void main (String[]args)
	{
		Game test = new Game();
		test.newGame(3);
	}	
}

