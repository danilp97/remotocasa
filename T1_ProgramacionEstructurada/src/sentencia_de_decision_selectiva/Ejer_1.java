package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_1 {
	
	// Realizar un programa que dados dos números enteros leídos por teclados, diga si alguno de los dos es múltiplo de otro
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número entero:");
		int num1 = scan.nextInt();
		
		System.out.println("Escribe un segundo número entero:");
		int num2 = scan.nextInt();
		
		scan.close();
		
		if (num1 % num2 == 0) {
			System.out.println("Los números son múltiplos");
		} else {
			System.out.println("Los números no son múltiplos");
		}
	}

}
