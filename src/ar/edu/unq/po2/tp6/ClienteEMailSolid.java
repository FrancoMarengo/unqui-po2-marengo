package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class ClienteEMailSolid {

	private String nombreUsuario;
	private String passusuario;
	private EMailServidor EMailServidor;
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	public ClienteEMailSolid(String nombreUsuario, String passusuario, EMailServidor eMailServidor) {
		this.setNombreUsuario(nombreUsuario);
		this.setPassusuario(passusuario);
		this.setBorrados(new ArrayList<Correo>());
		this.setInbox(new ArrayList<Correo>());
		this.setEMailServidor(eMailServidor);
		eMailServidor.conectar(this);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
	    Correo correo = new Correo(asunto, destinatario, cuerpo);
	    this.EMailServidor.enviarCorreo(correo);
	}
	
	public void recibirNuevos(List<Correo> correosNuevos) {
		inbox.addAll(correosNuevos);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}

	private void setInbox(List<Correo> inbox) {
		this.inbox = inbox;
	}

	private void setBorrados(List<Correo> borrados) {
		this.borrados = borrados;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	private void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	private void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}

	public EMailServidor getEMailServidor() {
		return EMailServidor;
	}

	private void setEMailServidor(EMailServidor eMailServidor) {
		EMailServidor = eMailServidor;
	}

	public List<Correo> getInbox() {
		return inbox;
	}

	public List<Correo> getBorrados() {
		return borrados;
	}

}
