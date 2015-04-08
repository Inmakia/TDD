import java.util.ArrayList;


public class StartController {
	
	private ArrayList<Foundation> foundations;
	private Waste waste;
	private Deck deck;
	private ArrayList<Tableau> tableaus;
	
	private final int TABLEAUS = 7;
	
	public StartController() {
		this.foundations = new ArrayList<Foundation>();
		for (int i = 0; i < Suits.values().length; i++) {
			this.foundations.add(new Foundation(Suits.values()[i]));
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
			peeksEachTableau.add(new Card());
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
