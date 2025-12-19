package java_basico;

import java.util.Scanner;

public class Ejer_7 {

	// Escribe un programa que lea por teclado dos variables de tipo double para representar el precio
	// de un artículo y el porcentaje de descuento. Calcula el precio con descuento y muestra el resultado en pantalla
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cúal es el precio del articulo?");
		double precioArticulo = scan.nextDouble();
		
		System.out.println("¿Que descuento tiene el articulo?");
		double descuentoArticulo = scan.nextDouble();
		
		scan.close();
		
		double precioFinal = (precioArticulo * descuentoArticulo) / 100 ;
		
		System.out.printf("El precio final con el descuento es de: %.2f%n" , precioFinal);
		
	}

}
