/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double venta, iva;
		venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta"));
		iva = (venta/1.13)*0.13;
		
		System.out.println("Venta "+venta);
		System.out.println("iva   "+iva);
	}

}
