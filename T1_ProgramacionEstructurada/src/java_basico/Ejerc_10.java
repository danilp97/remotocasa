package java_basico;

import java.util.Scanner;

public class Ejerc_10 {
	
	// Escribe un programa que lea por teclado dos variables enteras para representar la distancia en
	// kilómetros y el tiempo en horas. Calcula y muestra la velocidad promedio en kilómetros por hora.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuánta distancia recorre en kilometros?");
		int distancia = scan.nextInt();
		
		System.out.println("¿Cuánto tiempo pasa en horas?");
		int tiempo = scan.nextInt();
		
		scan.close();
		
		int velocidadPromedio = distancia / tiempo ;
		
		System.out.println("La velocidad promedio es de: " + velocidadPromedio + " km/h");

	}

}
