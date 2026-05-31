package proyecto;

public class Auxiliar extends Empleado {
//no tiene atributos propiosssss
	public Auxiliar(String nombre, String paterno, String materno, int CI, float sueldo, String horario, String carrera) {
		super(nombre, paterno, materno, CI, sueldo, horario, carrera);
	}

	@Override
	public void mostrar() {
		System.out.println("AUXILIAR");
		super.mostrar();
	}
}
