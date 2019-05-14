/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int fechaAct = 2019;
		int fechaNac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su fecha de nacimiento"));
		int edad = fechaAct- fechaNac;
		
		if (edad==1) {
			System.out.println("Su edad es "+ edad+ " año");
		}else {
			System.out.println("Su edad es "+ edad+ " años");
		}
	}

}
