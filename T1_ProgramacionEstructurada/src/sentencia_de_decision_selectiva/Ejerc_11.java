package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_11 {

	// Recibir 4 números e indicar el más pequeño y el más grande

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número entero:");
		int num1 = scan.nextInt();

		System.out.println("Introduce otro número entero:");
		int num2 = scan.nextInt();

		System.out.println("Introduce otro número entero:");
		int num3 = scan.nextInt();

		System.out.println("Introduce otro número entero:");
		int num4 = scan.nextInt();

		scan.close();

		int maximo = num1;
		int minimo = num1;
		
		if (num2 > num1) {
			maximo = num2;
		}
		if (num3 > num1) {
			maximo = num3;
		}
		if (num4 > num1) {
			maximo = num4;
		}
		if (num2 < num1) {
			minimo = num2;
		}
		if (num3 < num1) {
			minimo = num3;
		}
		if (num4 < num1) {
			minimo = num4;
		}
		
		System.out.println("El número mayor es: " + maximo);
		System.out.println("El número menor es: " + minimo);

	}
}
