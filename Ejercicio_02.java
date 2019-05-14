/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nota1, nota2, nota3, promedio;
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota 1"));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota 2"));
		nota3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota 3"));
		promedio = (nota1+nota2+nota3)/3;
		
		if (promedio>=6) {
			System.out.println("Promedio "+promedio + " Aprobado");
		}else {
			System.out.println("Promedio "+promedio + " Reprobado");
		}
	}

}
