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
		this.tableaus = new ArrayList<Tableau>();
		for (int i = 0; i < TABLEAUS; i++) {
			this.tableaus.add(new Tableau());
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
		for (int i = 0; i < TABLEAUS; i++) {
			Card card;
			do {
				Random r = new Random();
				card = new Card(r.nextInt(3), r.nextInt(11));
			} while (peeksEachTableau.contains(card));
			peeksEachTableau.add(card);
		}
		return peeksEachTableau;
	}

	public Object getDeckSize() {
		return 24;
	}

	public boolean isEmptyWaste() {
		return this.waste.isEmpty();
	}

	public ArrayList<Integer> getSizeOfTableaus() {
		ArrayList<Integer> sizes = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			sizes.add(i+1);
		}
		return sizes;
	}

}
