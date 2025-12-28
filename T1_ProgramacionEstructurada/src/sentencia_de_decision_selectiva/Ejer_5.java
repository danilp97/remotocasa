package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_5 {
	
	// Realizar un programa que lea un número entero de tres cifras e indique si se lee igual de izquierda a derecha que de derecha a izquierda
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número de tres cifras:");
		int n = scan.nextInt();
		
		scan.close();
		
		int nPosCentenas = n / 100;
		int nPosUnidades = n % 10;
		
		if (n < 000 || n > 999) {
			System.err.println("El número introducido no es correcto");
			return;
		} else {
			String capicua = nPosCentenas == nPosUnidades ? "El número es capicúa" : "El número no es capicúa";
			System.out.println(capicua);
		}
	}

}
