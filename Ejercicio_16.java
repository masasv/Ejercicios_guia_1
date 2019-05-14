/**
 * 
 */
package GUIA_1;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 1;
		int suma;
		int limite = 100;

		System.out.print(n1+",");
		System.out.print(n2+",");

		while (n2 + n1 <= limite) {
			suma = n1;
			n1 = n2;
			n2 = suma + n1;
			
		System.out.print(n2+",");
			
		}
		
	}

}
