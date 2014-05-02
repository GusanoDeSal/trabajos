package iesPaucassesNoves.cat;

public class Cossiol extends Producte implements OperacionsSQL{
	private String material;
	private double capacitat;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getCapacitat() {
		return capacitat;
	}
	public void setCapacitat(double capacitat) {
		this.capacitat = capacitat;
	}
	public Cossiol(String nomCom, String descripcio, double preuUnitat,
			double descompte, String referencia, int stock, String material,
			double capacitat) {
		super(nomCom, descripcio, preuUnitat, descompte, referencia, stock);
		this.material = material;
		this.capacitat = capacitat;
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
