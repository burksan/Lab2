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
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			
			switch (c.geteRank())
			{
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
				iScore[0] = iScore[0] + c.geteRank().getiRankNbr();
				iScore[1] = iScore[0] + c.geteRank().getiRankNbr();
				break;
			case JACK:
			case QUEEN:
			case KING:
				iScore[0] = iScore[0] + 10;
				iScore[1] = iScore[0] + 10;
				break;
			case ACE:
				iScore[0] = iScore[0] + 1;
				iScore[1] = iScore[0] + 11;
				break;
			}}
	
				
			
			
			
	/*		
		int score = 0;
			switch(c.geteRank().getiRankNbr()) {
			case 1:{
				iScore[0] = iScore[0] + 1;}
			break;
			case 2: {
				iScore[0] = iScore[0] + 2;}
			break;
			case 3: {
				iScore[0] = iScore[0] + 3;}
			break;
			case 4:{
				iScore[0] = iScore[0] + 4;}
			break;
			case 5:{
				iScore[0] = iScore[0] + 5;}
			break;
			case 6:{
				iScore[0] = iScore[0] + 6;}
			break;
			case 7:{
				iScore[0] = iScore[0] + iScore[0] + 7;}
			break;
			case 8:{
				iScore[0] = iScore[0] + iScore[0] + 8;}
			break;
			case 9:{
				iScore[0] = iScore[0] + iScore[0] + 9;}
			break;
			case 10:{
				iScore[0] = iScore[0] + 10;}
			break;
			case 11:{
				iScore[0] = iScore[0] + 10;}
			break;
			case 12:{
				iScore[0] = iScore[0] + 10;}
			break;
			case 13:{
				iScore[0] = iScore[0] + 10;}
			break;
			case 14:{
				iScore[0] = iScore[0] + 1;
				iScore[1] = iScore[0] + 11;}
			break;}} */

		return iScore;}
		
		/*for (Card c: cards)
			if (c.geteRank().getiRankNbr() == 14) {
				int[] iTotal;
				iTotal = iScore;
				if (iScore[0] > 10) {
					iTotal[0] = iScore[0] + 1;}
					else {if (c.geteRank().getiRankNbr() == 14) {
						if (iScore[0] <= 10) {
							iTotal[0] = iScore[0] + 11;}
					}
				}}
		return iTotal;}
		*/
		
	
				////if (iScore <= 10; iScore += 11); (iScore > 10; iScore += 1)
				//iScore[0] = iScore[0] + 1;
				//iScore[1] = iScore[1] + 11;}
	
		
	public void Draw(Deck d) throws Exception
	{
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
