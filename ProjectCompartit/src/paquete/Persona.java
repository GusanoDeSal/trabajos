package paquete;

public class Persona {
	private String nom;
	private String cognom;
	private String dni;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Persona(String nom, String cognom, String dni) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", dni=" + dni
				+ "]";
	}
	
	

}
