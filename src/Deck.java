
public class Deck extends CardGroup{

	private final int INITIAL = 24;
	
	public Deck() {
		for (int i = 0; i < INITIAL; i++) {
			this.getCards().add(new Card());
		}
	}

}