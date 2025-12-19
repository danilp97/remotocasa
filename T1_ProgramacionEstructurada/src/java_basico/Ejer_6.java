package java_basico;

import java.util.Scanner;

public class Ejer_6 {

	// Diseña un programa que lea por teclado una variable entera para representar
	// la cantidad de productos en stock. Luego, pide al usuario que ingrese una cantidad y muestra
	// un mensaje que diga “hay suficiente stock:” seguido de true si es verdad o false si no lo es

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int stock = 100;

		System.out.println("¿Que cantidad desea?");
		int cantidad = scan.nextInt();
		
		scan.close();

		boolean hayStock = (stock >= cantidad) == true;
		
		System.out.println("Hay suficiente stock: " + hayStock);

	}

}
