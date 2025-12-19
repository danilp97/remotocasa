package java_basico;

import java.util.Scanner;

public class Ejer_9 {

	// Diseña un programa que lea por teclado una variable entera para representar la temperatura en
	// grados Celsius. Convierte esta temperatura a grados Fahrenheit utilizando la fórmula: Fahrenheit
	// = (Celsius * 9/5) + 32, y muestra el resultado
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuál es la temperatura en grados Celsius?");
		int celsius = scan.nextInt();
		
		scan.close();
		
		int fahrenheit = ((celsius * 9) /5) + 32;
		
		System.out.println("La temperatura convertida en Fahrenheit es de: " + fahrenheit);
		
	}

}
