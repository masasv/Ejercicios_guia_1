/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		if (numero % 2 == 0) {
			System.out.println(numero + " es par");
		}else {
			System.out.println(numero + " es impar");
		}
	}

}
