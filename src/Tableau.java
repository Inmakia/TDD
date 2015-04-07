import java.util.Random;


public class Tableau extends CardGroup {

	public Card peek() {
		Random r = new Random();
		return new Card(r.nextInt(3), r.nextInt(11));
	}
}