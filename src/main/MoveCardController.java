package main;
import java.util.ArrayList;


public class MoveCardController {

	private Deck deck;
	private Waste waste;
	
	public MoveCardController(int deckSize) {
		this.deck = new Deck(deckSize);
		this.waste = new Waste();
	}
	
	public int getDeckSize() {
		return this.deck.size();
	}

	public int getWasteSize() {
		return this.waste.size();
	}
	
	public void setWasteTopCard(Card card) {
		this.waste.addCard(card);
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Waste getWaste() {
		return waste;
	}

	public void setWaste(Waste waste) {
		this.waste = waste;
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

	public void moveFromWasteToFoundation(Foundation foundation) {
		Card card = this.waste.getTopCard();
		if (foundation.isCorrect(card)) {
			waste.drawCards(1);
			foundation.addCard(card);
		}
	}

	public void moveFromWasteToDeck() {
		if (this.getDeckSize() == 0) {
			if (this.getWasteSize() != 0) {
				Deck newDeck = new Deck(this.getWasteSize());
				Waste newWaste = new Waste();
				Card newCard;
				int oldWasteSize = this.getWasteSize();
				for (int i = 0; i < oldWasteSize; i++) {
					newCard = this.waste.getTopCard();
					this.waste.getCards().remove(this.waste.getCards().size()-1);
					newDeck.getCards().set(i, newCard);
				}
				this.setDeck(newDeck);
				this.setWaste(newWaste);
			}
		}
	}

}
