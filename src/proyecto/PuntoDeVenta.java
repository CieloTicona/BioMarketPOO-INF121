package proyecto;
// acá no hice nada, perdón, estaba pensando en poner horario, pero solo se quedó en mis pensamientos
public class PuntoDeVenta {
	private String ubicacion;
	
	public PuntoDeVenta(String u) {
		ubicacion=u;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void abrirPuntoDeVenta() {
		System.out.println();
	}
	
	public void cerrarPuntoDeVenta() {
		
	}
	
	public void consultarInventario() {
		
	}
	
	public void mostrarDetalles() {
		System.out.println("Ubicación: "+ubicacion);
		System.out.println();
	}
	
	public void listarVentasPorDia() {
		
	}
}
