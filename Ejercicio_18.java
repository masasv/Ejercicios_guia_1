/**
 * 
 */
package GUIA_1;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio = 1;
		int fin = 27;
		
		int par=0; 
		int impar=0;
		
		int i = inicio;
		while(i<=fin) {
			if (i%2==0) {
				par++;
			}else {
				impar++;
			}
			i++;
		}
		System.out.println("rango de inicio :"+ inicio);
		System.out.println("rango de fin :"+ fin);
		System.out.println("Cantidad de numero pares es :"+par);
		System.out.println("Cantidad de numero impares es :"+impar);

		
	}

}
