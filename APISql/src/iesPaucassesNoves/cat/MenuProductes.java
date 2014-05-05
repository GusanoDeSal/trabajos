package iesPaucassesNoves.cat;

import iesPaucassesNoves.cat.utilitat.IntroducirPerTeclat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuProductes {

	public static void main(String[] args) throws IOException, StockException {
		// TODO Auto-generated method stub

		MenuProductes menu = new MenuProductes();
		menu.menu();
		
	}
	
	
	/**
	 * Menu
	 * @throws IOException 
	 * @throws StockException 
	 */
	public void menu() throws IOException, StockException{
		String CurLine = "";
		int numero = 0;
		IntroducirPerTeclat teclat = new IntroducirPerTeclat();
		
		do {
			
			System.out.println("1. Insrtar Cossiol");
			System.out.println("2. Eliminar Cossiol");
			System.out.println("3. Modificar Cossiol");
			
			System.out.println("4. Insrtar Planta");
			System.out.println("5. Eliminar Planta");
			System.out.println("6. Modificar Planta");
			
			System.out.println("7. Insrtar Pesticida");
			System.out.println("8. Eliminar Pesticida");
			System.out.println("9. Modificar Pesticida");
			
			System.out.println("10. Sortir");
			System.out.println("Entri un sencers: ");
			
			// Introduir nombres per teclat
			teclat.introduirPerTeclatNumero(numero);
			
			if (numero == 1) {
				llista cos = new llista(CurLine, CurLine, numero, numero, CurLine, numero, CurLine, numero, null, null, null, null, numero, numero, numero, numero, numero, numero);
				cos.inserirCosiol(cos);
			}
			
			if (numero == 2){
				llista cos = new llista(CurLine, CurLine, numero, numero, CurLine, numero, CurLine, numero, null, null, null, null, numero, numero, numero, numero, numero, numero);
				cos.deletehijo();
			}
			
			if (numero == 3){
				llista cos = new llista(CurLine, CurLine, numero, numero, CurLine, numero, CurLine, numero, null, null, null, null, numero, numero, numero, numero, numero, numero);
				cos.updatehijo();
			}
			
			if (numero == 10) {
				System.out.println("SORTIR DEL PROGRAMA.");
			}

			if ((numero >= 15) || (numero == 0)) {
				System.out
						.println("El nombre introduit no esta a la llista de procesos.");
			}
		} while (numero != 10 );
	}

}
