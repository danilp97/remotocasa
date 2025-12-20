package java_basico;

import java.util.Scanner;

public class Ejerc_17 {

	// Escribe un programa que lea por teclado tres variables enteras y muestre en
	// pantalla la suma de dichos números, pero si la suma es mayor que 100, muestra un mensaje
	// indicando que es demasiado grande

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un primer número entero: ");
		int num1 = scan.nextInt();

		System.out.println("Introduce un segundo número entero: ");
		int num2 = scan.nextInt();

		System.out.println("Introduce un tercer número entero: ");
		int num3 = scan.nextInt();

		scan.close();

		int suma = num1 + num2 + num3;

		String resultado = (suma > 100) ? "La suma es demasiado grande" : "La suma es: " + suma;
		
		System.out.println(resultado);

	}

}
