package proyecto;

public class Encargado extends Empleado {
	private String cargo;

	public Encargado(String nombre, String paterno, String materno, int CI, float sueldo, String horario,String carrera,
			String cargo) {
		super(nombre, paterno, materno, CI, sueldo, horario, carrera);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
//falta añadir producto jiji :)
	//public void registrarProducto(Producto p) {
	//	System.out.println("Producto registrado: " + p.getNombre());
//	}

	public void revisarInventario() {
		System.out.println("Revisando inventario...");
	}

	public void registrarAsistencia(Empleado e) {
		System.out.println("Asistencia registrada de: " + e.getNombre());
	}

	public void generarReporte() {
		System.out.println("Generando reporte del día...");
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Cargo: " + cargo);
	}
}
