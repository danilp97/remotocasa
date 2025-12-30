package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_15 {
	
	// Recibir un numero entre 1 y 99 e indicar si su decena es un número par o impar.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número entero entre 1 y 99");
		int n = scan.nextInt();
		
		scan.close();
		
		if (n < 1 || n > 99) {
			System.err.println("El número introducido no es correcto. Tiene que ser entre 1 y 99");
		} else if (n >= 1 && n <= 9) {
			if (n % 2 == 0) {
				System.out.println("El número introducido es par");
			} else {
				System.out.println("El número introducido es impar");
			}
		} else if (n >= 10 && n <= 99) {
			int decenas = n % 10;
			if (decenas % 2 == 0) {
				System.out.println("El número introducido es par");
			} else {
				System.out.println("El número introducido es impar");
			}
		}
	}

}
