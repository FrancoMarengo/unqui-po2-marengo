package ar.edu.unq.po2.tp8;

import java.util.List;

public class Partido {
	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	public Partido(String resultado, List<String> contrincantes, String deporte) {
		
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}
	
	public String getResultado() {
		return resultado;
	}

	public String getDeporte() {
		return deporte;
	}
	
	public List<String> getTopics() {
		List<String> temas = this.contrincantes;
		temas.add(this.getDeporte());
		return temas;
	}
}
