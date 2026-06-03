package proyecto;

public class Estudiante extends Persona {
	private int registroUniv;
	private String cargo;

	public Estudiante(String nombre, String paterno, String materno, int CI, int registroUniv, String cargo) {
		super(nombre, paterno, materno, CI);
		this.registroUniv = registroUniv;
		this.cargo = cargo;
	}

	public int getRegistroUniv() {
		return registroUniv;
	}

	public void setRegistroUniv(int registroUniv) {
		this.registroUniv = registroUniv;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void vender() {
		System.out.println(getNombre() + " está vendiendo");
	}

	public void producir() {
		System.out.println(getNombre() + " está produciendo");
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Registro Univ: " + registroUniv);
		System.out.println("Cargo: " + cargo);
	}

}
