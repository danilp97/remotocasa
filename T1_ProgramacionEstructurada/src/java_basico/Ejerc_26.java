package java_basico;

import java.util.Scanner;

public class Ejerc_26 {
	
	// Escribe un programa que lea de teclado tres variables de tipo double para representar las
	// longitudes de los lados de un triángulo. Muestra en pantalla si el triángulo es equilátero,
	// isósceles o escaleno
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Longitud lado 1:");
		double lado1 = scan.nextDouble();
		
		System.out.println("Longitud lado 2:");
		double lado2 = scan.nextDouble();
		
		System.out.println("Longitud lado 3:");
		double lado3 = scan.nextDouble();
		
		scan.close();
		
		String mensaje = (lado1 == lado2 && lado2 == lado3) ? " equilátero." : (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3) ? " isósceles." : " escaleno.";
		
		System.out.println("El triángulo es" + mensaje);

	}

}
