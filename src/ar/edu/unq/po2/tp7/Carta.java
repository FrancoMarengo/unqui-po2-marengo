package ar.edu.unq.po2.tp7;

public class Carta {

	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		super();
		this.setPalo(palo);
		this.setValor(valor);
	}
	
	public boolean tieneMismoPaloQue(Carta carta) {
		return(this.getPalo() == carta.getPalo());
	}
	
	public boolean esSuperiorA(Carta carta) {
		String valorCarta = this.verificarValor();
		String valorCartaAComparar = carta.verificarValor();
		return(Integer.valueOf(valorCarta) > Integer.valueOf(valorCartaAComparar));	
	}
	
	private String verificarValor() {
		if (this.getValor() == "J") {
			return("11");
		} else if(this.getValor() == "Q") {
			return("12");
		} else if(this.getValor() == "K") {
			return("13");
		} else {
			return(this.getValor());
		}
		
	}

	public String getValor() {
		return valor;
	}

	private void setValor(String valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	private void setPalo(String palo) {
		this.palo = palo;
	}
}
