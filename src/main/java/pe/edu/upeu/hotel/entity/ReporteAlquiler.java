package pe.edu.upeu.hotel.entity;

public class ReporteAlquiler {
	private String nombre;
	private String numero;
	private String fechaEntrada;
	private Double preciototal;
	public ReporteAlquiler() {
	
	}
	public ReporteAlquiler(String nombre, String numero, String fechaEntrada, Double preciototal) {
	
		this.nombre = nombre;
		this.numero = numero;
		this.fechaEntrada = fechaEntrada;
		this.preciototal = preciototal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
	
	
}
