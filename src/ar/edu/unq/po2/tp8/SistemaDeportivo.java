package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeportivo {
	private List<Partido> partidos;
	private List<ISubscriptor> subscriptores;
	
	public SistemaDeportivo() {
		this.partidos = new ArrayList<Partido>();
		this.subscriptores = new ArrayList<ISubscriptor>();
	}

	public void agregar(ISubscriptor sub) {
		this.subscriptores.add(sub);
	}

	public void eliminar(ISubscriptor sub) {
		this.subscriptores.remove(sub);
		
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		this.notificar(partido);
	}
	
	public List<ISubscriptor> getSubscriptores() {
		return subscriptores;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public void notificar(Partido partido) {
		for(ISubscriptor suscriptor : this.getSubscriptores()) {
			if(suscriptor.getIntereses().stream().anyMatch(interes -> partido.getTopics().contains(interes))){
				suscriptor.update(partido);
			}
		}
	}
}
