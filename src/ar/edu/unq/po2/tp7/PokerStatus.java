package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class PokerStatus {

	public boolean verificar(String c1, String c2, String c3, String c4, String c5) throws Exception {
		ArrayList<String> mano = new ArrayList<String>();
		mano.add(c1);
		mano.add(c2);
		mano.add(c3);
		mano.add(c4);
		mano.add(c5);
		for(String carta:mano) {
			if(mano.toString().lastIndexOf(carta) != mano.toString().indexOf(carta)) {
				throw new Exception("Error, se encontraron cartas repetidas");
			}
		}
		ArrayList<String> valores = new ArrayList<String>();
		for(String carta:mano) {
			if(carta.length() == 2) {
				valores.add(carta.substring(0, 1));
			} else {
			    valores.add(carta.substring(0, 2));
			}
		}
		for(String valor:valores) {
			int contadorDeValoresRepetidos = 0;
			ArrayList<String> valores2 = new ArrayList<String>();
			valores2.addAll(valores);
			while(!(valores2.isEmpty()) && valores2.contains(valor)) {
					valores2.remove(valor);
					contadorDeValoresRepetidos ++;
			}
			if(contadorDeValoresRepetidos == 4) {
				return(true);
			}
		}
		return(false);
	}
}
