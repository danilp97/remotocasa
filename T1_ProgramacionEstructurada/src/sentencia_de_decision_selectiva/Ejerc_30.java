package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_30 {

	// Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la
	// forma: cero, uno, dos, tres...

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Dime una nota de 0 a 10:");
		int nota = scan.nextInt();

		scan.close();

		if (nota < 0 || nota > 10) {
			System.err.println("Esa nota no es válida");
			return;
		} else {
			switch (nota) {
			case 0:
				System.out.println("Has sacado un cero");
				break;
			case 1:
				System.out.println("Has sacado un uno");
				break;
			case 2:
				System.out.println("Has sacado un dos");
				break;
			case 3:
				System.out.println("Has sacado un tres");
				break;
			case 4:
				System.out.println("Has sacado un cuatro");
				break;
			case 5:
				System.out.println("Has sacado un cinco");
				break;
			case 6:
				System.out.println("Has sacado un seis");
				break;
			case 7:
				System.out.println("Has sacado un siete");
				break;
			case 8:
				System.out.println("Has sacado un ocho");
				break;
			case 9:
				System.out.println("Has sacado un nueve");
				break;
			case 10:
				System.out.println("Has sacado un diez");
				break;
			}
		}
	}

}
