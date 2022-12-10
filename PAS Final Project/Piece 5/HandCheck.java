import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HandCheck {

	
	public ArrayList<Integer> sorted(ArrayList<Card> newList2) {
		ArrayList<Integer> ranks = new ArrayList<>();
		for (Card card : newList2) {
			ranks.add(card.checkRank());
		}
		Collections.sort(ranks);
		return ranks;
	}

	//method needed for flush
	public ArrayList<Integer> sortedSuit(ArrayList<Card> newList2) {
		ArrayList<Integer> suits = new ArrayList<>();
		for (Card card : newList2) {
			suits.add(card.checkSuit());
		}
		Collections.sort(suits);
		return suits;
	}

	//logic to check if a pair exists
	public boolean isPair(ArrayList<Card> newList) {
		ArrayList<Integer> tempList = sorted(newList);
		if (tempList.get(0) == tempList.get(1)) {
			if (tempList.get(2) == tempList.get(3)) {
				return false;
			}
			if (tempList.get(2) == tempList.get(4)) {
				return false;
			}
			if (tempList.get(3) == tempList.get(4)) {
				return false;
			}
			if (Collections.frequency(tempList, tempList.get(0)) == 2) {
				return true;
			}
			return false;
		}

		if (tempList.get(1) == tempList.get(2)) {
			if (tempList.get(3) == tempList.get(4)) {
				return false;
			}
			if (Collections.frequency(tempList, tempList.get(1)) == 2) {
				return true;
			}
			return false;
		}

		if (tempList.get(2) == tempList.get(3)) {
			if (Collections.frequency(tempList, tempList.get(2)) == 2) {
				return true;
			}
			return false;
		}

		if (tempList.get(3) == tempList.get(4)) {
			return true;
		}

		return false;
	}

	//checks for pair in hand
	public boolean twoPair(ArrayList<Card> hand) {
		ArrayList<Integer> tempList = sorted(hand);
		if (tempList.get(0) == tempList.get(1)) {
			if (tempList.get(2) == tempList.get(3)) {
				if (Collections.frequency(tempList, tempList.get(0)) == 2) {
					if (Collections.frequency(tempList, tempList.get(3)) == 2) {
						return true;
					}
					return false;
				}
				return false;
			}
			if (tempList.get(3) == tempList.get(4)) {
				return true;
			}
			return false;
		}

		if (tempList.get(1) == tempList.get(2)) {
			if (tempList.get(3) == tempList.get(4)) {
				if (Collections.frequency(tempList, tempList.get(1)) == 2) {
					return true;
				}
			}
		}

		return false;
	}

	//checks for three of a kind
	public boolean isThree(ArrayList<Card> hand) {
		ArrayList<Integer> tempList = sorted(hand);
		if (tempList.get(0) == tempList.get(1)) {
			if (tempList.get(1) == tempList.get(2)) {
				if (Collections.frequency(tempList, tempList.get(2)) == 3) {
					if (tempList.get(3) != tempList.get(4)) {
						return true;
					}
				}
			}
			return false;

		}

		if (tempList.get(1) == tempList.get(2)) {
			if (tempList.get(2) == tempList.get(3)) {
				if (Collections.frequency(tempList, tempList.get(3)) == 3) {
					return true;
				}
			}
			return false;
		}

		if (tempList.get(2) == tempList.get(3)) {
			if (tempList.get(3) == tempList.get(4)) {
				return true;
			}
		}

		return false;
	}
	
	//checks for four of a kind
	public boolean isFour(ArrayList<Card> hand) {
		ArrayList<Integer> tempList = sorted(hand);
		if (Collections.frequency(tempList, tempList.get(2)) == 4) {
			return true;
		}

		return false;
	}
	
	//checks for full house
	public boolean fullHouse(ArrayList<Card> hand) {
		ArrayList<Integer> tempList = sorted(hand);

		if (Collections.frequency(tempList, tempList.get(2)) != 3) {
			return false;
		}
		if (Collections.frequency(tempList, tempList.get(0)) == 2) {
			return true;
		}
		if (Collections.frequency(tempList, tempList.get(4)) == 2) {
			return true;
		}

		return false;
	}
	
	//checks for flush
	public boolean flush(ArrayList<Card> hand) {
		ArrayList<Integer> tempList = sortedSuit(hand);
		if (Collections.frequency(tempList, tempList.get(0)) == 5) {
			return true;
		}
		return false;
	}

	//checks for straight
	public boolean straight(ArrayList<Card> hand) {
		ArrayList<Integer> tempList = sorted(hand);

		if ((tempList.get(0) + 1) == (tempList.get(1))) {
			if ((tempList.get(1) + 1) == (tempList.get(2))) {
				if ((tempList.get(2) + 1) == (tempList.get(3))) {
					if ((tempList.get(3) + 1) == tempList.get((4))) {
						return true;
					}
				}
			}
		}

		if (tempList.get(4) == 14) {
			for (int i = 0; i < 4; i++) {
				if (tempList.get(i) != i + 2) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean straightFlush(ArrayList<Card> hand) {
		return straight(hand) && flush(hand);
	}

	//checks for hand with no matches of any kind in it
	public boolean checkAll(ArrayList<Card> hand) {
		if (isPair(hand) == false) {
			if (twoPair(hand) == false) {
				if (isThree(hand) == false) {
					if (isFour(hand) == false) {
						if (fullHouse(hand) == false) {
							if (straight(hand) == false) {
								if (straightFlush(hand) == false) {
									if (royalFlush(hand) == false) {
										return true;
									}
								}
							}
						}
					}
				}
			}
		}

		return false;

	}
	
	//checks for royal flush
	public boolean royalFlush(ArrayList<Card> hand) {
		if (!straightFlush(hand)) {
			return false;
		}
		ArrayList<Integer> tempList = sorted(hand);
		if (tempList.get(2) == 12) {
			return true;
		}
		return false;
	}

	public void printCards(ArrayList<Card> cards) {
		for (Card i : cards) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	double counter1 = 0;
	double counter2 = 0;
	double counter3 = 0;
	double counter4 = 0;
	double counter5 = 0;
	double counter6 = 0;
	double counter7 = 0;
	double counter8 = 0;
	double counter9 = 0;
	double counter10 = 0;

	public void printResults(ArrayList<Card> hand) {
		for (int i = 0; i < 10000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (isPair(testHand) == true) {
				counter1++;
			}
		}
		System.out.println("Pair %: " + ((counter1) / 10000));

		for (int i = 0; i < 10000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (twoPair(testHand) == true) {
				counter2++;
			}
		}
		System.out.println("Two Pairs %: " + ((counter2) / 10000));

		for (int i = 0; i < 10000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (isThree(testHand) == true) {
				counter3++;
			}
		}
		System.out.println("Three of a Kind %: " + ((counter3) / 10000));
	
	
		for (int i = 0; i < 10000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (isFour(testHand) == true) {
				counter4++;
			}
		}
		System.out.println("Four of a Kind %: " + ((counter4) / 10000));
		
		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (royalFlush(testHand) == true) {
				counter5++;
			}
		}
		System.out.println("Royal Flush %: " + ((counter5) / 100000));
		
		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (fullHouse(testHand) == true) {
				counter6++;
			}
		}
		System.out.println("Full House %: " + ((counter6) / 100000));
	
		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (straight(testHand) == true) {
				counter7++;
			}
		}
		System.out.println("Chance to receive a straight: " + ((counter7) / 100000));
		
		
		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (flush(testHand) == true) {
				counter8++;
			}
		}
		System.out.println("Flush %: " + ((counter8) / 100000));
		
		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (straightFlush(testHand) == true) {
				counter9++;
			}
		}
		System.out.println("Straight Flush %: " + ((counter9) / 100000));
		
		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			ArrayList<Card> testHand = deck.drawHand();
			if (checkAll(testHand) == true) {
				counter10++;
			}
		}
		System.out.println("None %: " + ((counter10) / 100000));
	}
		
		
	}
