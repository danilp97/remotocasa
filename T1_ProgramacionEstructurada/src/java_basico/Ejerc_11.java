package java_basico;

import java.util.Scanner;

public class Ejerc_11 {
	
	// Diseña un programa que lea por teclado una variable double para representar el radio de un
	// círculo. Calcula y muestra el área del círculo en pantalla.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuánto es el radio del círculo?");
		double radioCirculo = scan.nextDouble();
		
		scan.close();
		
		double areaCirculo = 3.14 * (radioCirculo * radioCirculo);
		
		System.out.printf("El área del circulo es de: %.2f%n" , areaCirculo);	

	}

}
