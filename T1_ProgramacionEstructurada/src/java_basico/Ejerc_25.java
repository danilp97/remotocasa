package java_basico;

import java.util.Scanner;

public class Ejerc_25 {
	
	// Escribe un programa que lea por teclado dos variables de tipo double para representar las notas
	// de un estudiante en dos evaluaciones. Muestra en pantalla el mensaje “Muy bien” si el alumno
	// ha aprobado las dos asignaturas y la suma de las dos notas es al menos 14.
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota de la primera evaluación:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Nota de la segunda evaluación:");
		double nota2 = scan.nextDouble();
		
		scan.close();
		
		double sumaNotas = nota1 + nota2;
		
		String mensajeNotas = (nota1 >= 5 && nota2>=5) ? "Muy bien has aprobado todo" : "Necesitas mejorar";
		
		String mensajeSuma = (sumaNotas>=14) ? " y has sacado al menos 14" : " y has sacado menos de 14";
		
		System.out.println(mensajeNotas + mensajeSuma);
		
	}

}
