package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_6 {

	// Realizar un programa que lea dos números y los muestre ordenados de menor a mayor

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num1 = scan.nextInt();

		System.out.println("Escribe un segundo número entero:");
		int num2 = scan.nextInt();

		scan.close();

		if (num1 > num2) {
			System.out.print(num2);
			System.out.print(" " + num1);
		} else {
			System.out.print(num1);
			System.out.print(" " + num2);
		}

	}

}
