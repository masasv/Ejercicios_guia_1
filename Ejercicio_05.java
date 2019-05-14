/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

		if (num1>num2) {
			System.out.println("Numero "+num1+" es mayor que " + num2);
		}else {
			System.out.println("Numero "+num2+" es mayor que " + num1);
		}
	}

}
