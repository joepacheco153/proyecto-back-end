package pe.edu.upeu.hotel.entity;

public class Habitacion {
	private int idhabitacion;
	private String numero;
	private int estado;
	private int idtipohabitacion;
	public Habitacion() {
		
	}
	public Habitacion(int idhabitacion, String numero, int estado, int idtipohabitacion) {
		this.idhabitacion = idhabitacion;
		this.numero = numero;
		this.estado = estado;
		this.idtipohabitacion = idtipohabitacion;
	}
	public int getIdhabitacion() {
		return idhabitacion;
	}
	public void setIdhabitacion(int idhabitacion) {
		this.idhabitacion = idhabitacion;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdtipohabitacion() {
		return idtipohabitacion;
	}
	public void setIdtipohabitacion(int idtipohabitacion) {
		this.idtipohabitacion = idtipohabitacion;
	}
	
	
	

}
