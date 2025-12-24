package java_basico;

import java.util.Scanner;

public class Ejerc_18 {
	
	//  Diseña un programa que lea de teclado dos variables booleanas para representar si un
	// estudiante aprobó dos asignaturas diferentes. Luego, muestra en pantalla un mensaje que
	// indique si el estudiante aprueba el curso o repite
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota de la primera asignatura");
		double nota1 = scan.nextDouble();
		
		System.out.println("Nota de la segunda asignatura");
		double nota2 = scan.nextDouble();
		
		scan.close();
		
		double notaTotal = nota1 + nota2;
		
		String mensaje = notaTotal >= 10 ? "El estudiante pasa de curso" : "El estudiante repite el curso";
		
		System.out.println(mensaje);
		
	}

}
