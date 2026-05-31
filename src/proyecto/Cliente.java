package proyecto;

public class Cliente extends Persona {
	private float dineroDisponible;

	public Cliente(String nombre, String paterno, String materno, int CI, float dineroDisponible) {
		super(nombre, paterno, materno, CI);
		this.dineroDisponible = dineroDisponible;
	}

	public float getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(float dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	public void realizarCompra(float monto) {
		if (dineroDisponible >= monto) {
			dineroDisponible -= monto;
			System.out.println("Compra realizada, saldo restante: " + dineroDisponible);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public float consultarSaldo() {
		return dineroDisponible;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Dinero disponible: " + dineroDisponible);
	}
}
