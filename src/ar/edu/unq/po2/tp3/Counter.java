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
	
	// Realiza la comparacion de el numero con mayor cantidad de digitos pares en la variable privada
	public int numeroConMayorCantidadDigitosPares() {
		int numeroConMayorCantidadDigitosParesHastaAhora = 0;
		int mayorCantidadDigitosPares = 0;
		for (int numero:listaDeNumeros) {
			if (cantidadDigitosPares(numero) > mayorCantidadDigitosPares) {
				numeroConMayorCantidadDigitosParesHastaAhora = numero;
				mayorCantidadDigitosPares = cantidadDigitosPares(numero);
			}
		}
		return numeroConMayorCantidadDigitosParesHastaAhora;
	}
	
	// Retorna la cantidad de digitos pares de un numero
    private int cantidadDigitosPares(int numero) { 
    	int contadorDigitosPares = 0;
    	int numeroModificado = numero;
    	while (numeroModificado != 0) {
    		if (esPar(numeroModificado % 10)) {
    			contadorDigitosPares++;
    		}
    		numeroModificado = numeroModificado / 10;
    	}
    	return contadorDigitosPares;
    }
    
    // Analiza si el numero pasado es par
    private boolean esPar(int numero) {
    	return ((numero % 2) == 0);
    }
    
    // Recibe dos valores x e y, retorna el mayor numero entre 0 y 1000 multiplo de ambos parametros
    // Verificar si el metodo corresponde a la clase Counter, ya que no se especifica
    public int mayorMultiplo(int x, int y) {
    	int mayorNumeroPosibleHastaAhora = 1000;
    	int numeroAVerificar = 1000;
    	while ((numeroAVerificar > 0) && mayorNumeroPosibleHastaAhora == 1000) {
    		if (esMultiploDeXY(numeroAVerificar, x, y)) {
    			mayorNumeroPosibleHastaAhora = numeroAVerificar;
    		}
    		numeroAVerificar--;
    	}
    	if (numeroAVerificar == 0) {
    		mayorNumeroPosibleHastaAhora = -1;
    	}
    	return mayorNumeroPosibleHastaAhora;
    }
    
    private boolean esMultiploDeXY(int unNumero, int x, int y) {
    	return ((esMultiploDe(unNumero, x)) && (esMultiploDe(unNumero, y)));
    }
    
    private boolean esMultiploDe(int unNumero, int x) {
    	return ((unNumero % x) == 0);
    }
}
