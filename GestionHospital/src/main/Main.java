package main;

import empleado.Empleado;
import hospital.Hospital;
import empleado.Medico;
import empleado.Administrativo;
import empleado.Enfermero;
import empleado.Turno;

public class Main {
	public static void main(String[] args) {

		Hospital hospital = new Hospital(10);

		Empleado m1 = new Medico("Ana López", "12345678A", 2000, "Cardiología", 5);
		Empleado m2 = new Medico("Luis Pérez", "23456789B", 2200, "Pediatría", 3);
		
		Empleado e1 = new Enfermero("Marta Ruiz", "34567890C", 1500, Turno.MAÑANA);
		Empleado e2 = new Enfermero("Carlos Gómez", "45678901D", 1500, Turno.NOCHE);
		
		Empleado a1 = new Administrativo("Laura Díaz", "56789012E", 1400, 10);
		
		hospital.agregarEmpleado(m1);
		hospital.agregarEmpleado(m2);
		hospital.agregarEmpleado(e1);
		hospital.agregarEmpleado(e2);
		hospital.agregarEmpleado(a1);
		
		System.out.println("LISTA DE EMPLEADOS");
		hospital.mostrarEmpleados();
		
		double gastoTotal = hospital.calcularGastoTotal();
		System.out.println("Gasto total en salarios: " + gastoTotal + " euros");
	}
}
