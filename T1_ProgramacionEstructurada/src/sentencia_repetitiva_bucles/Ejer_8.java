package sentencia_repetitiva_bucles;

import java.util.Scanner;

public class Ejer_8 {

	// Realizar un programa que calcule y muestre la suma de los múltiplos de 5
	// comprendidos entre dos valores A y B. El programa no permitirá introducir
	// valores negativos para A y B y verificará que A es menor que B. Si A es mayor
	// que B, intercambiará sus valores

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int suma = 0;

		System.out.println("Escribe el valor inicial:");
		int a = scan.nextInt();

		System.out.println("Escribe el valor final:");
		int b = scan.nextInt();

		scan.close();

		if (a < 0 || b < 0) {
			System.err.println("No pueden tener algún valor negativo");
			return;
		}
		if (a > b) {
			int aux = a;
			a = b;
			b = aux;
		}

		// Sumar múltiplos de 5 entre A y B
		for (int i = a; i <= b; i++) {
			if (i % 5 == 0) {
				suma += i;
			}
			System.out.println(suma);

		}
	}
}