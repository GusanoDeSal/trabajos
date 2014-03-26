package paquete;

public class Compartit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");

		Compartit numeros = new Compartit();
		int num = 30;
		numeros.proves(num);
		
		Compartit piramide = new Compartit();
		piramide.piramideSuperior();

		Compartit cuadrado = new Compartit();
		cuadrado.caja();
		
	}

	public void proves(int numero) {
		for (int i = 0; i <= numero; i++) {

			if (i % 2 == 0) {
				System.out.println();
			}

			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println();
		System.out.print(" *** "+ numero +" *** ");
		System.out.println();
	}
	
	public void piramideSuperior(){
		System.out.println();
		System.out.println("      * ");
		System.out.println("     *** ");
		System.out.println("    ***** ");
		System.out.println("   ******* ");
		System.out.println("  ********* ");
		System.out.println(" *********** ");
		System.out.println();
	}
	
	public void caja(){
		System.out.println();
		System.out.println(" ************* ");
		System.out.println(" *           * ");
		System.out.println(" *           * ");
		System.out.println(" *           * ");
		System.out.println(" *           * ");
		System.out.println(" ************* ");
		System.out.println();
	}
	

}
