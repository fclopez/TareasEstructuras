package matriz_grafos;

public class PruebaMatrizGrafo {

	private MatrizGrafo unaMatrizGrafo;
	public PruebaMatrizGrafo() {
		this.unaMatrizGrafo = new MatrizGrafo();
	}
	public void obtenerMatriz( ) {
		unaMatrizGrafo.imprimirMatriz( );
		unaMatrizGrafo.obtenerMatrizOrdenDos( );
		unaMatrizGrafo.obtenerMatrizOrdenTres();
	}
	public static void main(String[] args) {
		PruebaMatrizGrafo prueba = new PruebaMatrizGrafo( );
		prueba.obtenerMatriz();
	}
}
