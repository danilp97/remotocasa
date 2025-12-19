package java_basico;

import java.util.Scanner;

public class Ejer_4 {
	
	//Diseña un programa que lea por teclado una variable entera para representar la edad de un
	//usuario. Luego, muestra un mensaje que diga "Eres mayor de edad:” seguido de true si es verdad
	//o false si no lo es

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("¿Que edad tiene el usuario?");
		int edad = scan.nextInt();
		
		scan.close();
		
		boolean esMayorDeEdad = (edad >= 18) == true;
		
		System.out.println("Eres mayor de edad: " + esMayorDeEdad);
		
	}

}
