package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.PokerStatus;

public class PokerStatusTest {

	private PokerStatus pokerStatus;
	
	@BeforeEach    
	public void setUp() {
		pokerStatus = new PokerStatus();    // setUp
	}
	
	@Test
	public void testCaseVerificarPokerStatusPoker() throws Exception {
		assertEquals(pokerStatus.verificar("QD", "QT", "QC", "5D", "QP"), "Poker");    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusColor() throws Exception {
		assertEquals(pokerStatus.verificar("QD", "10D", "3D", "2D", "7D"), "Color");    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusTrio() throws Exception {
		assertEquals(pokerStatus.verificar("1D", "1C", "QD", "1T", "KP"), "Trio");    // Verify
	}	
	
	@Test
	public void testCaseVerificarPokerStatusSinJuego() throws Exception {
		assertEquals(pokerStatus.verificar("1D", "2T", "QC", "KP", "5P"), "Nada");    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusConCartasRepetidas() {
		try {
			pokerStatus.verificar("1D", "1D", "QC", "KP", "5P");    // Excercise
			fail("Se esperaba un error de cartas repetidas");
		} 
		catch (Exception e) {
			assertEquals(e.getMessage(), "Error, se encontraron cartas repetidas");    // Verify
		}
	}
	// En ninguno de los casos se realiza tearDown, se encarga de eso el GarbageCollector
}
