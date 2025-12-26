package java_basico;

import java.util.Scanner;

public class Ejerc_23 {
	
	// Escribe un programa que lea por teclado tres variables enteras para representar las horas
	// trabajadas en tres días diferentes. Muestra en pantalla un mensaje que indique si la persona
	// trabajó entre 8 y 20 horas en los tres días o no.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Horas trabajadas en el día 1:");
		int horas1 = scan.nextInt();
		
		System.out.println("Horas trabajadas en el día 2:");
		int horas2 = scan.nextInt();
		
		System.out.println("Horas trabajadas en el día 3:");
		int horas3 = scan.nextInt();
		
		scan.close();
		
		int sumaHoras = horas1 + horas2 + horas3;
		
		String mensaje = sumaHoras>=8 && sumaHoras<=20 ? "La persona trabajó entre 8 y 20 horas" : "La persona no trabajó las horas esperadas";
		
		System.out.println(mensaje);

	}

}
