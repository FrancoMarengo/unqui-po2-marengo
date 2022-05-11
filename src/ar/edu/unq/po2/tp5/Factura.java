package ar.edu.unq.po2.tp5;

public abstract class Factura implements Pagable {
	
    private Agencia agencia;
    
    public Factura(Agencia agencia) {
    	super();
    	this.setUnaAgencia(agencia);
    }
    
    public void registrar() {
    	agencia.registrarPago(this);
    }
    
	public Agencia getAgencia() {
		return agencia;
	}

	private void setUnaAgencia(Agencia unaAgencia) {
		this.agencia = unaAgencia;
	}
}
