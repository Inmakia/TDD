import java.util.ArrayList;
import java.util.Random;


public class StartController {
	
	private ArrayList<Foundation> foundations;
	private Waste waste;
	private Deck deck;
	private ArrayList<Tableau> tableaus;
	
	private final int TABLEAUS = 7;
	private final int FOUNDATIONS = 4;
	
	public StartController() {
		this.foundations = new ArrayList<Foundation>();
		for (int i = 0; i < FOUNDATIONS; i++) {
			this.foundations.add(new Foundation());
		}
		this.waste = new Waste();
		this.deck = new Deck();
		this.tableaus = new ArrayList<Tableau>();
		for (int i = 0; i < TABLEAUS; i++) {
			Tableau tableau = new Tableau();
			for (int j = 0; j < i+1; j++) {
				tableau.getCards().add(new Card());
			}
			this.tableaus.add(tableau);
		}
	}

	public boolean isEmptyAllFoundations() {
		boolean empty = true;
		for (Foundation foundation : this.foundations) {
			empty = empty && foundation.isEmpty();
		}
		return empty;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		for (Tableau tableau: tableaus) {
			Card card;
			do {
				card = tableau.peek();
			} while (peeksEachTableau.contains(card));
			peeksEachTableau.add(card);
		}
		return peeksEachTableau;
	}

	public Object getDeckSize() {
		return this.deck.size();
	}

	public boolean isEmptyWaste() {
		return this.waste.isEmpty();
	}

	public ArrayList<Integer> getSizeOfTableaus() {
		ArrayList<Integer> sizes = new ArrayList<Integer>();
		for (Tableau tableau: tableaus) {
			sizes.add(tableau.size());
		}
		return sizes;
	}

}
