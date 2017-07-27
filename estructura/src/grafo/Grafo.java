package grafo;
/** 
 * Clase que modela carga de datos a los nodos 
 * definir el costo de cada ruta 
 */ 
public final class Grafo { 
	private int numeroNodos; 
	private int nodos [ ][ ][ ] ; 
	private char nombres[ ]; 
	
	Grafo(int n) { 
		this.numeroNodos = n; 
		this.nodos = new int[numeroNodos][numeroNodos][2]; 
		this.nombres = new char[numeroNodos];	 
	} 
	
	/** 
	 * método que permite almacenar en la matriz peso cuando 
	 * hay conexión entre los nodos 
	 * @param n1 
	 * @param n2 
	 * @param peso 
	 */ 
	public void ingresarArco(int n1, int n2, int peso) { 
		this.nodos[n1][n2][0] = peso; 
		this.nodos[n2][n1][0] = peso; 
		this.nodos[n1][n2][1] = n1; 
		this.nodos[n2][n1][1] = n2; 
	} 
	/** 
	 * se carga el nombre del nodo en la posición correspondiente 
	 * @param nodo 
	 * @param letra 
	 */ 
	public void ingresarNombre(int nodo, char letra) { 
		this.nombres[nodo] = letra; 
	} 
	/** 
	 * metodo que permite calcular el valor de la ruta de entre los 
	 * nodos del grafo 
	 */ 
	public void calcular() { 
		int i, j, k; 
		for (i = 0; i < this.numeroNodos; i++) { 
			for (j = 0; j < this.numeroNodos; j++) { 
				for (k = 0; k < this.numeroNodos; k++) { 
					if (this.nodos[ i ][ k ][ 0 ] + this.nodos[ k ][ j ][ 0 ] < 
							this.nodos[ i ][ j ][ 0 ]) { 
						this.nodos[ i ][ j ][ 0 ] = this.nodos[ i ][ k ][ 0 ] 
								+ this.nodos[ k ] [ j ][ 0 ]; 
						this.nodos[ i ][ j ][ 1 ] = k; 
					} 
				} 
			} 
		} 
	} 
	

    public int pesoMinimo(int org, int des) { 
		return this.nodos[org][des][0]; 
	} 
	/** * método para determinar el camino minimo entre los nodos 
	 * @param org 
	 * @param des 
	 * @return 
	 */ 
	public String caminoCorto(int org, int des) { 
		String camino; 
		if (org == des) { 
			camino = "--" + nombres[org]; 
		} else { 
			camino = caminoCorto(org, this.nodos[org][des][1]) + "--" 
					+ nombres[des]; 
		} 
		return camino; 
	} 
	
	public char getNombre(int nodo) { 
		return this.nombres[nodo]; 
	} 
} 

