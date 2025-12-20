package java_basico;

import java.util.Scanner;

public class Ejerc_16 {

	// Escribe un programa que lea por teclado dos variables enteras para
	// representar la cantidad de productos en dos almacenes diferentes. Muestra en pantalla un mensaje que
	// indique cuál de los dos almacenes tiene más productos.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Cantidad de productos en el almacén 1: ");
		int cant1 = scan.nextInt();

		System.out.println("Cantidad de productos en el almacén 2: ");
		int cant2 = scan.nextInt();

		scan.close();
		
		String mensaje = cant1 > cant2 ? "El almacén 1 tiene más productos" : "El almacén 2 tiene más productos";
		
		System.out.println(mensaje);

	}

}
