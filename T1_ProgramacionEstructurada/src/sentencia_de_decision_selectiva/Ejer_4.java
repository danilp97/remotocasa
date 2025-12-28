package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_4 {
	
	// Realizar un programa que lea un número (que debe ser menor de 10) e indique si es o no primo
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número entero:");
		int num = scan.nextInt();
		
		scan.close();
		
		if (num <=1 || num > 10) {
			System.err.println("El número debe ser mayor a uno y menor o igual que 10");
		} else if (num == 2 || num == 3 || num == 5 || num == 7) {
			System.out.println("El número " + num + " es primo");
		} else {
			System.out.println("El número " + num + " no es primo");
		}
		
	}

}
