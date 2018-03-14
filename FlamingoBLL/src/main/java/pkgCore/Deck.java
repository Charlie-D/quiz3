package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck(int numDecks) {
		for(int i = 0; i < numDecks; i++) {
			for(eSuit j : eSuit.values()) {
				for(eRank k : eRank.values()) {
					cards.add(new Card(j,k));
				}
			}
		}
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}
}
