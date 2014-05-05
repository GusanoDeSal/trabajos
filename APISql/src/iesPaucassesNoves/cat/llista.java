package iesPaucassesNoves.cat;

import java.util.ArrayList;

public class llista extends Cossiol {
	public ArrayList<Cossiol> llistaCosiol;
	public ArrayList<Planta> llistaPlanta;
	public ArrayList<Pesticida> llistaPesticida;
	public ArrayList info;

	int numCosiol;
	int maxCosiol;

	int numPlanta;
	int maxPlanta;

	int numPesticida;
	int maxPesticida;

	public ArrayList<Cossiol> getLlistaCosiol() {
		return llistaCosiol;
	}

	public void setLlistaCosiol(ArrayList<Cossiol> llistaCosiol) {
		this.llistaCosiol = llistaCosiol;
	}

	public ArrayList<Planta> getListaPlanta() {
		return llistaPlanta;
	}

	public void setListaPlanta(ArrayList<Planta> listaPlanta) {
		this.llistaPlanta = listaPlanta;
	}

	public ArrayList<Pesticida> getLlistaPesticida() {
		return llistaPesticida;
	}

	public void setLlistaPesticida(ArrayList<Pesticida> llistaPesticida) {
		this.llistaPesticida = llistaPesticida;
	}

	public ArrayList getInfo() {
		return info;
	}

	public void setInfo(ArrayList info) {
		this.info = info;
	}

	public int getNumCosiol() {
		return numCosiol;
	}

	public void setNumCosiol(int numCosiol) {
		this.numCosiol = numCosiol;
	}

	public int getMaxCosiol() {
		return maxCosiol;
	}

	public void setMaxCosiol(int maxCosiol) {
		this.maxCosiol = maxCosiol;
	}

	public int getNumPlanta() {
		return numPlanta;
	}

	public void setNumPlanta(int numPlanta) {
		this.numPlanta = numPlanta;
	}

	public int getMaxPlanta() {
		return maxPlanta;
	}

	public void setMaxPlanta(int maxPlanta) {
		this.maxPlanta = maxPlanta;
	}

	public int getNumPesticida() {
		return numPesticida;
	}

	public void setNumPesticida(int numPesticida) {
		this.numPesticida = numPesticida;
	}

	public int getMaxPesticida() {
		return maxPesticida;
	}

	public void setMaxPesticida(int maxPesticida) {
		this.maxPesticida = maxPesticida;
	}

	public llista(String nomCom, String descripcio, double preuUnitat,
			double descompte, String referencia, int stock, String material,
			double capacitat, ArrayList<Cossiol> llistaCosiol,
			ArrayList<Planta> listaPlanta,
			ArrayList<Pesticida> llistaPesticida, ArrayList info,
			int numCosiol, int maxCosiol, int numPlanta, int maxPlanta,
			int numPesticida, int maxPesticida) {
		super(nomCom, descripcio, preuUnitat, descompte, referencia, stock,
				material, capacitat);
		this.llistaCosiol = llistaCosiol;
		this.llistaPlanta = listaPlanta;
		this.llistaPesticida = llistaPesticida;
		this.info = info;
		this.numCosiol = numCosiol;
		this.maxCosiol = maxCosiol;
		this.numPlanta = numPlanta;
		this.maxPlanta = maxPlanta;
		this.numPesticida = numPesticida;
		this.maxPesticida = maxPesticida;

		// AQUI SI inicializamos el arraylist
		llistaCosiol = new ArrayList();
		maxCosiol = numCosiol;

		llistaPlanta = new ArrayList();
		maxPlanta = numPlanta;

		llistaPesticida = new ArrayList();
		maxPesticida = numPesticida;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "llista [listaCosiol=" + llistaCosiol + ", info=" + info
				+ ", numCosiol=" + numCosiol + ", maxCosiol=" + maxCosiol + "]";
	}

	/**
	 * Metode inserir cossiol
	 * 
	 * @param cos
	 * @return
	 */
	public boolean inserirCosiol(Cossiol cos) {
		if (maxCosiol > llistaCosiol.size()) {
			llistaCosiol.add(cos);
			return true;
		}
		return false;
	}

	/**
	 * Metode inserir planta
	 * 
	 * @param pla
	 * @return
	 */
	public boolean inserirPlanta(Planta pla) {
		if (maxPlanta > llistaPesticida.size()) {
			llistaPlanta.add(pla);
			return true;
		}
		return false;
	}

	/**
	 * Metode inserir pesticida
	 * 
	 * @param pest
	 * @return
	 */
	public boolean inserirPesticida(Pesticida pest) {
		if (maxPesticida > llistaPesticida.size()) {
			llistaPesticida.add(pest);
			return true;
		}
		return false;
	}

	/**
	 * Metode per sercar cosiol
	 * 
	 * @param info
	 * @return
	 */
	public Cossiol tornarCossiol(String info) {
		for (int i = 0; i < llistaCosiol.size(); i++) {
			if (llistaCosiol.get(i).getNomCom().equalsIgnoreCase(info)) {
				return llistaCosiol.get(i);
			}
		}
		return null;
	}

	/**
	 * Metode per sercar planta
	 * 
	 * @param info
	 * @return
	 */
	public Planta tornarPlanta(String info) {
		for (int i = 0; i < llistaPlanta.size(); i++) {
			if (llistaPlanta.get(i).getNomCom().equalsIgnoreCase(info)) {
				return llistaPlanta.get(i);
			}
		}
		return null;
	}

	/**
	 * Metod per sercar pesticida
	 * 
	 * @param info
	 * @return
	 */
	public Pesticida tornarPesticida(String info) {
		for (int i = 0; i < llistaPesticida.size(); i++) {
			if (llistaPesticida.get(i).getNomCom().equalsIgnoreCase(info)) {
				return llistaPesticida.get(i);
			}
		}
		return null;
	}

	/**
	 * Metode eliminar cossiol
	 * 
	 * @param tipo
	 * @return
	 */
	public boolean eliminarCossiol(String tipo) {
		Cossiol cos = tornarCossiol(tipo);
		if (cos != null) {
			return llistaCosiol.remove(cos);
		} else {
			return false;
		}
	}

	/**
	 * Metode eliminar planta
	 * 
	 * @param tipo
	 * @return
	 */
	public boolean eliminarPlanta(String tipo) {
		Planta plan = tornarPlanta(tipo);
		if (plan != null) {
			return llistaPlanta.remove(plan);
		} else {
			return false;
		}
	}

	/**
	 * Metode eliminar pesticida
	 * 
	 * @param tipo
	 * @return
	 */
	public boolean eliminarPesticida(String tipo) {
		Pesticida pest = tornarPesticida(tipo);
		if (pest != null) {
			return llistaPesticida.remove(pest);
		} else {
			return false;
		}
	}

	/**
	 * Metode mostrar cossiol
	 */
	public void mostrarCossiol() {
		for (Cossiol info : llistaCosiol) {
			System.out.println(info);
		}
	}

	/**
	 * Metode mostrar planta
	 */
	public void mostrarPlanta() {
		for (Planta info : llistaPlanta) {
			System.out.println(info);
		}
	}

	/**
	 * Metode mostrar pesticida
	 */
	public void mostrarPesticida() {
		for (Pesticida info : llistaPesticida) {
			System.out.println(info);
		}
	}

}
