package java_basico;

import java.util.Scanner;

public class Ejerc_21 {
	
	// Crea un programa que lea por teclado tres variables enteras para representar las edades de tres
	// personas. Muestra en pantalla un mensaje que indique si al menos dos de ellas son mayores de 21 años
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Edad de la primera persona:");
		int edad1 = scan.nextInt();
		
		System.out.println("Edad de la segunda persona:");
		int edad2 = scan.nextInt();
		
		System.out.println("Edad de la tercera persona:");
		int edad3 = scan.nextInt();
		
		scan.close();
		
		String mensaje = ( (edad1 >= 21 && edad2 >= 21) || (edad1 >= 21 && edad3 >= 21) || (edad2 >= 21 && edad3 >= 21))
				? "Al menos dos de ellas son mayores de edad" : "Ninguna es mayor de edad";
		
		System.out.println(mensaje);
		
	}

}
