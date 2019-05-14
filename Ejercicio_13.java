/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "abcdefghijklnmopqrstuvwxyz";
		char letra = JOptionPane.showInputDialog("Ingrese la letra a buscar").charAt(0);

		for (int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) == letra) {
				System.out.println("La letra que esta buscando es :" + letra);
				System.out.println("La posicion de la letra es    :" + (i + 1));
			}
		}
	}
}