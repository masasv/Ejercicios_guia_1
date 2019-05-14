/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.	Crear un programa que determine si una persona es mayor o menor de edad en base a su edad actual.
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		
		if (edad>=18) {
			System.out.println(edad + " años  - - Mayor de edad");
		}else if (edad>=1 && edad<18){
			System.out.println(edad + " años  - - Menor de edad");
		}else {
			System.out.println("Error de edad");
		}
		
	}

}
