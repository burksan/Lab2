package pkgCore;

import java.util.Collections;
import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck(int NumofDeck) {

		for (int deck = 1; deck < NumofDeck; deck++) {
			for (eRank eRank : pkgEnum.eRank.values()) {
				for (eSuit eSuit : pkgEnum.eSuit.values()){
					cards.add(new Card(eSuit, eRank));}
				}
		}
		Collections.shuffle(cards);
	}
	public Deck() {
		this(1);
	}




	// TODO: Add a draw() method that will take a card from the deck and
	// return it to the caller

	public Card draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception ("Deck is empty!");
		}
		return (cards.remove(0));
	}
	
	public int DeckSize() {
		return this.cards.size();
	}
}