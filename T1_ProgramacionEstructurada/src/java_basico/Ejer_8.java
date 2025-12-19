package java_basico;

import java.util.Scanner;

public class Ejer_8 {
	
	// Crea un programa que lea por teclado una variable entera para representar la cantidad de horas
    // trabajadas en una semana. Luego, declara una variable double para representar la tarifa por
	// hora. Calcula y muestra el salario semanal.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("¿Cuantas horas ha trabajado en la semana?");
		int horasTrabajadas = scan.nextInt();
		
		System.out.println("¿Cuál es la tarifa por hora trabajada?");
		double tarifa = scan.nextDouble();
		
		scan.close();
		
		double salario = horasTrabajadas * tarifa;
		
		System.out.printf("El salario semanal es de: %.2f" , salario); 
		System.out.printf(" euros");
		
	}

}
