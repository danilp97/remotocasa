package sentencia_de_decision_selectiva;

import java.util.Scanner;

public class Ejer_9 {
	
	// Una compañía dedicada al alquiler de coches cobra un monto fijo de 200 euros para los primeros 300 km de recorrido. 
	// Para más de 300 km y hasta 1000 km, cobra un monto adicional de 15 euros por cada kilómetro en exceso sobre
	// 300, además del fijo. Para más de 1000 km cobra un monto adicional de 10 euros por cada kilómetro en exceso sobre 1000, 
	// además del fijo y de la cantidad extra correspondiente por los kilómetros entre 300 y 1000. Realizar
	// un programa que dada la cantidad de kilómetros muestre la cantidad a pagar
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuántos kilometros ha recorrido el coche alquilado?");
		int km = scan.nextInt();
		
		scan.close();
		
		if (km >= 0 && km <= 300) {
			int pago = 200;
			System.out.println("Los kilometros recorridos son: " + km);
			System.out.println("La cantidad a pagar es de: " + pago);
		} else if (km >= 301 && km <=1000) {
			int pagoAd = ((km - 300)*15) + 200;
			System.out.println("Los kilometros recorridos son: " + km);
			System.out.println("La cantidad a pagar es de: " + pagoAd);
		} else if(km>=1001) {
			int pagoAdExtra = km + 15 * 700 + 10 * (km - 1000);
			System.out.println("Los kilometros recorridos son: " + km);
			System.out.println("La cantidad a pagar es de: " + pagoAdExtra);
		}

	}

}
