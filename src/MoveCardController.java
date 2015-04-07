
public class MoveCardController {

	private int deckSize, wasteSize;
	
	public MoveCardController(int deckSize, int wasteSize) {
		this.deckSize = deckSize;
		this.wasteSize = wasteSize;
	}

	public void moveFromDeckToWaste() {
		if(this.deckSize >= 3) {
			this.deckSize -= 3;
			this.wasteSize += 3;
		} else if(this.deckSize == 2) {
			this.deckSize -= 2;
			this.wasteSize += 2;
		} else if(this.deckSize == 1) {
			this.deckSize -= 1;
			this.wasteSize += 1;
		} else if(this.deckSize == 0) {
		}
	}

	public int getDeckSize() {
		return this.deckSize;
	}

	public int getWasteSize() {
		return this.wasteSize;
	}

}
