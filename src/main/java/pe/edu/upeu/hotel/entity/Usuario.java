package pe.edu.upeu.hotel.entity;

public class Usuario {
	private String nomusuario;
	private String clave;
	public Usuario() {
		
	}
	public Usuario(String nomusuario, String clave) {
		super();this.nomusuario = nomusuario;
		this.clave = clave;
	}
	public String getNomusuario() {
		return nomusuario;
	}
	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
