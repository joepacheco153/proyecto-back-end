
package pe.edu.upeu.hotel.entity;

public class Login {
	private String nomusuario;
	private String nomrol;
	
	public Login() {
		
	}

	public Login(String nomusuario, String nomrol) {
		this.nomusuario = nomusuario;
		this.nomrol = nomrol;
	}

	public String getNomusuario() {
		return nomusuario;
	}

	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}

	public String getNomrol() {
		return nomrol;
	}

	public void setNomrol(String nomrol) {
		this.nomrol = nomrol;
	}
}
