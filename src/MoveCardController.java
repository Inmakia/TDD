import java.util.ArrayList;


public class MoveCardController {

	private Deck deck;
	private Waste waste;
	
	public MoveCardController(int deckSize) {
		this.deck = new Deck(deckSize);
		this.waste = new Waste();
	}

	public void moveFromDeckToWaste() {
		if(this.deck.size() >= 3) {
			ArrayList<Card> cards = this.deck.drawCards(3);
			this.waste.addCards(cards);
		} else if(deck.size() == 2) {
			ArrayList<Card> cards = this.deck.drawCards(2);
			this.waste.addCards(cards);
		} else if(deck.size() == 1) {
			ArrayList<Card> cards = this.deck.drawCards(1);
			this.waste.addCards(cards);
		} else if(deck.size() == 0) {
		}
	}
	
	public int getDeckSize() {
		return this.deck.size();
	}

	public int getWasteSize() {
		return this.waste.size();
	}

	public void moveFromWasteToFoundation(Foundation foundation) {
		Card card = this.waste.getTopCard();
		if (foundation.isCorrect(card)) {
			waste.drawCards(1);
			foundation.addCard(card);
		}
	}

	public void setWasteTopCard(Card card) {
		this.waste.addCard(card);
	}

}
