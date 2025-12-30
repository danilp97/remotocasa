package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_16 {

	// Recibir un numero entre 1 y 99 e indicar si su decena es un número par o
	// impar. (pero con un algoritmo diverso del que has usado en el ejercicio 4)

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número entero entre 1 y 99");
		int n = scan.nextInt();

		scan.close();

		if (n < 1 || n > 99) {
			System.err.println("El número introducido no es correcto. Tiene que ser entre 1 y 99");
		} else if (n >= 1 && n <= 9) {
			if (n == 1 || n == 2 || n == 3 || n == 5 || n == 7) {
				System.out.println("El número introducido es primo");
			} else {
				System.out.println("El número introducido no es primo");
			}
		} else if (n >= 10 && n <= 99) {
			int decenas = n % 10;
			if (decenas == 1 || decenas == 2 || decenas == 3 || decenas == 5 || decenas == 7) {
				System.out.println("La decena del número introducido es primo");
			} else {
				System.out.println("La decena del número introducido no es primo");
			}
		}
	}
}
