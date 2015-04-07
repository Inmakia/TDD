import static org.junit.Assert.*;

import java.util.ArrayList;

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
	
	// Para comprobar que es aleatoria
	// Array de 7x52, llamar al controlador diez mil veces y contar cuántas veces ha salido cada carta en los 7.
	// Margen (hay probabilidad de 1/52 de que una carta salga en un tableau). Entre 1-300 de 10000 partidas 
	
	@Test
	public void peeksEachTableauTest() {
		ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();
		assertTrue(startController.isEmptyAllFoundations());
		for (Card card : peeksEachTableau) {
			assertNotNull(card);
			assertTrue(card.uncovered());
			// Comprobar que las cartas son diferentes
		}
	}

}
