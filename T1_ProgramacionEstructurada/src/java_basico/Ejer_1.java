package java_basico;

import java.util.Scanner;

public class Ejer_1 {

	// Escribe un programa en Java que lea por teclado dos variables enteras
	// y muestre su suma en pantalla

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num1 = scan.nextInt();

		System.out.println("Escribe un segundo número entero:");
		int num2 = scan.nextInt();

		scan.close();

		int suma = num1 + num2;

		System.out.println("La suma entre los dos números es: " + suma);
	}

}
