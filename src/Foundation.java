
public class Foundation extends CardGroup {

	private Suits suit;
	
	public Foundation(Suits suit) {
		this.setSuit(suit);
	}

	public Suits getSuit() {
		return suit;
	}

	public void setSuit(Suits suit) {
		this.suit = suit;
	}

	public boolean isCorrect(Card card) {
		boolean result = false;
		if (card.getSuit().equals(this.getSuit())) {
			if (!this.getCards().isEmpty()) {
				result = card.getNumber() == this.getTopCard().getNumber()+1;
			} else {
				result = card.getNumber() == 1;
			}
		}
		return result;
	}

}
