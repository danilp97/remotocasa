package hospital;

import empleado.Empleado;

public class Hospital {

	private Empleado[] empleados;
	private int contador;

	public Hospital(int capacidad) {
		empleados = new Empleado[capacidad];
		contador = 0;
	}

	public void agregarEmpleado(Empleado e) {
		if (contador < empleados.length) {
			empleados[contador] = e;
			contador++;
		} else {
			System.out.println("No se pueden agregar más empleados. Capacidad llena.");
		}
	}

	public void mostrarEmpleados() {
		for (int i = 0; i < contador; i++) {
			empleados[i].mostrarDatos();
		}
	}

	public double calcularGastoTotal() {
		double total = 0;
		for (int i = 0; i < contador; i++) {
			total += empleados[i].calcularSalario();
		}
		return total;
	}

}
