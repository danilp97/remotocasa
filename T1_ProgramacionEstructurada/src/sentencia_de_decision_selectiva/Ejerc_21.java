package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_21 {

	// Pedir los coeficientes de una ecuación se 2° grado, y muestre sus soluciones
	// reales. Si no existen debe indicarlo.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe el coeficiente de a:");
		double a = scan.nextDouble();

		System.out.println("Escribe el coeficiente de a:");
		double b = scan.nextDouble();

		System.out.println("Escribe el coeficiente de a:");
		double c = scan.nextDouble();

		scan.close();

		double determinante = Math.pow(b, 2) - 4 * a * c;

		if (determinante < 0) {
			System.err.println("Los coeficientes no son correctos");
			return;
		} else {
			double formula = (-b + -Math.sqrt(determinante)) * (2 * a);
			System.out.println(formula);
		}

	}

}
