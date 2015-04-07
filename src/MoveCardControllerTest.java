import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class MoveCardControllerTest {
		
	MoveCardController moveCardController1, moveCardController2, moveCardController3, moveCardController4, moveCardController5;
	ArrayList<Card> deck, waste;
	
	@Before
	public void before(){
		moveCardController1 = new MoveCardController(24, 0);
		moveCardController2 = new MoveCardController(3, 0);
		moveCardController3 = new MoveCardController(2, 0);
		moveCardController4 = new MoveCardController(1, 0);
		moveCardController5 = new MoveCardController(0, 0);
		deck = new ArrayList<Card>();
		waste = new ArrayList<Card>();
	}
	
	@Test
	public void moveFromDeckToWasteTest() {
		int oldDeck; 
		oldDeck = moveCardController1.getDeckSize();
		moveCardController1.moveFromDeckToWaste();
		assertEquals(21, oldDeck-3);
		moveCardController2.moveFromDeckToWaste();
		moveCardController3.moveFromDeckToWaste();
		moveCardController4.moveFromDeckToWaste();
		moveCardController5.moveFromDeckToWaste();
	}

}
