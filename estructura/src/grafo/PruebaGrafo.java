package grafo;


import javax.swing.JOptionPane; 
/** 
 * Clase que prueba las operaciones del Grafo 
 */ 
public class PruebaGrafo { 
	private Grafo unGrafo; 
	private int numeroNodos; 
	public PruebaGrafo() { 
		this.unGrafo = null; 
		this.numeroNodos = 0; 
	} 
	/** 
	 *método que realiza la lectura del número de nodos, 
	 *el nombre de los nodos y peso o valor de la arista 
	 *que une los nodos 
	 */ 
	public void leerDato ( ) { 
		String temp = ""; 
		String aux=""; 
		int peso = 0; 
		aux = "Cual es el numero de nodos"; 
		temp = JOptionPane.showInputDialog(aux);; 
		numeroNodos = Integer.parseInt(temp); 
		System.out.println("Digite el número de nodos del grafo:\n"); 
		unGrafo = new Grafo(numeroNodos); 
		for (int i = 0; i < numeroNodos; i++) { 
			aux = "Cual es el nombre del nodo [" + (i + 1)+ "]:\n"; 
			temp = JOptionPane.showInputDialog(aux); 
			unGrafo.ingresarNombre(i, temp.charAt(0)); 
		} 
		for (int i = 0; i < numeroNodos; i++) { 
			for (int j = 0; j < numeroNodos; j++) { 
				if (i < j) { 
					aux = "El nodo " + unGrafo.getNombre(i) 
							+ " esta conectado con el nodo " + 
							unGrafo.getNombre(j) 
							+ " (s/n)\n"; 
					temp = JOptionPane.showInputDialog(aux); 
					if (temp.charAt(0) == 's') { 
						aux = "Cual es el peso del arco:\n"; 
						temp = 
								JOptionPane.showInputDialog(aux); 
						peso = Integer.parseInt(temp); 
						unGrafo.ingresarArco(i, j, peso); 
					} else { 
						unGrafo.ingresarArco(i, j, 10000); 
					} 
				} 
			} 
		} 
	} 
	/** 
	 * método que imprime las rutas y el peso de cada ruta 
	 */ 
	public void imprimirRuta( ){ 
		unGrafo.calcular(); 
		String aux =""; 
		for (int i = 0; i < numeroNodos; i++) { 
			for (int j = 0; j < numeroNodos; j++) { 
				if (i > j) { 
					aux+="El camino mas corto entre los nodos: " 
							+ unGrafo.getNombre(i) + " - " + 
							unGrafo.getNombre(j) + " es: \n" 
							+ unGrafo.caminoCorto(i, j) + " y su peso es: " + unGrafo.pesoMinimo(i, j)+"\n"; 
				} 
			} 
		} 
		JOptionPane.showMessageDialog(null, aux); 
	} 
	public static void main(String args[]){ 
		PruebaGrafo pg = new PruebaGrafo(); 
		pg.leerDato(); 
		pg.imprimirRuta(); 
	} 
}

