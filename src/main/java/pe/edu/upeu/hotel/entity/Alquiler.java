package pe.edu.upeu.hotel.entity;

public class Alquiler {
	private int idhabitacion_persona;
	private String fechaEntrada;
	private Double preciototal;
	private int idpersona;
	private int idhabitacion;
	public Alquiler() {
	
	}
	public Alquiler(int idhabitacion_persona, String fechaEntrada, Double preciototal, int idpersona,
			int idhabitacion) {
		
		this.idhabitacion_persona = idhabitacion_persona;
		this.fechaEntrada = fechaEntrada;
		this.preciototal = preciototal;
		this.idpersona = idpersona;
		this.idhabitacion = idhabitacion;
	}
	public int getIdhabitacion_persona() {
		return idhabitacion_persona;
	}
	public void setIdhabitacion_persona(int idhabitacion_persona) {
		this.idhabitacion_persona = idhabitacion_persona;
	}
	public String getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Double getPreciototal() {
		return preciototal;
	}
	public void setPreciototal(Double preciototal) {
		this.preciototal = preciototal;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getIdhabitacion() {
		return idhabitacion;
	}
	public void setIdhabitacion(int idhabitacion) {
		this.idhabitacion = idhabitacion;
	}
	
	
}
