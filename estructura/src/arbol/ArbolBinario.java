package arbol;

import javax.swing.JOptionPane;


public class ArbolBinario {
	
	private NodoBin raiz;
	private int num;
	
	public void crearArbolBinario(){
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato"));
		
		//nodo nuevo
		NodoBin nuevo = new NodoBin(num);
		
		//si la raiz esta vacia, la raiz pasa a ser el nuevo nodo
		if (raiz == null) {
			raiz = nuevo;
		}
		//si no, entonces se compara el
		else {
			NodoBin r = raiz;
				if (num < r.getDato()) 
				{
					r.setIzq(nuevo);
				}
				else {
					r.setDer(nuevo);
				}
		}
	}	
	//*******************************************
	
	public void anexarNodo(int n){ 
		NodoBin nuevo,p,q;
		
		if(raiz.getDato()==0){ 
			raiz.setDato(n); 
			} 
		else{ 
			p=raiz; 
			q=p; 
			while(q!=null&&p.getDato()!=n){ 
				p=q; 
				if(n<p.getDato()){ 
					q=q.getIzq(); 
					} 
				else{ 
					q=q.getDer(); 
					} 
				if(p.getDato()==n){ 
					System.out.println("dato repetido "); 
					} 
				}
			
			if(n<p.getDato()){ 
				insertarIzquierda(p,n); 
				} 
			else{ 
				insertarDerecha(p,n); 
				} 
		} 
	} 
	//*******************************************
	public void crearLibro(int pag, String sentido, int direccion ) {
		NodoBin p;
		if (raiz==null) {
			raiz = new NodoBin(pag);
		}else {
			p = buscarDato(pag,raiz);
			NodoBin nuevo = new NodoBin(pag);
			if (sentido.equalsIgnoreCase("der")) {
				p.setDer(nuevo);
			}else {
				p.setIzq(nuevo);
			}
		}
	}
	//*******************************************
	NodoBin q;
	public NodoBin buscarDato(int pag, NodoBin n) {
		if (n != null) {
			if (pag == n.getDato()) {
				q = n;
			}
			buscarDato(pag, n.getIzq());
			buscarDato(pag, n.getDer());
		}
		return q;
	}
	//*******************************************
	public void insertarIzquierda(NodoBin n, int dato) {
		NodoBin nuevo = new NodoBin(dato);
		n.setIzq(nuevo);
	}
	//*******************************************
	public void insertarDerecha(NodoBin n, int dato) {
		NodoBin nuevo = new NodoBin(dato);
		n.setDer(nuevo);
	}
	//******************************************
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NodoBin getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoBin raiz) {
		this.raiz = raiz;
	}

	public void imprimirPreOrden(NodoBin r) {
		if (r != null) {
			System.out.println(r.getDato());
			imprimirPreOrden(r.getIzq());
			imprimirPreOrden(r.getDer());
		}
	}
	
	public void imprimirInOrden(NodoBin r) {
		if (r !=null) {
			 imprimirInOrden(r.getIzq());
			System.out.println(r.getDato());
			imprimirInOrden(r.getDer());
		}
	}
	
	public void imprimirPostOrden(NodoBin r) {
		if (r != null) {
			imprimirPostOrden(r.getIzq());
			imprimirPostOrden(r.getDer());
			System.out.println(r.getDato());
		}
	}
}

