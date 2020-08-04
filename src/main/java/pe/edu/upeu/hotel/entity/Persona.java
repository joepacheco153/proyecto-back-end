package pe.edu.upeu.hotel.entity;

public class Persona {
	private int idpersona;
	private String nombre;
	private String dni;
	private String fechanacimiento;
	public Persona() {
		
	}
	public Persona(int idpersona, String nombre, String dni, String fechanacimiento) {
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
	
}
