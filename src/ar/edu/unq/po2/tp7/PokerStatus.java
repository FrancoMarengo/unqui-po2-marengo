package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class PokerStatus {
	
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	String resultado;
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		resultado = "";		
		if(this.hayPoker(cartas)) {
			resultado = "poker";
		}
		else if(this.hayColor(cartas)) {
			resultado = "color";
		}
		else if(this.hayTrio(cartas)) {
			resultado = "trio";			
		}
		return resultado;
	}
	
	private boolean hayPoker(ArrayList<Carta> cartas) {
		return cartas.stream()
				.anyMatch(carta -> this.hayPokerConValor(carta.getValor(), cartas));
	}
	
	private boolean hayPokerConValor(int valorDeCarta, ArrayList<Carta> cartas) {
		return cartas.stream()
				.filter(carta -> valorDeCarta == carta.getValor())
				.count() == 4;

	}
	
	private boolean hayColor(ArrayList<Carta> cartas) {
		return cartas.stream()
				.anyMatch(carta -> this.hayColorConPalo(carta.getPalo(), cartas));
	}
	
	private boolean hayColorConPalo(String paloDeCarta, ArrayList<Carta> cartas) {
		return cartas.stream()
				.filter(carta -> paloDeCarta.equals(carta.getPalo()))
				.count() == 5;
	}	
	
	private boolean hayTrio(ArrayList<Carta> cartas) {
		return cartas.stream()
				.anyMatch(carta -> this.hayTrioConValor(carta.getValor(), cartas));
	}

	private boolean hayTrioConValor(int valorDeCarta, ArrayList<Carta> cartas) {
		return cartas.stream()
				.filter(carta -> valorDeCarta == carta.getValor())
				.count() == 3;

	}
	
	public Jugada jugadaGanadoraEntre(Jugada jugada1, Jugada jugada2) {
		String valorJugada1 = this.verificar(jugada1.getCartas().get(0), jugada1.getCartas().get(1), 
				jugada1.getCartas().get(2), jugada1.getCartas().get(3), jugada1.getCartas().get(4));
		
		String valorJugada2 = this.verificar(jugada2.getCartas().get(0), jugada2.getCartas().get(1), 
				jugada2.getCartas().get(2), jugada2.getCartas().get(3), jugada2.getCartas().get(4));
		
		if (valorJugada1.equals(valorJugada2)) {
			return this.ganadorPorValorEntre(jugada1, jugada2);
		} else {
			return this.ganadorEntre(jugada1, jugada2, valorJugada1, valorJugada2);
		}
	}


	private Jugada ganadorEntre(Jugada jugada1, Jugada jugada2, String valorJugada1, String valorJugada2) {
		if (valorJugada1.equals("poker")) {
			return jugada1;
		} else if (valorJugada1.equals("color") && !(valorJugada2.equals("poker"))) {
			return jugada1;
		} else if (valorJugada1.equals("trio") && valorJugada2.equals("")) {
			return jugada1;
		} else {
			return jugada2;
		}
	}

	private Jugada ganadorPorValorEntre(Jugada jugada1, Jugada jugada2) {
		int valorJugada1 = jugada1.getValorJugada();
		int valorJugada2 = jugada2.getValorJugada();
		
		if (valorJugada1 > valorJugada2) {
			return jugada1;
		} else {
			return jugada2;
		}
	}
}
