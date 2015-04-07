import java.util.ArrayList;


public class Waste {

	private ArrayList<Card> cards;
	
	public Waste() {
		this.cards = new ArrayList<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

}