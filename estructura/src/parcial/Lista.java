package parcial;


public class Lista{
	private Nodo primero;
	private Nodo ultimo;
	
	public Lista(){
		this.primero = null;
		this.ultimo = null;
	}
	
	public void anexarInicioLista(int dato){
		Nodo nuevo;
		nuevo = new Nodo(dato);
		if (primero == null) {
			primero = nuevo;
			ultimo = nuevo;
		}else {
			nuevo.setEnlace(primero);
			primero = nuevo;
		}
	}
	//*****************************************
	
	public void anexarFinalLista(int dato){
		Nodo nuevo;
		nuevo = new Nodo(dato);
		if (primero==null) {
			primero = nuevo;
			ultimo = nuevo;
		}else {
			ultimo.setEnlace(nuevo);
			ultimo=nuevo;
			ultimo.setEnlace(null);
		}
	}
	//******************************************
	
	public boolean esVacia(){
		return (primero==null);
	}
	//******************************************
	
	public boolean buscarNodo(int dato) {
		boolean encontro = false;
		Nodo p = primero;
		
		while (p.getEnlace()!=null && encontro == false) {
			if (p.getDato()==dato)
				encontro = true;
			p = p.getEnlace();
		}
		return encontro;
	}
	//******************************************
	
	public boolean borrarNodoInicio() {
		if (esVacia())
			return false;
		if (primero.getEnlace()==null) {
			primero = null;
			ultimo = null;
			return false;
		}else {
			Nodo temp = primero;
			primero = primero.getEnlace();
			temp.setEnlace(null);
			return true;					
		}
	}
	//******************************************
	
	public boolean borrarNodoFinal() {
		if (esVacia())
			return false;
		if (primero.getEnlace()==null) {
			primero=null;
			ultimo=null;
			return true;
		}else {
			Nodo temp = primero;
			Nodo aux = ultimo;
			while(temp.getEnlace()!=null){
				aux = temp;
				temp = temp.getEnlace();
			}
			ultimo = aux;
			ultimo.setEnlace(null);
			return true;
		}
	}
	//*******************************************
	
	public String imprimirLista() {
		String str = "";
		Nodo temp;
		temp = primero;
		while (temp!= null) {
			str +=""+temp.getDato();
			temp = temp.getEnlace();
		}		
		return str;
	}
	//*******************************************
	
	public void cambiarDato(int index,int ndato) {
		Nodo temp = primero;
		while (temp.getEnlace()!=null) {
			if (temp.getDato()==index)
				temp.setDato(ndato);
			temp = temp.getEnlace();
		}
	}
	//*******************************************
}