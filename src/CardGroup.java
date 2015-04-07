import java.util.ArrayList;

public class CardGroup {

	private ArrayList<Card> cards;
	
	public CardGroup() {
		this.cards = new ArrayList<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

}
