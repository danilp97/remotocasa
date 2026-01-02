package sentencia_repetitiva_bucles;

public class Ejer_3 {

	// Realizar un programa que muestre por pantalla los números del 1 al 100 sin
	// mostrar los múltiplos de 5

	public static void main(String[] args) {

		int n = 0;

		do {
			n++;
			if (n % 5 != 0) {
				System.out.println(n);
			}
		} while (n < 100);
	}

}
