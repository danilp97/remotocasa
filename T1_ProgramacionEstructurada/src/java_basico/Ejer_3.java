package java_basico;

import java.util.Scanner;

public class Ejer_3 {

	// Crea un programa que lea por teclado una variable booleana para representar
	// si un estudiante ha aprobado un examen (true si aprobó, false si no). Luego, muestra un
	// mensaje en pantalla que indique “El estudiante ha aprobado?” seguido de true o false

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿El estudiante ha aprobado?(True = Aprobado , False = No Aprobado)");
		boolean aprobado = scan.nextBoolean();
		
		scan.close();
		
		System.out.println("El estudiante ha aprobado:" + aprobado);

	}

}
