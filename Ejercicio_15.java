/**
 * 
 */
package GUIA_1;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		boolean esPrimo;
		int inicio = 15;
		int fin = 27;
		for (i = inicio; i <= fin; i++) {

			esPrimo = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;//no es primo.
				}
			}
			
			if (esPrimo) {// Si es primo 
				System.out.println(i + "\n");
			}
		}
	}
}
