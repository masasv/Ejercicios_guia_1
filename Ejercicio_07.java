/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Juan", b = "Perez";
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
		
		if (nombre.equals(a) && apellido.equals(b)) {
			System.out.println("Hola Juan Perez");
		}else {
			System.out.println("No te conozco");
		}
	}

}
