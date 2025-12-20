package java_basico;

import java.util.Scanner;

public class Ejerc_14 {

	// Escribe un programa que lea por teclado una variable de tipo entero y diga si
	// ese número es par o impar.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un primer número entero:");
		int num = scan.nextInt();
		
		scan.close();
		
		String mensaje = num % 2 == 0 ? "Par" : "Impar";
		
		System.out.println("El número escogido es: " + mensaje);

	}

}
