package inventario;

public class Nodo {
	
	private int codigo, cantidad;
	private String nombre;
	private Nodo izq, der;
	//*******************************************************
	
	public Nodo() {
		this.codigo = 0;
		this.cantidad = 0;
		this.nombre = "";
		this.izq = null;
		this.der = null;
	}
	//*******************************************************
	
	public Nodo(int codigo,String nombre, int cantidad) {
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.izq = null;
		this.der = null;
	}
	//*******************************************************
	
	public Nodo getIzq() {
		return izq;
	}
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	public Nodo getDer() {
		return der;
	}
	public void setDer(Nodo der) {
		this.der = der;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	//*******************************************************
}
