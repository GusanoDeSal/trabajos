package iesPaucassesNoves.cat.utilitat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IntroducirPerTeclat {

	public int introduirPerTeclatNumero(int numero) throws IOException {
		String CurLine = "";
		//int numero;

		// Introduir numero per teclat
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		System.out.print("Escriba el numero: ");
		// Numero 1
		CurLine = in.readLine();
		numero = Integer.parseInt(CurLine);
		
		return numero;
		
	}


	public void introduirPerTeclatString() {
		// leer por teclado un string
		try {

			// Introduir cadena per teclat
			InputStreamReader leer = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(leer);

			System.out.print("Escriba el texto: ");
			// salida por pantalla del texto introducido
			String texto = buff.readLine();
			System.out.println(texto);
		}
		// leer del teclado como String
		catch (java.io.IOException ioex) {
		}
	}

	public void indtroduirPerTeclatCaracter() {
		char caracter;
		Scanner teclado = new Scanner(System.in);
		// Escribe un caracter
		// system.out.println("Escribe un caracter");
		caracter = teclado.next().charAt(0);
	}
	
	public void introduirCadenaPalabraFrase(String[] args) throws IOException 
	{ 
	String palabra; 
	String frase; 

	InputStreamReader isr = new InputStreamReader(System.in); 
	BufferedReader leer=new BufferedReader(isr); 

	System.out.println("Introduce la palabra: "); 
	palabra=leer.readLine(); 

	System.out.println("Introduce la palabra: "); 
	frase=leer.readLine(); 

	System.out.println(palabra+"\t"+frase); 

	} 



}
