package iesPaucassesNoves.cat.utilitat;

/*1. Crea el paquet utilitats. Dins aquest paquet crea una classe d'utilitat
 anomenada OrdenacioICerca. En aquesta classe crea el mètode bimbolla
 que implementi aquest mètode d'ordenació per un array de int..*/
public class OrdenacioICerca {

	public static void bimbolla(int[] num) {
		for (int i = 2; i <= num.length; i++) {
			for (int j = 0; j <= num.length - i; j++) {
				if (num[j] > num[j + 1]) {

					int aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;

				}

			}

		}
	}

	/*
	 * 4. A la classe OrdenacioICerca crea el mètode quick Sort que implementi
	 * aquest mètode d'ordenació per un array de int.
	 */
	public static void quickSort(int[] vect, int esquerra, int dreta) {
		int i = esquerra;
		int j = dreta;

		int temp = vect[(i + j) / 2];
		do {

			while (vect[i] < temp) {
				i++;
			}

			while (vect[j] > temp) {
				j--;
			}

			if (i <= j) {
				int aux = vect[i];
				vect[i] = vect[j];
				vect[j] = aux;
				i++;
				j--;
			}

		}

		while (i < j);
		if (esquerra < j) {
			quickSort(vect, esquerra, j);

		}
		if (i < dreta) {
			quickSort(vect, i, dreta);
		}
	}

	/*
	 * 6. A la classe OrdenacioICerca crea el mètode cercaBinaria que implementi
	 * aquest mètode de cerca. Ha de rebre com a paràmetre l'array i el nombre
	 * que cerca. Ha de tornar com a resultat l'index que ocupa aquest nombre
	 * dins l'array si l'ha trobat o -1 si no l'ha trobat.
	 */

	public static int cercaBinaria(int[] a, int cerca) {
		int inici = 0;
		int fi = a.length - 1;
		int mig = -1;

		while (inici <= fi) {
			mig = (inici + fi) / 2;
			// System.out.println("valor de mig " + mig);
			if (cerca == a[mig]) {

				return mig;
			} else if (a[mig] > cerca) {
				fi = mig - 1;
			} else {
				inici = mig + 1;
			}
		}

		return -1;
	}

	/*
	 * 8. A la classe OrdenacioICerca copia el mètode cercaBinaria a
	 * cercaBinaria2 i modifica'l de forma que abans de tornar cap resultat ens
	 * digui quantes comparacions ha fet.
	 */

	public static int cercaBinaria2(int[] a, int cerca) {
		int inici = 0;
		int fi = a.length - 1;
		int mig = -1;
		int count = 0;

		while (inici <= fi) {
			System.out.println("Numero comparacions " + count);
			mig = (inici + fi) / 2;
			if (cerca == a[mig]) {
				return mig;
			} else if (a[mig] > cerca) {
				fi = mig - 1;
			} else {
				inici = mig + 1;
			}
			count++;
		}
		return -1;
	}

	/*
	 * 10. A la classe OrdenacioICerca sobrecarrega el mètode bimbolla de forma
	 * que accepti com a paràmetre un array d'objectes Comparable.
	 */
	public static void bimbolla2(Comparable[] num) {
		for (int i = 2; i <= num.length; i++) {
			for (int j = 0; j <= num.length - i; j++) {
				if (num[j].compareTo(num[j + 1])>0) {

					Comparable aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;

				}

			}

		}
	}
}
