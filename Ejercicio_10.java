/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		for (int i = 1; i <= numero; i++) {
			if ((numero%i)==0) {
				contador++;
			}
		}
		
		if(contador <=2) {
			System.out.println(numero + " es primo");
		}else {
			System.out.println(numero + " no es primo");
		}
		
	}

}
