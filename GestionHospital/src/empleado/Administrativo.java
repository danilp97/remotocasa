package empleado;

public class Administrativo extends Empleado {

	private int horasExtra;

	public Administrativo(String nombre, String dni, double salarioBase, int horasExtra) {
		super(nombre, dni, salarioBase);
		this.horasExtra = horasExtra;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	public double calcularSalario() {
		return salarioBase + (horasExtra * 15);
	}
	
	public void mostrarDatos() {
		System.out.println("Administrativo");
		super.mostrarDatos();
		System.out.println("Horas extra: " + horasExtra);
	}
}
