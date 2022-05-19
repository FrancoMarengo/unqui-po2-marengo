package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class PokerStatus {

	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) throws Exception {
		ArrayList<Carta> mano = new ArrayList<Carta>();
		mano.add(c1);
		mano.add(c2);
		mano.add(c3);
		mano.add(c4);
		mano.add(c5);
		verificarErrorCartasRepetidas(mano);
		return buscarJuegos(mano);
	}
	
	private String buscarJuegos(ArrayList<Carta> mano) {
		ArrayList<String> manoValores = new ArrayList<String>();
		for(Carta carta:mano) {
	    manoValores.add(carta.getValor());
		}
		ArrayList<String> manoValores2 = new ArrayList<String>();
		for(String valor:manoValores) {
			manoValores2.add(valor);
		}
		for(String valor:manoValores) {
			int contadorMismosValores = 0;
		    while(!manoValores2.isEmpty() && manoValores2.contains(valor)) {
		    	manoValores2.remove(valor);
		    	contadorMismosValores ++;
		    }
		    if(contadorMismosValores == 4) {
			    return("Poker");
		    } else if(contadorMismosValores == 3) {
			    return("Trio");
		    }
	    }	
		ArrayList<String> manoPalos = new ArrayList<String>();
		for(Carta carta:mano) {
			manoPalos.add(carta.getPalo());
		}
		ArrayList<String> manoPalos2 = new ArrayList<String>();
		for(String palo:manoPalos) {
			manoPalos2.add(palo);
		}
		for(String palo:manoPalos) {
			int contadorMismosPalos = 0;
			while(!manoPalos2.isEmpty() && manoPalos2.contains(palo)) {
				manoPalos2.remove(palo);
				contadorMismosPalos ++;
		    }
		    if(contadorMismosPalos == 5) {
			    return("Color");
		    }
		}
		return("Nada");
	}
	
	private void verificarErrorCartasRepetidas(ArrayList<Carta> mano) throws Exception {
		for(Carta carta:mano) {
			ArrayList<Carta> mano2 = new ArrayList<Carta>();
			mano2.addAll(mano);
			mano2.remove(carta);
			if(mano2.contains(carta)) {
				throw new Exception("Error, se encontraron cartas repetidas");
			}
		}
	}
}
