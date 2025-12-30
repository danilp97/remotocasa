package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_18 {

	// Lo mismo que el ejercicio 6, usando un algoritmo distinto

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num1 = scan.nextInt();

		System.out.println("Escribe un segundo número entero:");
		int num2 = scan.nextInt();

		scan.close();

		if ((num1 / num2) > 0) {
			System.out.println("num1: " + num1 + " > " + "num2: " + num2);
		} else {
			System.out.println("num2: " + num2 + " > " + "num1: " + num1);
		}
	}
}
