package proyecto;

public class Empleado extends Persona{
	private float sueldo;
	private String horario, carrera;

	
	public Empleado(String nombre, String paterno, String materno, int CI, float sueldo, String horario, String carrera) {
		super(nombre, paterno, materno, CI);
		this.sueldo = sueldo;
		this.horario = horario;
		this.carrera = carrera;
	}

	
	public float getSueldo() {
		return sueldo;
	}

	public String getHorario() {
		return horario;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	

	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Horario: " + horario);
		System.out.println("Carrera: " + carrera);
	}
}
