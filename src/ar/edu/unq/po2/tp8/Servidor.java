package ar.edu.unq.po2.tp8;

import java.util.List;

public class Servidor implements ISubscriptor{

	private List<String> intereses;

	public Servidor(List<String> intereses) {
		this.intereses = intereses;
	}
	
	public List<String> getIntereses(){
		return intereses;
	}
	
	public void update(Partido partido) {
		System.out.println("Se informa que el partido entre "+partido.getContrincantes()+" finalizo "+partido.getResultado() );
	}
}
