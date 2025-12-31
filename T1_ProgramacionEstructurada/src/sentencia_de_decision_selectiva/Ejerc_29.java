package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_29 {

	// Pedir dos fechas y mostrar el número de días que hay de diferencia.
	// Suponiendo todos los meses de 30 días

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Día fecha 1:");
		int dia1 = scan.nextInt();

		System.out.println("Mes fecha 1:");
		int mes1 = scan.nextInt();

		System.out.println("Año fecha 1:");
		int anyo1 = scan.nextInt();

		System.out.println("Día fecha 2:");
		int dia2 = scan.nextInt();

		System.out.println("Mes fecha 2:");
		int mes2 = scan.nextInt();

		System.out.println("Año fecha 2:");
		int anyo2 = scan.nextInt();

		scan.close();

		if (dia1 < 1 || mes1 < 1 || anyo1 < 0000 || dia2 < 1 || mes2 < 1 || anyo2 < 0000) {
			System.err.println("La fecha no es correcta");
			return;
		} else if ((dia1 >= 1 && dia2 >= 1) && (dia1 <= 30 && dia2 <= 30) && (mes1 >= 1 && mes2 >= 1)
				&& (mes1 <= 12 && mes2 <= 12) && (anyo1 >= 0000 && anyo2 >= 0000) && (anyo1 <= 2025 && anyo2 <= 2025)) {
			int total = dia1 - dia2;
			System.out.println(total);
		}
	}

}
