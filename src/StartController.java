import java.util.ArrayList;
import java.util.Random;


public class StartController {
	
	private ArrayList<ArrayList<Card>> foundations;
	private ArrayList<Card> waste;
	private ArrayList<Card> deck;
	private ArrayList<ArrayList<Card>> tableaus;
	
	public StartController() {
		this.foundations = new ArrayList<ArrayList<Card>>();
		for (int i = 0; i < 4; i++) {
			this.foundations.add(new ArrayList<Card>());
		}
		this.waste = new ArrayList<Card>();
		this.tableaus = new ArrayList<ArrayList<Card>>();
		for (int i = 0; i < 7; i++) {
			this.tableaus.add(new ArrayList<Card>());
		}
	}

	public boolean isEmptyAllFoundations() {
		boolean empty = true;
		for (ArrayList<Card> foundation : this.foundations) {
			empty = empty && foundation.isEmpty();
		}
		return empty;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		for (int i = 0; i < 7; i++) {
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
