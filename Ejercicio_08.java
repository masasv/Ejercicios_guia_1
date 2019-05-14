/**
 * 
 */
package GUIA_1;

import javax.swing.JOptionPane;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero")); 
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer numero"));
		
		if (n1>n2 && n2>n3) {
			System.out.println("n1=" +n1+ " n2=" +n2+ " n3="+n3);
		}else if(n1>n3 && n3>n2) {
			System.out.println("n1=" +n1+ " n3=" +n3+ " n2="+n2);
		}else if(n2>n1 && n1>n3){
			System.out.println("n2=" +n2+ " n1=" +n1+ " n3="+n3);
		}else if(n2>n3 && n3>n1) {
			System.out.println("n2=" +n2+ " n3=" +n3+ " n1="+n1);
		}else if(n3>n1 && n1>n2) {
			System.out.println("n3=" +n3+ " n1=" +n1+ " n2="+n2);
		}else if(n3>n2 && n2>n1) {
			System.out.println("n3=" +n3+ " n2=" +n2+ " n1="+n1);
		}
		
	}

}
