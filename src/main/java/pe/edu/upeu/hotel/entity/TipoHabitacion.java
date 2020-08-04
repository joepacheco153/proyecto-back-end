package pe.edu.upeu.hotel.entity;

public class TipoHabitacion {
	private String numero;
	private String nombre;
	private int estado;
	private double precio;
	public TipoHabitacion() {
	}
	public TipoHabitacion(String numero, String nombre, int estado, double precio) {
		this.numero = numero;
		this.nombre = nombre;
		this.estado = estado;
		this.precio = precio;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
