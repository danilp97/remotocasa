package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_27 {

	// Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
	// siguiente. Suponer que todos los meses tienen 30 días

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe un día:");
		int dia = scan.nextInt();

		System.out.println("Escribe un mes:");
		int mes = scan.nextInt();

		System.out.println("Escribe un año:");
		int anyo = scan.nextInt();

		scan.close();

		if ((dia < 1 && dia > 30) && (mes < 1 && mes > 12) && (anyo < 0000 && anyo > 2025)) {
			System.err.println("La fecha  no es correcta");
			return;
		} else if (dia == 30) {
			if (mes == 12) {
				System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia = 1) + "/" + (mes = 1) + "/" + (anyo + 1));
			} else {
				System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia = 1) + "/" + (mes + 1) + "/" + anyo);
			}
		} else {
			System.out.println("La fecha es correcta y la fecha del día siguiente es: " + (dia + 1) + "/" + mes + "/" + anyo);
		}

	}

}
