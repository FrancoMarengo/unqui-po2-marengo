package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
    
	private ArrayList<Integer> arrayDeNumeros = new ArrayList<Integer>();
	
	public void agregarAlArray(int numero) {
		arrayDeNumeros.add(numero);
	}

	public int sumaArray() {
		int sumaHastaAhora = 0;
		for (int numero:arrayDeNumeros) {
			sumaHastaAhora = sumaHastaAhora + numero;
		}
		return sumaHastaAhora;
	}
	
	public int restaArray() {
		int restaHastaAhora = 0;
		for (int numero:arrayDeNumeros) {
			restaHastaAhora = restaHastaAhora - numero;
		}
		return restaHastaAhora;
	}
	
	public int multiplicacionArray() {
		int multiplicacionHastaAhora = 1;
		for (int numero:arrayDeNumeros) {
			multiplicacionHastaAhora = multiplicacionHastaAhora * numero;
		}
		return multiplicacionHastaAhora;
	}
}
