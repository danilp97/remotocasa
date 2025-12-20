package java_basico;

import java.util.Scanner;

public class Ejerc_12 {
	
	// Crea un programa que lea por teclado una variable entera para representar la cantidad de
	// unidades vendidas de un producto y otra variable double para representar el precio unitario.
	// Calcula y muestra el monto total de ventas.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuántas unidades se han vendido de un producto?");
		int unidades = scan.nextInt();
		
		System.out.println("¿Cuántas es el precio unitario de un producto?");
		double precioUnitario = scan.nextDouble();
			
		scan.close();
		
		double montoTotal = unidades * precioUnitario;
		
		System.out.println("El monto total de ventas es de: " + montoTotal);
		
	}

}
