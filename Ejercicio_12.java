/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora"));
	
		if(hora>0 && hora<=12) {
			System.out.println(hora+ " buenos dias");
		}else if(hora>12 && hora<=19) {
			System.out.println(hora+ " buenas tardes");
		}else if(hora>19 || hora ==0) {
			System.out.println(hora+ " buenas noches");
		}else {
			System.out.println("Hora incorrecta");
		}
	}

}
