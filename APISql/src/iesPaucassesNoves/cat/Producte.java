package iesPaucassesNoves.cat;

public class Producte {
	private String nomCom;
	private String descripcio;
	private double preuUnitat;
	private double descompte;
	private String referencia;
	private int stock;
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public double getPreuUnitat() {
		return preuUnitat;
	}
	public void setPreuUnitat(double preuUnitat) {
		this.preuUnitat = preuUnitat;
	}
	public double getDescompte() {
		return descompte;
	}
	public void setDescompte(double descompte) {
		this.descompte = descompte;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Producte(String nomCom, String descripcio, double preuUnitat,
			double descompte, String referencia, int stock) {
		super();
		this.nomCom = nomCom;
		this.descripcio = descripcio;
		this.preuUnitat = preuUnitat;
		this.descompte = descompte;
		this.referencia = referencia;
		this.stock = stock;
	}
	
	public String insert(){
		String dml = "INSERT INTO" + "VALUES " + getNomCom();
		return dml;
	}
	public String delete(){
		String dml = "DELETE" + "FROM " ;
		return dml;
	}
	public String update(){
		String dml = "UPDATE" + "SET" ;
		return dml;
	}
	
}
