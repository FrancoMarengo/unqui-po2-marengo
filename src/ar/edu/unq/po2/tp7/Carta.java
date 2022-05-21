package ar.edu.unq.po2.tp7;

public class Carta {

	int valor;
	String palo;
	
	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return this.valor;
	}

	public String getPalo() {
		return this.palo;
	}

	public boolean esMayorQueOtraCarta(Carta carta) {
		return this.getValor() > carta.getValor();
	}

	public boolean tieneMismoPaloQueOtraCarta(Carta carta) {
		return this.getPalo().equals(carta.getPalo());
	}
}
