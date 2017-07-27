package arbol;

public class NodoBin {
	
	//Atributos
	private int dato;
	private NodoBin izq, der; 		/*Autoreferenciacion*/
	
	//Constructor 
	public NodoBin() {
		this.dato = 0;
		this.izq = null;
		this.der = null;
	}
	
	//costructor con parametros
	public NodoBin(int dato) {
		this.dato = dato;
		this.izq = null;
		this.der = null;
	}
	
	/*Meotodos gets a sets*/
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public NodoBin getIzq() {
		return izq;
	}
	public void setIzq(NodoBin izq) {
		this.izq = izq;
	}
	public NodoBin getDer() {
		return der;
	}
	public void setDer(NodoBin der) {
		this.der = der;
	}
	/*Metodos de get and set*/
}
