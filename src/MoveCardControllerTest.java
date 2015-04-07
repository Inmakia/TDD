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
		moveCardController1.moveFromDeckToWaste();
		assertTrue(moveCardController1.getDeckSize() == 21);
		assertTrue(moveCardController1.getWasteSize() == 3);
		
		moveCardController2.moveFromDeckToWaste();		
		assertTrue(moveCardController2.getDeckSize() == 0);
		assertTrue(moveCardController2.getWasteSize() == 3);
		
		moveCardController3.moveFromDeckToWaste();
		assertTrue(moveCardController3.getDeckSize() == 0);
		assertTrue(moveCardController3.getWasteSize() == 2);
		
		moveCardController4.moveFromDeckToWaste();
		assertTrue(moveCardController4.getDeckSize() == 0);
		assertTrue(moveCardController4.getWasteSize() == 1);		
		
		moveCardController5.moveFromDeckToWaste();
		assertTrue(moveCardController5.getDeckSize() == 0);
		assertTrue(moveCardController5.getWasteSize() == 0);
		
	}

}
