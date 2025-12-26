package java_basico;

import java.util.Scanner;

public class Ejerc_22 {
	
	// Escribe un programa que lea por teclado tres variables de tipo double para representar las
	// longitudes de los lados de un triángulo. Muestra en pantalla si el triángulo es equilátero o no
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Longitud del primer lado:");
		double lado1 = scan.nextDouble();
		
		System.out.println("Longitud del segundo lado:");
		double lado2 = scan.nextDouble();
		
		System.out.println("Longitud del tercer lado:");
		double lado3 = scan.nextDouble();
		
		scan.close();
		
		String mensaje = (lado1 == lado2) && (lado2 ==lado3) ? "El triángulo es equilátero" : "No es equilátero";
		
		System.out.println(mensaje);

	}

}
