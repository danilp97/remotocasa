package empleado;

public class Enfermero extends Empleado {

	private Turno turno;

	public Enfermero(String nombre, String dni, double salarioBase, Turno turno) {
		super(nombre, dni, salarioBase);
		this.turno = turno;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public double calcularSalario() {
		if (turno == Turno.NOCHE) {
			return salarioBase * 1.20;
		}
		return salarioBase;
	}

	public void mostrarDatos() {
		System.out.println("Enfermero");
		super.mostrarDatos();
		System.out.println("Turno: " + turno);
	}
}
