package java_basico;

import java.util.Scanner;

public class Ejer_5 {
	
	// Escribe un programa que lea por teclado dos variables enteras para representar el ancho y la
	// altura de un rectángulo. Calcula y muestra el área del rectángulo en pantalla
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Que ancho tiene el rectángulo en cm?");
		int ancho = scan.nextInt();
		
		System.out.println("¿Que altura tiene el rectángulo en cm?");
		int altura = scan.nextInt();
		
		scan.close();
		
		int area = ancho * altura;
		
		System.out.println("El área del rectángulo es de: " + area);
		
	}

}
