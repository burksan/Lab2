package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

import pkgCore.Card;

public class Hand {

	private int iScore;

	private int[] iTotal;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		boolean bAce = false;
		for (Card c: cards)
		{
			iScore[0] = iScore[0] + c.geteRank().getiCardValueMin();
			if (c.geteRank() == eRank.ACE)
				bAce = true;}
		if (bAce)
			iScore[1] = iScore[0] + 10;
		else
			iScore[1] = iScore[0];
		
		return iScore;}		
	
	public boolean DealerHit() {
		boolean CanHit = false;
		for (int score: ScoreHand()) {
			if (score > 17)
				return false;}
		return true;
	}
	
	public boolean PlayerHit() {
		for (int score: ScoreHand()) {
			if (score < 21)
				return true;}
		return false;
	}
	
	public void Draw(Deck d) throws Exception
	{
		cards.add(d.draw());
	}
	
	private void AddCard(Card c){
		cards.add(c);
	}
	
}
