package iesPaucassesNoves.cat;

public class BaseDatos {
	private String ipServer;
	private String dbName;
	private String username;
	private String password;

	public String getIpServer() {
		return ipServer;
	}

	public void setIpServer(String ipServer) {
		this.ipServer = ipServer;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BaseDatos(String ipServer, String dbName, String username,
			String password) {
		super();
		this.ipServer = ipServer;
		this.dbName = dbName;
		this.username = username;
		this.password = password;
	}

	/**
	 * Podrà rebre un objecte d'una classe que implementi 
	 * la interfície operacions
	 * @param objecte
	 * @return
	 * @throws SqlDBException 
	 * @throws StockException 
	 */
	public int insert(OperacionsSQL objecte) throws SqlDBException, StockException {
		// TODO Auto-generated method stub
		if (objecte == null){
			throw new SqlDBException();
		}
		System.out.println(objecte.insert());		
		
		int columnas = 8;
		return columnas;
	}

	/**
	 * Podrà rebre un objecte d'una classe que implementi 
	 * la interfície operacions
	 * @param objecte
	 * @return
	 * @throws StockException 
	 * @throws ExceptionPropies 
	 */
	public int delete(OperacionsSQL objecte) throws SqlDBException, StockException {
		// TODO Auto-generated method stub
		if (objecte == null){
			throw new SqlDBException();
		}
		System.out.println(objecte.delete());
		int columnas = 8;
		return columnas;
	}

	/**
	 * Podrà rebre un objecte d'una classe que implementi 
	 * la interfície operacions
	 * @param objecte
	 * @return
	 * @throws StockException 
	 * @throws ExceptionPropies 
	 */
	public int update(OperacionsSQL objecte) throws SqlDBException, StockException {
		// TODO Auto-generated method stub
		if (objecte == null){
			throw new SqlDBException();
		}
		System.out.println(objecte.update());
		int columnas = 8;
		return columnas;
	}

}
