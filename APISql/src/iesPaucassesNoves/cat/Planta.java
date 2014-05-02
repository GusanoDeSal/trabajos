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

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return super.insert();
	}
	
	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return super.delete();
	}
	
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return super.update();
	}
	
	
}
