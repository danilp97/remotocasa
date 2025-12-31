package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_22 {

	// Pedir un número entre 0 y 99999 y decir cuantas cifras tiene

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entre 0 y 99999:");
		int n = scan.nextInt();

		scan.close();

		if (n < 0 || n > 99999) {
			System.err.println("Número no válido");
			return;
		} else if (n >= 0 && n <= 9) {
			System.out.println("El número " + n + " tiene 1 cifra.");
		} else if (n >= 10 && n <= 99) {
			System.out.println("El número " + n + " tiene 2 cifras.");
		} else if (n >= 100 && n <= 999) {
			System.out.println("El número " + n + " tiene 3 cifras.");
		} else if (n >= 1000 && n <= 9999) {
			System.out.println("El número " + n + " tiene 4 cifras.");
		} else {
			System.out.println("El número " + n + " tiene 5 cifras.");
		}

	}

}
