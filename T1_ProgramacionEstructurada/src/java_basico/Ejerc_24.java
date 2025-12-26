package java_basico;

import java.util.Scanner;

public class Ejerc_24 {
	
	// Crea un programa que lea por teclado dos variables enteras para representar las edades de dos
	// personas. Muestra en pantalla un mensaje que indique “Pueden acceder” o no. El acceso es
	// permitido a personas de mayor de 18 o a personas mayores de 21 que acompañen a un menor de edad.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Edad de la primera persona:");
		int edad1 = scan.nextInt();
		
		System.out.println("Edad de la segunda persona:");
		int edad2 = scan.nextInt();
		
		scan.close();
		
		String mensaje = edad1>=18 && edad2>=18 || edad1>=21 && edad2>=0 || edad1>=0 && edad2>=21 ? "Pueden acceder" : "No pueden acceder";
		
		System.out.println(mensaje);

	}

}
