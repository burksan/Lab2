package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private eRank eRank;
	private eSuit eSuit;
	

	public Card( pkgEnum.eSuit eSuit, pkgEnum.eRank eRank) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	

	//			Add a private 'setter' method for eRank and eSuit
	
	public eRank geteRank() {
		return eRank;
	}

	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	public void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
	}
	
}
