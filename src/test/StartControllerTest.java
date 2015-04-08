package test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import main.Card;
import main.StartController;

import org.junit.Before;
import org.junit.Test;


public class StartControllerTest {

	StartController startController;
	
	@Before
	public void before(){
		startController = new StartController();
	}
	
	@Test
	public void isEmptyAllFoundationsTest() {
		assertTrue(startController.isEmptyAllFoundations());
	}
	
	@Test
	public void isEmptyWasteTest() {
		assertTrue(startController.isEmptyWaste());
	}
	
	@Test
	public void deskSizeTest() {
		assertEquals(24, startController.getDeckSize());
	}
	
	// Para comprobar que es aleatoria
	// Array de 7x52, llamar al controlador diez mil veces y contar cuántas veces ha salido cada carta en los 7.
	// Margen (hay probabilidad de 1/52 de que una carta salga en un tableau). Entre 1-300 de 10000 partidas 
	
	@Test
	public void sizeOfTableausTest() {
		ArrayList<Integer> sizeOfTableaus = startController.getSizeOfTableaus();
		for (int i = 0; i < sizeOfTableaus.size(); i++) {
			assertTrue(i+1 == sizeOfTableaus.get(i));
		}
	}
	
	@Test
	public void peeksEachTableauTest() {
		ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();
		ArrayList<Card> checkedCards = new ArrayList<Card>();
		assertTrue(startController.isEmptyAllFoundations());
		for (Card card : peeksEachTableau) {
			assertTrue(card.uncovered());
			assertFalse(checkedCards.contains(card));
			checkedCards.add(card);
		}
	}
	
	

}
