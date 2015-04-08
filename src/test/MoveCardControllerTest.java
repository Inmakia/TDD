package test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import main.Card;
import main.Foundation;
import main.MoveCardController;
import main.Suits;

import org.junit.Before;
import org.junit.Test;


public class MoveCardControllerTest {
		
	MoveCardController moveCardController1, moveCardController2, moveCardController3, moveCardController4, moveCardController5;
	
	@Before
	public void before(){
		moveCardController1 = new MoveCardController(24);
		moveCardController2 = new MoveCardController(3);
		moveCardController3 = new MoveCardController(2);
		moveCardController4 = new MoveCardController(1);
		moveCardController5 = new MoveCardController(0);
	}
	
	@Test
	public void moveFromDeckToWasteTest() {
		int oldSize;
		
		oldSize = moveCardController1.getWasteSize();
		moveCardController1.moveFromDeckToWaste();
		assertTrue(moveCardController1.getDeckSize() == 21);
		assertTrue(moveCardController1.getWasteSize() == oldSize + 3);
		
		oldSize = moveCardController2.getWasteSize();
		moveCardController2.moveFromDeckToWaste();		
		assertTrue(moveCardController2.getDeckSize() == 0);
		assertTrue(moveCardController2.getWasteSize() == oldSize + 3);
		
		oldSize = moveCardController3.getWasteSize();
		moveCardController3.moveFromDeckToWaste();
		assertTrue(moveCardController3.getDeckSize() == 0);
		assertTrue(moveCardController3.getWasteSize() == oldSize + 2);
		
		oldSize = moveCardController4.getWasteSize();
		moveCardController4.moveFromDeckToWaste();
		assertTrue(moveCardController4.getDeckSize() == 0);
		assertTrue(moveCardController4.getWasteSize() == oldSize + 1);		
		
		oldSize = moveCardController5.getWasteSize();
		moveCardController5.moveFromDeckToWaste();
		assertTrue(moveCardController5.getDeckSize() == 0);
		assertTrue(moveCardController5.getWasteSize() == oldSize);		
	}
	
	@Test
	public void moveFromWasteToFoundationTest() {
		Foundation foundation;
		Card card;
		int wasteSize, foundationSize;
		
		
		foundation = new Foundation(Suits.HEARTS);
		card = new Card(Suits.HEARTS, 3);
		moveCardController4.setWasteTopCard(card);
		wasteSize = moveCardController4.getWasteSize();
		foundationSize = foundation.size();
		moveCardController4.moveFromWasteToFoundation(foundation);
		assertTrue(moveCardController4.getWasteSize() == wasteSize);
		assertTrue(foundation.size() == foundationSize);
		assertNotEquals(card, foundation.getTopCard());
		
		foundation = new Foundation(Suits.DIAMONDS);
		card = new Card(Suits.HEARTS, 3);
		moveCardController4.setWasteTopCard(card);
		wasteSize = moveCardController4.getWasteSize();
		foundationSize = foundation.size();
		moveCardController4.moveFromWasteToFoundation(foundation);
		assertTrue(moveCardController4.getWasteSize() == wasteSize);
		assertTrue(foundation.size() == foundationSize);
		assertNotEquals(card, foundation.getTopCard());
		
		foundation = new Foundation(Suits.DIAMONDS);
		card = new Card(Suits.HEARTS, 3);
		moveCardController4.setWasteTopCard(card);
		foundation.addCard(new Card(Suits.DIAMONDS, 1));
		foundation.addCard(new Card(Suits.DIAMONDS, 2));
		wasteSize = moveCardController4.getWasteSize();
		foundationSize = foundation.size();
		moveCardController4.moveFromWasteToFoundation(foundation);
		assertTrue(moveCardController4.getWasteSize() == wasteSize);
		assertTrue(foundation.size() == foundationSize);
		assertNotEquals(card, foundation.getTopCard());
		
		foundation = new Foundation(Suits.HEARTS);
		card = new Card(Suits.HEARTS, 3);
		moveCardController4.setWasteTopCard(card);
		foundation.addCard(new Card(Suits.HEARTS, 1));
		foundation.addCard(new Card(Suits.HEARTS, 2));
		wasteSize = moveCardController4.getWasteSize();
		foundationSize = foundation.size();
		moveCardController4.moveFromWasteToFoundation(foundation);
		assertTrue(moveCardController4.getWasteSize() == wasteSize -1);
		assertTrue(foundation.size() == foundationSize +1);
		assertEquals(card, foundation.getTopCard());
	}
	
	@Test
	public void moveFromWasteToDeckTest() {
		int oldWasteSize;
		ArrayList<Card> cards;
		
		oldWasteSize = moveCardController1.getWasteSize();
		moveCardController1.moveFromWasteToDeck();
		assertFalse(oldWasteSize == moveCardController1.getDeckSize());
		assertTrue(moveCardController1.getWasteSize() == 0);
		
		cards = new ArrayList<Card>();
		cards.add(new Card());
		moveCardController3.getWaste().addCards(cards);
		oldWasteSize = moveCardController3.getWasteSize();
		moveCardController3.moveFromWasteToDeck();
		assertFalse(oldWasteSize == moveCardController3.getDeckSize());
		assertFalse(moveCardController3.getWasteSize() == 0);
		
		oldWasteSize = moveCardController5.getWasteSize();
		moveCardController5.moveFromWasteToDeck();
		assertTrue(oldWasteSize == moveCardController5.getDeckSize());
		assertTrue(moveCardController5.getWasteSize() == 0);
		
		cards = new ArrayList<Card>();
		cards.add(new Card());
		cards.add(new Card());
		cards.add(new Card());
		moveCardController5.getWaste().addCards(cards);
		oldWasteSize = moveCardController5.getWasteSize();
		moveCardController5.moveFromWasteToDeck();
		assertTrue(oldWasteSize == moveCardController5.getDeckSize());
		assertTrue(moveCardController5.getWasteSize() == 0);
		
	}

}
