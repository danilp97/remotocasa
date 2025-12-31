package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_23 {

	// Pedir un número entre 0 y 99999 y mostrarlo con las cifras al revés

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entre 0 y 99999:");
		int n = scan.nextInt();

		scan.close();

		if (n < 0 || n > 99999) {
			System.err.println("Número no válido");
			return;
		} else {
			String numString = "" + n;
			int length = numString.length();
			if (length == 1) {
				System.out.println("El número solo tiene 1 cifra");
			} else if (length == 2) {
				System.out.println("El número introducido al revés seria: " + numString.charAt(1) + numString.charAt(0));
			} else if (length == 3) {
				System.out.println("El número introducido al revés seria: " + numString.charAt(2) + numString.charAt(1) + numString.charAt(0));
			} else if (length == 4) {
				System.out.println("El número introducido al revés seria: " + numString.charAt(3) + numString.charAt(2) + numString.charAt(1) + numString.charAt(0));
			} else {
				System.out.println("El número introducido al revés seria: " + numString.charAt(4) + numString.charAt(3) + numString.charAt(2) + numString.charAt(1) + numString.charAt(0));
			}
		}

	}

}
