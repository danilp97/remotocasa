package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_2 {

	// Realizar un programa que lea un año e indique si es o no bisiesto

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un año (mínimo 0000, máximo 2025):");
		int anyo = scan.nextInt();

		scan.close();

		if (anyo % 4 == 0 && anyo % 100 == 0 && anyo % 400 == 0) {
			
			System.out.println("El año " + anyo + " es bisiesto");
			
		} else {
			
			System.out.println("El año " + anyo + " no es bisiesto");
		}

	}

}
