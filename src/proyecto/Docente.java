package proyecto;

public class Docente extends Persona{
	private String cargo, areaResponsable;
	
	public Docente(String nom, String pat, String mat, int C, String ca, String ar) {
		super(nom, pat, mat, C);
		cargo=ca;
		areaResponsable=ar;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getAreaResponsable() {
		return areaResponsable;
	}

	public void setAreaResponsable(String areaResponsable) {
		this.areaResponsable = areaResponsable;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Cargo: "+cargo);
		System.out.println("Área responsable: "+areaResponsable);
	}
}
