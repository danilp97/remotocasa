package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_3 {

	// Realizar un programa que dado un número entero indique si es o no par

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num = scan.nextInt();

		scan.close();

		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " es impar");
		}

	}

}
