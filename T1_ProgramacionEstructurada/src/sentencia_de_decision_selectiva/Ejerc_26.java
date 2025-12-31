package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_26 {

	// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con
	// meses de 28, 30 y 31 días y sin años bisiestos

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un día:");
		int dia = scan.nextInt();

		System.out.println("Escribe un mes:");
		int mes = scan.nextInt();

		System.out.println("Escribe un año:");
		int anyo = scan.nextInt();

		scan.close();

		if ((dia < 1 && dia > 31) || (mes < 1 && mes > 12) || (anyo < 0000 && anyo > 2025)) {
			System.err.println("La fecha no es correcta");
			return;
		} else if (anyo > 0000 || anyo < 2025) {
			if (mes == 2) {
				if (dia > 28) {
					System.err.println("La fecha no es correcta");
					return;
				} else {
					System.out.println("La fecha es correcta");
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia > 30) {
					System.err.println("La fecha no es correcta");
					return;
				} else {
					System.out.println("La fecha es correcta");
				}
			} else {
				System.out.println("La fecha es correcta");
			}
		}

	}

}
