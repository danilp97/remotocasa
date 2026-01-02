package sentencia_repetitiva_bucles;

import java.util.Scanner;

public class Ejer_6 {
	
	// Programa que lea un número N mayor que 0 y calcule la siguiente suma:
	// 1+2+3+...+N
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número entero mayor que cero:");
		int n = scan.nextInt();
		
		scan.close();
		
		int contador = 1;
		int suma = 0;
		
		if (n < 0) {
			System.err.println("El número tiene que ser mayor que 0");
			return;
		} while (contador <= n) {
			suma += contador;
			contador++;
		}
		System.out.println(suma);
	}

}
