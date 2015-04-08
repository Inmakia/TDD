package main;

public class Card {

	private Suits suit;
	private int number;
	
	public Card(Suits suit, int number) {
		this.setNumber(number);
		this.setSuit(suit);
	}

	public Card() {
	}

	public boolean uncovered() {
		return true;
	}

	public Suits getSuit() {
		return suit;
	}

	public void setSuit(Suits suit) {
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

}
