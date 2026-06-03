package proyecto;
import java.util.*;

public class Inventario {
	private int cantProd;
	private String fecha;
	private Producto[] p=new Producto[100];
	
	public Inventario(int c, String f) {
		Scanner w=new Scanner(System.in);
		cantProd=c;
		fecha=f;
		for(int i=0;i<c;i++) {
			System.out.println("Ingrese nombre, tipo, lugar de origen, precio y cantidad del producto que desea agregar:");
			p[i]=new Producto(w.next(), w.next(), w.next(), w.nextFloat(), w.nextInt());
		}
		for(int j=c;j<100;j++)
			p[j]=new Producto("", "", "", -1 , -1);
	}

	public int getCantProd() {
		return cantProd;
	}

	public void setCantProd(int cantProd) {
		this.cantProd = cantProd;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Producto[] getP() {
		return p;
	}

	public void setP(Producto[] p) {
		this.p = p;
	}
	
	public void mostrar() {
		System.out.println("Fecha: "+fecha);
		System.out.println("Cantidad de productos: "+cantProd);
		for(int i=0;i<cantProd;i++) {
			System.out.println("Producto "+(i+1));
			p[i].mostrar();
			System.out.println();
		}
	}
	
	public void agregarProducto(Producto p) {
	    if(cantProd < 100) {
	        this.p[cantProd] = p;
	        cantProd++;
	    }
	    else {
	        System.out.println("El inventario está lleno");
	    }
	}
	
	public void quitarProducto(String n) {
		for(int i=0;i<cantProd;i++) {
			if(p[i].getNombre().equals(n)) {
				for(int j=i;j<cantProd-1;j++)
					p[j]=p[j+1];
				cantProd--;
				p[cantProd] =new Producto("", "", "", -1, -1);
				break;
			}
		}
	}
	
	//creo q el reducir stock iría en la clase Producto
	
	public boolean buscarProducto(String nombre) {
	    for(int i=0; i<cantProd; i++) {
	        if(p[i].getNombre().equals(nombre))
	            return true;
	    }
	    return false;
	}
	
	public void contarTipoX(String x) {
		int c=0;
		for(int i=0;i<cantProd;i++) {
			if(p[i].getTipo().equals(x))
				c++;
		}
		System.out.println("Hay "+c+" productos tipo "+x+" en el inventario");
	}
	
	public void listarPorDia() {
		
	}
	
	public void productosNoVendidos() {
		
	}
}
