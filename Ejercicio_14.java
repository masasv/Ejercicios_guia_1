/**
 * 
 */
package GUIA_1;

/**
 * @author marlon.santosfgkah
 *
 */
public class Ejercicio_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "otorrinolaringologo";

		int vocales = 0;

		int i = 0;
		while (i < palabra.length()) {
			if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
					|| palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
				vocales++;
			}
			i++;
		}
		System.out.println("La palabra " + palabra + " contiene " + vocales + " vocales y "
				+ (palabra.length() - vocales) + " consonantes");

	}
}