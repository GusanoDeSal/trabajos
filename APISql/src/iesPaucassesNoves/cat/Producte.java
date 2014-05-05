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

	public String insert() throws StockException {
		String dml = "";
			try {
				dml = "INSERT INTO" + "VALUES " + getNomCom() + getDescompte()
						+ getPreuUnitat() + getDescompte() + getReferencia()
						+ getStock();
				if (getPreuUnitat() <= 0) {
					// throw new StockException();
				insert();
				}
			} catch (StockException e) {
				// TODO: handle exception
				throw new StockException("Preu no valid");
			}
		return dml;
	}

	public String delete() throws StockException {
		String dml = "DELETE" + "FROM " + getNomCom() + getDescompte()
				+ getPreuUnitat() + getDescompte() + getReferencia()
				+ getStock();
		if (getReferencia() == null) {
			try {
				delete();
			} catch (StockException e) {
				// TODO: handle exception
				throw new StockException("No s´ha pogut eliminar");
			}
		}
		return dml;
	}

	public String update() throws StockException {
		String dml = "UPDATE" + "SET" + getNomCom() + getDescompte()
				+ getPreuUnitat() + getDescompte() + getReferencia()
				+ getStock();
		if (getReferencia() == null) {
			try {
				update();
			} catch (StockException e) {
				// TODO: handle exception
				throw new StockException("No s´ha pogut eliminar");
			}
		}
		return dml;
	}

}
