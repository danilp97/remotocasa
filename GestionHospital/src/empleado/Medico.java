package empleado;

public class Medico extends Empleado {

	private String especialidad;
	private int numeroGuardias;

	public Medico(String nombre, String dni, double salarioBase, String especialidad, int numeroGuardias) {
		super(nombre, dni, salarioBase);
		this.especialidad = especialidad;
		this.numeroGuardias = numeroGuardias;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getNumeroGuardias() {
		return numeroGuardias;
	}

	public void setNumeroGuardias(int numeroGuardias) {
		this.numeroGuardias = numeroGuardias;
	}

	public double calcularSalario() {
		return salarioBase + (numeroGuardias * 50);
	}
	
	public void mostrarDatos() {
		System.out.println("Médico");
		super.mostrarDatos();
		System.out.println("Especialidad: " + especialidad);
		System.out.println("Número de guardias: " + numeroGuardias);
	}
}
