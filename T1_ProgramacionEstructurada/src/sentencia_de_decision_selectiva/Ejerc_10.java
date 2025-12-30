package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_10 {
	
	// Realizar un programa que lea tres longitudes y determine si forman o no un triángulo. Si es un 
	// triángulo, determinar de qué tipo de triángulo se trata entre: equilátero (si tiene tres lados iguales), 
	// isósceles (si tiene dos lados iguales) o escaleno (si tiene tres lados desiguales). Considerar
	// que para formar un triángulo se requiere que: "el lado mayor sea menor que la suma de los otros dos lados".
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Longitud lado 1:");
		int lado1 = scan.nextInt();
		
		System.out.println("Longitud lado 2:");
		int lado2 = scan.nextInt();
		
		System.out.println("Longitud lado 3:");
		int lado3 = scan.nextInt();
		
		scan.close();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triángulo es equilátero");
		} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			System.out.println("El triángulo es isósceles");
		} else {
			System.out.println("El triángulo es escaleno");
		}
	}

}
