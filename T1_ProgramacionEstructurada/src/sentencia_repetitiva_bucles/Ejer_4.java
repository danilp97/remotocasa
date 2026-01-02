package sentencia_repetitiva_bucles;

public class Ejer_4 {
	
	// Programa que cuente todos los números múltiplos de 7 comprendidos entre 1 y 100
	
	public static void main(String[] args) {
		
		int n = 0;
		
		do {
			n++;
			if (n % 7 == 0) {
				System.out.println(n);
			}
		} while (n<100);

	}

}
