package java_basico;

import java.util.Scanner;

public class Ejerc_20 {
	
	// Escribe un programa que lea por teclado dos variables de tipo double para representar las
	// calificaciones de un estudiante en dos asignaturas. Muestra en pantalla un mensaje que indique
	// si el estudiante aprobó al menos una de ellas
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota de la primera asignatura");
		double nota1 = scan.nextDouble();
		
		System.out.println("Nota de la segunda asignatura");
		double nota2 = scan.nextDouble();
		
		scan.close();
		
		String mensaje = (nota1 >= 5 && nota2 <=5 ) || (nota1 <= 5 && nota2 >=5)? "El estudiante aprobo al menos una asignatura" : "El estudiante no aprobó ninguna asignatura";
		
		System.out.println(mensaje);

	}

}
