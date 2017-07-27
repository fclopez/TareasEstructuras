package estructura;

import javax.swing.JOptionPane;

public class Matriz {
	
	int[][] matriz = new int[3][4];
	
	
	//********************************
		public void llenarMatriz(){
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Dirección de memoria: "));
				}
			}
		}
		//********************************
		
		public void imprimirMatriz(){
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					System.out.println(matriz[i][j]);
				}
			}
		}
		//********************************
		
		public void buscarValor(int busq){
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					if(matriz[i][j]==busq){
						JOptionPane.showMessageDialog(null,"El valor se encuentra en la Fila: "+i+" Columna: "+j);
					}
				}
			}
		}
		//********************************
		
//		public void ordenarBurbuja(){
//			for (int i = 1; i < matriz[0].length; i++) {
//				for (int j = 0; j < vector.length -1; j++) {
//					if (vector[j]>vector[j+1]) {
//						int aut = 0;
//						aut = vector[j];
//						vector[j]=vector[j+1];
//						vector[j+1]=aut;
//					}
//				}
//			}
//		}
		//********************************
	
	

}
