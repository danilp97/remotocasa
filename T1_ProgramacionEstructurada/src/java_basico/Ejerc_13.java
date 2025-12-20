package java_basico;

import java.util.Scanner;

public class Ejerc_13 {

	// Diseña un programa que lea por teclado dos variables enteras y muestre en
	// pantalla el valor de la variable con el mayor número.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un primer número entero:");
		int num1 = scan.nextInt();
		
		System.out.println("Escribe un segundo número entero:");
		int num2 = scan.nextInt();
		
		scan.close();
		
		int mensaje = (num1>num2) ? num1 : num2;
		
		System.out.println("El número mayor es: " + mensaje);

	}

}
