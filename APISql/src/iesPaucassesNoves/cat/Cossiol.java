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
	
	/**
	 * Creamos un metodo nuevo de insercion para no sobre escribir
	 * el metodo inserir del padre. De esta manera podemos hacer que
	 * sea el metodo del padre que capture el error.
	 * @return
	 * @throws StockException
	 */
	public String inserthijo() throws StockException {
		// TODO Auto-generated method stub
		System.out.println(super.insert() + getMaterial() + getCapacitat());						
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
		System.out.println(super.delete() + getMaterial() + getCapacitat());
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
		System.out.println(super.update() + getMaterial() + getCapacitat());
		return super.update();
	}
}
