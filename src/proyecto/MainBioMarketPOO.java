package proyecto;

public class MainBioMarketPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREAR INVENTARIO
		System.out.println("CREANDO INVENTARIO DEL MARTES-----------");
		// ingresar ejemplo : Miel organico Cota-Cota 15.0 20
		Inventario I1 = new Inventario(3, "Martes");
		//--
		System.out.println(" ");
		// CREAR PUNTO DE VENTA
		PuntoDeVenta PV = new PuntoDeVenta("BioMarket - Monoblock UMSA", I1);
		PV.abrirPuntoDeVenta();
		// MOSTRAR INVENTARIO
		System.out.println("INVENTARIO DISPONIBLE---------------------------------");
		I1.mostrar();

		//--
		System.out.println(" ");
		// CREAR DOCENTE Y ESTUDIANTEs
		Docente docente = new Docente("Fernando", "Soruco", "Lopez", 12345678, "Encargado", "Agronomía");

		Estudiante est1 = new Estudiante("Ana", "Mamani", "Quispe", 87654321, 2021001, "vendedor");
		Estudiante est2 = new Estudiante("Luis", "Condori", "Flores", 98765432, 2021002, "productor");

		//--
		System.out.println(" ");
		// EEGISTRAR ASISTENCIA
		System.out.println(" REGISTRANDO ASISTENCIA-----------------------------------");
		docente.registrarAsistencia(est1);
		docente.registrarAsistencia(est2);

		//--
		System.out.println(" ");
		// MOSTRAR PERSONAS
		System.out.println("DATOS DEL DOCENTE:");
		docente.mostrar();
		System.out.println("DATOS ESTUDIANTE 1");
		est1.mostrar();
		System.out.println("DATOS ESTUDIANTE 2");
		est2.mostrar();

		//--
		System.out.println(" ");
		// VENTA
		System.out.println("REALIZANDO VENTA-----------------------------------------");
		Venta v = new Venta("02/06/2026", "efectivo", "Martes");
		v.agregarProducto(I1.getP()[0]);
		v.agregarProducto(I1.getP()[1]);
		v.registrarVenta();

		//--
		System.out.println(" ");
		// CAMBIO
		System.out.println("CALCULANDO CAMBIO-------------------------------------------");
		float cambio = v.calcularCambio(100);
		System.out.println("Pago recibido: 100");
		System.out.println("Cambio: " + cambio);

		//--
		System.out.println(" ");
		// TICKET
		System.out.println();
		v.mostrarTicket();

		//--
		System.out.println(" ");
		// REGISTRAR VENTA EN PDV
		PV.registrarVenta(v);

		//--
		System.out.println(" ");
		// PRODUCTOS NO VENDIDOS
		System.out.println("PRODUCTOS NO VENDIDOS------------------------------------------");
		I1.productosNoVendidos("Martes");

		//--
		System.out.println(" ");
		// REPORTE FINAL
		System.out.println("REPORTE FINAL----------------------------------------------------");
		docente.generarReporte();
		PV.cerrarPuntoDeVenta();
	}

}
