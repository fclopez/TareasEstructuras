package arbol;

import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;

public class Aplicacion {
	
	public static void main(String[] args) {
		int opc;
		
		ArbolBinario arbol = new ArbolBinario();
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n 1.CrearArbol\n 2. imprimir Arbol\n 3. Añadir nodo"));
			switch (opc) {
			case 1:arbol.crearArbolBinario();
				break;
			case 2:
				System.out.println("---PreOrden---");
				arbol.imprimirPreOrden(arbol.getRaiz());
				System.out.println("---InOrden---");
				arbol.imprimirInOrden(arbol.getRaiz());
				System.out.println("---PostOrden---");
				arbol.imprimirPostOrden(arbol.getRaiz());
				break;
			case 3: arbol.anexarNodo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del nuevo nodo")));
				break;
			//case 4: arbol.crearLibro(1, sentido, direccion);
			}
		} while (opc != 4);

	}

}
