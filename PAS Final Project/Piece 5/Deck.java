import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> deck;
	

	public Deck() {
		deck = new ArrayList<>();
		generateCards();
	}

	//generates cards into deck
	public void generateCards() {
		ArrayList<Card> cards = new ArrayList<Card>();
		String temp = "HDSC";
		String temp2 = "23456789TJQKA";

		for (int j = 0; j < 4; j++)
			for (int i = 0; i < 13; i++)
				cards.add(new Card(temp2.charAt(i), temp.charAt(j)));

		deck = cards;
	}

	//removes cards from deck and ready to be drawed
	public Card draw() {
		if(deck.isEmpty()) {
			return null;
		}

		Random random = new Random();
		int random1 = random.nextInt(deck.size());

		return deck.remove(random1);
	}
	
	//puts earlier removed cards into hand
	public ArrayList<Card> drawHand() {
		ArrayList<Card> hand = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			hand.add(draw());
		}
		return hand;
	}


	@Override
	public String toString() {
		String filler = "";
		for (Card test1 : deck) {
			filler += test1 + " ";
		}
		return filler;
	}

}

