package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Carta;
import ar.edu.unq.po2.tp7.Jugada;
import ar.edu.unq.po2.tp7.PokerStatus;

public class JugadasTest {
	
	Jugada jugadaA;
	Jugada jugadaB;
	Carta cartaA1;
	Carta cartaA2;
	Carta cartaA3;
	Carta cartaA4;
	Carta cartaA5;
	
	Carta cartaB1;
	Carta cartaB2;
	Carta cartaB3;
	Carta cartaB4;
	Carta cartaB5;	
	
	PokerStatus pokerStatus;
	
	ArrayList<Carta> manoA;
	ArrayList<Carta> manoB;
	
	@BeforeEach
	void setUp() throws Exception {
		cartaA1 = mock(Carta.class);
		cartaA2 = mock(Carta.class);
		cartaA3 = mock(Carta.class);
		cartaA4 = mock(Carta.class);
		cartaA5 = mock(Carta.class);
		
		cartaB1 = mock(Carta.class);
		cartaB2 = mock(Carta.class);
		cartaB3 = mock(Carta.class);
		cartaB4 = mock(Carta.class);
		cartaB5 = mock(Carta.class);
		
		pokerStatus = new PokerStatus();
	}
	@Test
	void testJugada1GanaJugada2PorValor() {
		when(this.cartaA1.getValor()).thenReturn(1);
		when(this.cartaA1.getPalo()).thenReturn("D");
		
		when(this.cartaA2.getValor()).thenReturn(2);
		when(this.cartaA2.getPalo()).thenReturn("P");
		
		when(this.cartaA3.getValor()).thenReturn(3);
		when(this.cartaA3.getPalo()).thenReturn("C");
		
		when(this.cartaA4.getValor()).thenReturn(4);
		when(this.cartaA4.getPalo()).thenReturn("T");

		when(this.cartaA5.getValor()).thenReturn(5);
		when(this.cartaA5.getPalo()).thenReturn("P");
		
		
		when(this.cartaB1.getValor()).thenReturn(10);
		when(this.cartaB1.getPalo()).thenReturn("D");
		
		when(this.cartaB2.getValor()).thenReturn(9);
		when(this.cartaB2.getPalo()).thenReturn("P");
		
		when(this.cartaB3.getValor()).thenReturn(10);
		when(this.cartaB3.getPalo()).thenReturn("C");
		
		when(this.cartaB4.getValor()).thenReturn(4);
		when(this.cartaB4.getPalo()).thenReturn("T");

		when(this.cartaB5.getValor()).thenReturn(6);
		when(this.cartaB5.getPalo()).thenReturn("P");
		
		ArrayList<Carta> manoA = new ArrayList<>(Arrays.asList(cartaA1, cartaA2, cartaA3, cartaA4, cartaA5));
		ArrayList<Carta> manoB = new ArrayList<>(Arrays.asList(cartaB1, cartaB2, cartaB3, cartaB4, cartaB5));
		this.jugadaA = new Jugada(manoA);
		this.jugadaB = new Jugada(manoB);
		
		Jugada ganador = this.pokerStatus.jugadaGanadoraEntre(jugadaA, jugadaB);
		assertEquals(jugadaB, ganador);
	}
	
	
	@Test
	void testPokerGanaATrio() {
		when(this.cartaA1.getValor()).thenReturn(1);
		when(this.cartaA1.getPalo()).thenReturn("D");
		
		when(this.cartaA2.getValor()).thenReturn(1);
		when(this.cartaA2.getPalo()).thenReturn("P");
		
		when(this.cartaA3.getValor()).thenReturn(1);
		when(this.cartaA3.getPalo()).thenReturn("C");
		
		when(this.cartaA4.getValor()).thenReturn(1);
		when(this.cartaA4.getPalo()).thenReturn("T");

		when(this.cartaA5.getValor()).thenReturn(5);
		when(this.cartaA5.getPalo()).thenReturn("P");
		
		
		when(this.cartaB1.getValor()).thenReturn(1);
		when(this.cartaB1.getPalo()).thenReturn("D");
		
		when(this.cartaB2.getValor()).thenReturn(4);
		when(this.cartaB2.getPalo()).thenReturn("P");
		
		when(this.cartaB3.getValor()).thenReturn(4);
		when(this.cartaB3.getPalo()).thenReturn("C");
		
		when(this.cartaB4.getValor()).thenReturn(4);
		when(this.cartaB4.getPalo()).thenReturn("T");

		when(this.cartaB5.getValor()).thenReturn(6);
		when(this.cartaB5.getPalo()).thenReturn("P");
		
		ArrayList<Carta> manoA = new ArrayList<>(Arrays.asList(cartaA1, cartaA2, cartaA3, cartaA4, cartaA5));
		ArrayList<Carta> manoB = new ArrayList<>(Arrays.asList(cartaB1, cartaB2, cartaB3, cartaB4, cartaB5));
		
		this.jugadaA = new Jugada(manoA);
		this.jugadaB = new Jugada(manoB);
		
		Jugada ganador = this.pokerStatus.jugadaGanadoraEntre(jugadaA, jugadaB);
		assertEquals(jugadaA, ganador);

		
	}
}
