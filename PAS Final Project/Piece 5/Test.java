import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
	
		HandCheck test = new HandCheck();
		int counter = 0;
		
		Deck deck = new Deck();
		ArrayList<Card> hand = deck.drawHand();

		test.printResults(hand);
			}

	}
