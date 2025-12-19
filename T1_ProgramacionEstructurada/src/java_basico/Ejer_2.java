package java_basico;

import java.util.Scanner;

public class Ejer_2 {
	
	// Crea un programa que lea por teclado tres variables de tipo doble (números
	// decimales) y calcule
	// su promedio. Luego, muestra el resultado en la pantalla
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un primer número decimal:");
		double num1 = scan.nextDouble();

		System.out.println("Escribe un segundo número decimal:");
		double num2 = scan.nextDouble();

		System.out.println("Escribe un tercer número decimal:");
		double num3 = scan.nextDouble();

		scan.close();

		double promedio = (num1 + num2 + num3) / 3;

		System.out.printf("El promedio de los tres números es de: %.2f%n", promedio);

	}

}
