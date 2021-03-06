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
		tresDiamante = new Carta(3, "D");
		diezDiamante = new Carta(10, "D");
		queenTrebol = new Carta(13, "T" );
	}
	
	@Test
	public void testCaseConocerElValorDeUnaCarta() {
		assertEquals(tresDiamante.getValor(), 3);
	}
	
	@Test
	public void testCaseConocerElPaloDeUnaCarta() {
		assertEquals(queenTrebol.getPalo(), "T");
	}
	
	@Test
	public void testCaseCompararValoresEntreCartas() {
		assertTrue(queenTrebol.esMayorQueOtraCarta(tresDiamante));
		assertFalse(tresDiamante.esMayorQueOtraCarta(diezDiamante));
	}
	
	@Test
	public void testCaseCompararPalosEntreCartas() {
		assertTrue(diezDiamante.tieneMismoPaloQueOtraCarta(tresDiamante));
		assertFalse(tresDiamante.tieneMismoPaloQueOtraCarta(queenTrebol));
	}
	
	
}
