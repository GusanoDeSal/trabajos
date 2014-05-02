package iesPaucassesNoves.cat;

public class Pesticida extends Producte implements OperacionsSQL{
	private String llistaEspecies;
	private String utilitzacio;
	private String conservacio;
	
	public String getLlistaEspecies() {
		return llistaEspecies;
	}
	public void setLlistaEspecies(String llistaEspecies) {
		this.llistaEspecies = llistaEspecies;
	}
	public String getUtilitzacio() {
		return utilitzacio;
	}
	public void setUtilitzacio(String utilitzacio) {
		this.utilitzacio = utilitzacio;
	}
	public String getConservacio() {
		return conservacio;
	}
	public void setConservacio(String conservacio) {
		this.conservacio = conservacio;
	}
	public Pesticida(String nomCom, String descripcio, double preuUnitat,
			double descompte, String referencia, int stock,
			String llistaEspecies, String utilitzacio, String conservacio) {
		super(nomCom, descripcio, preuUnitat, descompte, referencia, stock);
		this.llistaEspecies = llistaEspecies;
		this.utilitzacio = utilitzacio;
		this.conservacio = conservacio;
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
