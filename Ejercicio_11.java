/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad total de alumnos"));
		double reprobados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad reprobados"));
		double porcentaje = (reprobados/alumnos)*100;
		
		System.out.println(porcentaje+"% de alumnos reprobados de "+alumnos+" alumnos");
	}

}
