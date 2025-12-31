package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_28 {

	// Ídem que el ej. anterior, suponiendo que cada mes tiene un número distinto de
	// días (suponer que febrero tiene siempre 28 días).

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un día:");
		int dia = scan.nextInt();

		System.out.println("Escribe un mes:");
		int mes = scan.nextInt();

		System.out.println("Escribe un año:");
		int anyo = scan.nextInt();

		scan.close();

		if ((dia < 1 && dia > 31) && (mes < 1 && mes > 12) && (anyo < 0000 && anyo > 2025)) {
			System.err.println("La fecha  no es correcta");
			return;
		} else if (dia >= 1 && dia <=28 || mes == 2) {
			if (dia ==28) {
				System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia = 1) + "/" + (mes + 1) + "/" + anyo);
			} else {
			System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia + 1) + "/" + mes + "/" + anyo);
			}
		} else if (dia >=1 && dia <=30 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia == 30) {
				System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia = 1) + "/" + (mes + 1) + "/" + anyo);
			} else {
			System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia + 1) + "/" + mes + "/" + anyo);
			}
		} else {
			if (dia == 31) {
				System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia = 1) + "/" + (mes + 1) + "/" + anyo);
			} else if (mes == 12) {
			System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia + 1) + "/" + (mes = 1) + "/" + (anyo + 1));
			}
		}
	}

}
