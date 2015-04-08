package main;
import java.util.ArrayList;

public class CardGroup {

	private ArrayList<Card> cards;
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public CardGroup() {
		this.cards = new ArrayList<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public int size() {
		return this.cards.size();
	}
	
	public Card getTopCard() {
		if (!this.getCards().isEmpty()) {
			return this.getCards().get(this.getCards().size()-1);
		}
		return null;
	}
	
	public ArrayList<Card> drawCards(int count) {
		assert this.size() >= count;
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < count; i++) {
			cards.add(this.getCards().remove(this.getCards().size()-1));
		}
		return cards;
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public void addCards(ArrayList<Card> cards) {
		for (Card card : cards) {
			this.addCard(card);
		}
	}

}
