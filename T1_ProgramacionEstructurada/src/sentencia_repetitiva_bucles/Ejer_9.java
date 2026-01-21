package sentencia_repetitiva_bucles;

import java.util.Scanner;

public class Ejer_9 {
	
	// Programa que lea dos números: a y b de tipo int. El programa debe calcular ab
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un primer valor");
		int a = scan.nextInt();
		
		System.out.println("Escribe un segundo valor");
		int b = scan.nextInt();
		
		scan.close();
		
		int resultado = 1;
		
		for(int i = 1; i<=b;i++) {
			resultado *=a;
		}
		
		System.out.println("El resultado es: " + resultado);

	}

}
