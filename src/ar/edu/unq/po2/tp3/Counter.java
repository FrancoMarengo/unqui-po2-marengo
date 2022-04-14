package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

	// Setter
	public void addNumber(int numero) {
		listaDeNumeros.add(numero);
	}
	
	public int cantidadPares() {
		int contador = 0;
		for (int numero:listaDeNumeros) {
			if ((numero % 2) != 1) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int cantidadImpares() {
		int contador = 0;
		for (int numero:listaDeNumeros) {
			if ((numero % 2) == 1) {
				contador++;
			}
		}
		return contador;
	}
	
	public int cantidadDeMultiplosDe(int unNumero) {
		int contador = 0;
		for (int numero:listaDeNumeros) {
			if ((unNumero % numero) == 0) {
				contador++;
			}
		}
		return contador;
	}
}
