package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_12 {
	
	// Recibir 4 números e indicar si son todos el mismo número.
	
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
		
		if (num1 == num2 && num1 == num3 && num1 == num4) {
			System.out.println("Todos los números son iguales");
		} else {
			System.out.println("No son iguales todos los números");
		}

	}

}
