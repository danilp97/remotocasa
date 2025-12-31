package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_20 {

	// Recibe 3 números, op, num1 y num2. si op es 1, escribe num1+num2,
	// si op es 2, escribe num1-num3, en todos los otros casos escribe “Operación no
	// valida”

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num1 = scan.nextInt();

		System.out.println("Escribe otro número entero:");
		int num2 = scan.nextInt();
		
		System.out.println("Escribe 1 o 2:");
		int op = scan.nextInt();

		scan.close();

		int suma;
		int resta;

		if (op < 1 || op > 2) {
			System.err.println("Operación no válida");
		} else if (op == 1) {
			suma = num1 + num2;
			System.out.println(suma);
		} else {
			resta = num1 - num2;
			System.out.println(resta);
		}

	}

}
