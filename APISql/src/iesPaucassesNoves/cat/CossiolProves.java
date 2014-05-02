package iesPaucassesNoves.cat;

public class CossiolProves implements OperacionsSQL {
	private String nomCom;
	private String descripcion;
	private String referencia;
	private double preuUnidad;
	private double descuento;
	private String material;
	private double capacidadL;
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public double getPreuUnidad() {
		return preuUnidad;
	}
	public void setPreuUnidad(double preuUnidad) {
		this.preuUnidad = preuUnidad;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getCapacidadL() {
		return capacidadL;
	}
	public void setCapacidadL(double capacidadL) {
		this.capacidadL = capacidadL;
	}
	public CossiolProves(String nomCom, String descripcion, String referencia,
			double preuUnidad, double descuento, String material,
			double capacidadL) {
		super();
		this.nomCom = nomCom;
		this.descripcion = descripcion;
		this.referencia = referencia;
		this.preuUnidad = preuUnidad;
		this.descuento = descuento;
		this.material = material;
		this.capacidadL = capacidadL;
	}
	
	public String insert(){
		String dml = "INSERT INTO" + "VALUES " + getNomCom() +getDescripcion() ;
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
