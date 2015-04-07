import java.util.ArrayList;


public class Tableau {

	private ArrayList<Card> cards;
	
	public Tableau() {
		this.cards = new ArrayList<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
}