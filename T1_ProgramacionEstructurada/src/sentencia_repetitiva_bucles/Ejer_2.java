package sentencia_repetitiva_bucles;

public class Ejer_2 {

	// Programa que muestre por pantalla todos los números naturales del 1 hasta el
	// 5, ambos incluidos; lo mismo pero de 1 a 50; lo mismo pero de 1 a 500.

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		do {
			n1++;
			System.out.println(n1);
		} while (n1 < 5);

		do {
			n2++;
			System.out.println(n2);
		} while (n2 < 50);

		do {
			n3++;
			System.out.println(n3);
		} while (n3 < 500);

	}

}
