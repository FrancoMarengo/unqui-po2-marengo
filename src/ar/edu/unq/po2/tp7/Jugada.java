package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class Jugada {

private ArrayList<Carta> manoJugada;
	
	public Jugada(ArrayList<Carta> manoJugada) {
		this.manoJugada = manoJugada;
		manoJugada = new ArrayList<>();
	}

	public ArrayList<Carta> getCartas() {
		return this.manoJugada;
	}

	public int getValorJugada() {
		int valorJugada = 0;
		for (Carta carta : this.manoJugada) {
			valorJugada += carta.getValor();
		}
		return valorJugada;
	}        
}
