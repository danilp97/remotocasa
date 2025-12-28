package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_7 {
	
	// Realizar un programa que lea tres números enteros e indique cuál es el mayor de los tres
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número entero:");
		int n1 = scan.nextInt();
		
		System.out.println("Escribe un segundo número entero:");
		int n2 = scan.nextInt();
		
		System.out.println("Escribe un tercer número entero:");
		int n3 = scan.nextInt();
		
		scan.close();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("El mayor número entre los tres es: " + n1);
		} else if (n2 > n1 && n2 > n3){
			System.out.println("El mayor número entre los tres es: " + n2);
		} else {
			System.out.println("El mayor número entre los tres es: " + n3);
		}

	}

}
