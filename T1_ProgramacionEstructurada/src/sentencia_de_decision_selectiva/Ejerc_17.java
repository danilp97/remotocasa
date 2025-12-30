package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_17 {

	// Recibe 4 char y comprueba que ha recibido, en orden ‘g’ ‘a’ ‘t’ ‘o’.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Escribe una letra g:");
		char letra1 = scan.nextLine().charAt(0);

		System.out.println("Escribe una letra a:");
		char letra2 = scan.nextLine().charAt(0);

		System.out.println("Escribe una letra t:");
		char letra3 = scan.nextLine().charAt(0);

		System.out.println("Escribe una letra o:");
		char letra4 = scan.nextLine().charAt(0);

		scan.close();

		if (letra1 == 103 && letra2 == 97 && letra3 == 116 && letra4 == 111) {
			System.out.println("Se ha recibido en orden la palabra gato");
		} else {
			System.out.println("No se ha introducido la palabra correcta");
		}

	}

}
