package iesPaucassesNoves.cat;

public class Planta extends Producte implements OperacionsSQL{
	private String nomCientific;
	private String interior_exterior;
	private double frecuenciaReg;
	private double alzada;
	public String getNomCientific() {
		return nomCientific;
	}
	public void setNomCientific(String nomCientific) {
		this.nomCientific = nomCientific;
	}
	public String getInterior_exterior() {
		return interior_exterior;
	}
	public void setInterior_exterior(String interior_exterior) {
		this.interior_exterior = interior_exterior;
	}
	public double getFrecuenciaReg() {
		return frecuenciaReg;
	}
	public void setFrecuenciaReg(double frecuenciaReg) {
		this.frecuenciaReg = frecuenciaReg;
	}
	public double getAlzada() {
		return alzada;
	}
	public void setAlzada(double alzada) {
		this.alzada = alzada;
	}
	public Planta(String nomCom, String descripcio, double preuUnitat,
			double descompte, String referencia, int stock,
			String nomCientific, String interior_exterior,
			double frecuenciaReg, double alzada) {
		super(nomCom, descripcio, preuUnitat, descompte, referencia, stock);
		this.nomCientific = nomCientific;
		this.interior_exterior = interior_exterior;
		this.frecuenciaReg = frecuenciaReg;
		this.alzada = alzada;
	}


	/**
	 * Creamos un metodo nuevo de insercion para no sobre escribir
	 * el metodo inserir del padre. De esta manera podemos hacer que
	 * sea el metodo del padre que capture el error.
	 * @return
	 * @throws StockException
	 */
	public String inserthijo() throws StockException {
		// TODO Auto-generated method stub
		System.out.println(super.insert() + getNomCientific() + getInterior_exterior() + getFrecuenciaReg() + getAlzada());						
		return super.insert();
	}
	
	/**
	 * Creamos un metodo nuevo de eliminacion para no sobre escribir
	 * el metodo delete del padre. De esta manera podemos hacer que
	 * sea el metodo del padre que capture el error.
	 * @return
	 * @throws StockException
	 */
	public String deletehijo() throws StockException {
		// TODO Auto-generated method stub
		System.out.println(super.insert() + getNomCientific() + getInterior_exterior() + getFrecuenciaReg() + getAlzada());	
		return super.delete();
	}
	
	/**
	 * Creamos un metodo nuevo de modificacion para no sobre escribir
	 * el metodo update de padre. De esta manera podemos hacer que
	 * sea el metodo del padre que capture el error.
	 * @return
	 * @throws StockException
	 */
	public String updatehijo() throws StockException {
		// TODO Auto-generated method stub
		System.out.println(super.insert() + getNomCientific() + getInterior_exterior() + getFrecuenciaReg() + getAlzada());	
		return super.update();
	}
	
}
