package estructura;

import java.awt.Menu;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		Matriz obj = new Matriz();
		int opcion = 0;
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion del Menu:\n1. Llenar Vector"+"\n"+"2. Imprimir Vector"+"\n"+"3. Buscar dato"
					+ ""+"\n"+"0. Salir"));
			
			switch (opcion) {
			case 1:
				obj.llenarMatriz();
				break;
			case 2:
				obj.imprimirMatriz();
				break;
			case 3:
				obj.buscarValor(Integer.parseInt(JOptionPane.showInputDialog("Que numero quiere buscar..?")));
				break;
//			case 3:
//				obj.ordenarBurbuja();
//				break;
			default:
				break;
				}
		} 
		while (opcion != 0);
		
		
	}
	//*********************************
	
}
