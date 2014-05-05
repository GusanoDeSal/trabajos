package iesPaucassesNoves.cat;

public interface OperacionsSQL {

	public String insert() throws StockException;
	public String delete() throws StockException;
	public String update() throws StockException;
}