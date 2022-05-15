package ar.edu.unq.po2.tp6;

import java.util.List;

public class EMailServidor {

	private ClienteEMailSolid clienteEMail;
	private IServidor servidor;
	
	public EMailServidor(IServidor servidor) {
		this.setServidor(servidor);
	}
	
	public void conectar(ClienteEMailSolid clienteEMail) {
		this.setClienteEMail(clienteEMail);
	}
	
	public void recibirNuevos() {
		List<Correo> nuevosCorreos = this.servidor.recibirNuevos(clienteEMail.getNombreUsuario(),
				                                                  clienteEMail.getPassusuario());
		clienteEMail.recibirNuevos(nuevosCorreos);
	}
	
	public void enviarCorreo(Correo correo){
		this.servidor.enviar(correo);
	}

	public ClienteEMailSolid getClienteEMail() {
		return clienteEMail;
	}

	private void setClienteEMail(ClienteEMailSolid clienteEMail) {
		this.clienteEMail = clienteEMail;
	}

	public IServidor getServidor() {
		return servidor;
	}

	private void setServidor(IServidor servidor) {
		this.servidor = servidor;
	}
}
