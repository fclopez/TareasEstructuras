package estructura;

import javax.swing.JOptionPane;

public class Vector {
	
	int[] vector = new int[5];

	//********************************
	public void llenarVector(){
		for (int i = 0; i < vector.length; i++) {
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Dirección de memoria: "));
		}
	}
	//********************************
	
	public void imprimirVector(){
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
	//********************************
	
	public void ordenarBurbuja(){
		for (int i = 1; i < vector.length; i++) {
			for (int j = 0; j < vector.length -1; j++) {
				if (vector[j]>vector[j+1]) {
					int aut = 0;
					aut = vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aut;
				}
			}
		}
	}
	//********************************
	
}
