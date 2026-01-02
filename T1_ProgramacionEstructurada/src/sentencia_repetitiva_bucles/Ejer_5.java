package sentencia_repetitiva_bucles;

import java.util.Scanner;

public class Ejer_5 {

	// Modificar el programa anterior de forma que cuente todos los números
	// múltiplos de uno solicitado previamente por teclado, comprendidos entre dos
	// números solicitados también previamente por teclado

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el múltiplo:");
		int multiplo = scan.nextInt();

		System.out.println("Escribe el inicio:");
		int inicio = scan.nextInt();

		System.out.println("Escribe el final:");
		int fin = scan.nextInt();

		scan.close();

		int n = 0;

		do {
			n++;
			if (n % multiplo == 0) {
				System.out.println(n);
			}
		} while (n > inicio || n < fin);
	}

}
