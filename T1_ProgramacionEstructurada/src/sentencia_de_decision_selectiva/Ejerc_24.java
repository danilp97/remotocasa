package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_24 {

	// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("¿Que nota has sacado?");
		int nota = scan.nextInt();

		scan.close();

		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Has sacado un " + nota + " por lo que tienes un Insuficiente");
			break;
		case 5:
			System.out.println("Has sacado un " + nota + " por lo que tienes un Suficiente");
			break;
		case 6:
			System.out.println("Has sacado un " + nota + " por lo que tienes un Bien");
			break;
		case 7, 8:
			System.out.println("Has sacado un " + nota + " por lo que tienes un Notable");
			break;
		case 9,10:
			System.out.println("Has sacado un " + nota + " por lo que tienes un Sobresaliente");
			break;
		default:
			System.err.println("Esa nota no existe");
			break;
		}
	}

}
