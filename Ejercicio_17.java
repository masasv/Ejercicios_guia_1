package GUIA_1;

public class Ejercicio_17 {
	
public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int i=1;
		int cantidad = 100;
		String multiplos="";
		
		while(i<cantidad) {
			if (i%3==0) {
				multiplos = multiplos + i + ",";
			}
			i++;
		}
		System.out.println("Multiplos de 3 desde 1 a 100");
		System.out.print(multiplos);
	}

}