import java.util.ArrayList;


public class Foundation {

	private ArrayList<Card> cards;
	
	public Foundation() {
		this.cards = new ArrayList<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

}
