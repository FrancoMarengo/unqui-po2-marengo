package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
    

	public int sumaArray(ArrayList<Integer> lista) {
		int sumaHastaAhora = 0;
		for (int numero:lista) {
			sumaHastaAhora = sumaHastaAhora + numero;
		}
		return sumaHastaAhora;
	}
}
