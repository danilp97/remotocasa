package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_25 {

	// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
	// Suponiendo todos los meses de 30 días

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un día:");
		int dia = scan.nextInt();

		System.out.println("Escribe un mes:");
		int mes = scan.nextInt();

		System.out.println("Escribe un año:");
		int anyo = scan.nextInt();

		scan.close();

		if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anyo >= 0000 && anyo <= 2025)) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha no es correcta");
		}

	}

}
