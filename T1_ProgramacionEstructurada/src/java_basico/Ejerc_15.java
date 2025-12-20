package java_basico;

import java.util.Scanner;

public class Ejerc_15 {
	
	// Escribe un programa que lea por teclado dos variables de tipo double y muestre en pantalla el
	// resultado de la resta de ambas, pero asegurándote de que el resultado nunca sea negativo.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un primer número decimal");
		double num1 = scan.nextDouble();
		
		System.out.println("Introduce un segundo número decimal");
		double num2 = scan.nextDouble();
		
		scan.close();
		
		double resultado = (num1 - num2 >= 0) ? (num1 - num2) : (num2 - num1);

        System.out.println("Resultado de la resta (no negativo): " + resultado);
		
	}

}
