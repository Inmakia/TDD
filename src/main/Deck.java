package main;

public class Deck extends CardGroup{

	private final static int INITIAL = 24;
	
	public Deck(int size) {
		for (int i = 0; i < size; i++) {
			this.getCards().add(new Card());
		}
	}
	
	public Deck() {
		this(INITIAL);
	}

}