package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		for (Card c: cards)
		{
			if(c.getRank() == eRank.ACE) {
				iScore[0]+=1;
				iScore[1]+=11;
			} else {
				if(c.getRank().getiRankNbr()>10) {
					iScore[0]+=10;
					iScore[1]+=10;
				} else {
					iScore[0]+=c.getRank().getiRankNbr();
					iScore[1]+=c.getRank().getiRankNbr();
				}
			}
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
