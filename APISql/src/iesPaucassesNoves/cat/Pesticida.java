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

	/**
	 * Creamos un metodo nuevo de insercion para no sobre escribir
	 * el metodo inserir del padre. De esta manera podemos hacer que
	 * sea el metodo del padre que capture el error.
	 * @return
	 * @throws StockException
	 */
	public String inserthijo() throws StockException {
		// TODO Auto-generated method stub
		System.out.println(super.insert() + getLlistaEspecies() + getUtilitzacio() + getConservacio());						
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
		System.out.println(super.insert() + getLlistaEspecies() + getUtilitzacio() + getConservacio());	
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
		System.out.println(super.insert() + getLlistaEspecies() + getUtilitzacio() + getConservacio());	
		return super.update();
	}
		
}
