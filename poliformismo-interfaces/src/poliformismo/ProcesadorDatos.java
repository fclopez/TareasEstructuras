package poliformismo;

import javax.swing.JOptionPane;

public class ProcesadorDatos {
	
	//Lectura de numeros
	public int leerNumeroEntero(String mensaje){
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return num;
	}
	
	//Imprimir Resultados enteros
	public void imprimirResultado(int result){

		JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+ result);
	}
	
	//sobrecarga del metodo imprimirResultados para resultados decimales
	public void imprimirResultado(double result){

		JOptionPane.showMessageDialog(null,"El resultado de la operacion es: "+ result);
	}
}
