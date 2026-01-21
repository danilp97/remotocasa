package sentencia_repetitiva_bucles;

public class Ejer_7 {

	// Programa que sume el número 5 y sus múltiplos desde el 1 hasta el 100 y
	// muestre el resultado por pantalla.

	public static void main(String[] args) {

		int suma = 0;

		for (int i = 5; i <= 100; i += 5) {
			suma += i;
		}

		System.out.println(suma);
	}

}
