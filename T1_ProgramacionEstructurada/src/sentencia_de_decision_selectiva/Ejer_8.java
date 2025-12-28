package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_8 {
	
	// Realizar un programa que lea un número entero de 3 cifras, y forme el mayor número posible 
	// con las cifras del número ingresado. El número formado debe tener el mismo signo que el número ingresado
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un número de tres cifras:");
		int n = scan.nextInt();
		
		scan.close();
		
		int nPos1 = n / 100;
		int nPos2 = (n / 10) % 10;
		int nPos3 = n % 10;
		
		if ((nPos1 > nPos2) && (nPos1 > nPos3)) {
			if (nPos2>nPos3) {
				System.out.print(nPos1);
				System.out.print(nPos2);
				System.out.print(nPos3);
			}else if (nPos3>nPos2) {
				System.out.print(nPos1);
				System.out.print(nPos3);
				System.out.print(nPos2);
			}
		} else if ((nPos2 > nPos1) && (nPos2 > nPos3)) {
			if (nPos1>nPos3) {
				System.out.print(nPos2);
				System.out.print(nPos1);
				System.out.print(nPos3);		
			} else if (nPos3>nPos1) {
				System.out.print(nPos2);
				System.out.print(nPos3);
				System.out.print(nPos1);
			}
		} else if ((nPos3 > nPos1) && (nPos3 > nPos2)) {
			if (nPos1>nPos2) {
				System.out.print(nPos3);
				System.out.print(nPos1);
				System.out.print(nPos2);		
			} else if (nPos2>nPos1) {
				System.out.print(nPos3);
				System.out.print(nPos2);
				System.out.print(nPos1);
			}
		}
	}
}
