package proyecto;

public class EstudianteProyecto extends Empleado {
	private int registroUniv;
	private String cargo;

	public EstudianteProyecto(String nombre, String paterno, String materno, int CI, float sueldo, String horario,
			int registroUniv, String cargo) {
		super(nombre, paterno, materno, CI, sueldo, horario);
		this.registroUniv = registroUniv;
		this.cargo = cargo;
	}

	public int getRegistroUniv() {
		return registroUniv;
	}

	public String getCargo() {
		return cargo;
	}

	public void setRegistroUniv(int registroUniv) {
		this.registroUniv = registroUniv;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void vender() {
		System.out.println(getNombre() + " está realizando una venta.");
	}

	public void producir() {
		System.out.println(getNombre() + " está produciendo un producto.");
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Registro Universitario: " + registroUniv);
		System.out.println("Cargo: " + cargo);
	}
}
