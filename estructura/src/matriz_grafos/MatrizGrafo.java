package matriz_grafos;

public class MatrizGrafo {
	private int [][] m;
	private int	[][] m1 ;
	private int [][] mr ;
	/**
	 * se crean las matrices del grafo
	 */
	public MatrizGrafo() {
		this.m = new int [ ][ ]{
				{0, 1, 0, 0, 0, 1, 0, 0, 0},
				{1, 0, 1, 1, 1, 1, 0, 0, 0},
				{0, 1, 0, 1, 0, 0, 0, 0, 0},
				{0, 1, 1, 0, 1, 0, 1, 1, 0},
				{0, 1, 0, 1, 0, 0, 0, 0, 0},
				{1, 1, 0, 0, 0, 0, 0, 1, 1},
				{0, 0, 0, 1, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0, 1, 1, 0, 1},
				{0, 0, 0, 0, 0, 1, 0, 1, 0}
		};
		this.m1 = new int [ m.length ][ m.length ];
		this.mr = new int [ m.length ][ m.length ];
	}
	/**
	 * Método que imprime que invoca la impresión de la la matriz
	 * a visualizar en pantalla
	 */
	
	public void imprimirMatriz( ){
		final String MATRIZ_INICIAL ="Matriz del Grafo";
		imprimirMatrizGrafo(m,MATRIZ_INICIAL);
			}
	
	public void imprimirMatrizGrafo(int[][] m, String grado){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				System.out.print("\t"+m[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	/**
	 * Método que define el número de caminos de grado dos de cada nodo
	 */
	public void obtenerMatrizOrdenDos( ) {
		final String MATRIZ_GRADO_DOS ="Matriz del Grafo Grado Dos\n";
				for(int i = 0; i < m.length; i++){
					for(int j = 0; j < m.length; j++){
						m1[i][j]=m [i][j];
					}
				}
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				mr[i][j] = 0;
				for(int k = 0; k < m.length; k++){
					mr[i][j]=mr [i][j]+ m[i][k]*m1[k][j];
				}
			}
		}
		imprimirMatrizGrafo(mr,MATRIZ_GRADO_DOS);
	}
	/**
	 * Método que define el maximo tres caminos para llegar a cada a una
	 * de las aristas
	 */
	public void obtenerMatrizOrdenTres( ){
		final String MATRIZ_GRADO_TRES ="Matriz del Grafo Grado Tres\n";
				for(int i = 0; i < m.length; i++){
					
					for(int j = 0; j < m.length; j++){
						m1[i][j]=mr [i][j];
					}
				}
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				mr[i][j] = 0;
				for(int k = 0; k < m.length; k++){
					mr[i][j]=mr [i][j]+ m1[i][k]*m[k][j];
				}
			}
		}
		imprimirMatrizGrafo(mr,MATRIZ_GRADO_TRES);
	}
}