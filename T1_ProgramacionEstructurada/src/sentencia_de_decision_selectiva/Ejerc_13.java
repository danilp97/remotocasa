package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejerc_13 {
	
	// Recibir un número entre 1 y 7 e indicar a qué día de la semana corresponde
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 1 y 7:");
		int num = scan.nextInt();
		
		scan.close();
		
		if (num < 1 || num > 7) {
			System.err.println("El número introducido no es correcto. Tiene que ser entre 1 y 7");
		} else if (num >=1 && num <=7) {
			if (num == 1) {
				System.out.println("El número introducido indica que es Lunes");
			} else if (num == 2) {
				System.out.println("El número introducido indica que es Martes");
			} else if (num == 3) {
				System.out.println("El número introducido indica que es Miercoles");
			} else if (num == 4) {
				System.out.println("El número introducido indica que es Jueves");
			} else if (num == 5) {
				System.out.println("El número introducido indica que es Viernes");
			} else if (num == 6) {
				System.out.println("El número introducido indica que es Sábado");
			} else {
				System.out.println("El número introducido indica que es Domingo");
			}
		}

	}

}
