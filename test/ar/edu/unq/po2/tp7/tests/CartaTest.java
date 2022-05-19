package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Carta;

public class CartaTest {

	private Carta tresDiamante;
	private Carta diezDiamante;
	private Carta queenTrebol;
	
	@BeforeEach
	public void setUp() {
		tresDiamante = new Carta("3", "D");
		diezDiamante = new Carta("10", "D");
		queenTrebol = new Carta("Q", "T" );
	}
	
	@Test
	public void testCaseConocerElValorDeUnaCarta() {
		assertEquals(tresDiamante.getValor(), "3");
	}
	
	@Test
	public void testCaseConocerElPaloDeUnaCarta() {
		assertEquals(queenTrebol.getPalo(), "T");
	}
	
	@Test
	public void testCaseCompararValoresEntreCartas() {
		assertTrue(queenTrebol.esSuperiorA(tresDiamante));
		assertFalse(tresDiamante.esSuperiorA(diezDiamante));
	}
	
	@Test
	public void testCaseCompararPalosEntreCartas() {
		assertTrue(diezDiamante.tieneMismoPaloQue(tresDiamante));
		assertFalse(tresDiamante.tieneMismoPaloQue(queenTrebol));
	}
	
	
}
