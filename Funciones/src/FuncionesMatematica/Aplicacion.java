package FuncionesMatematica;

import javax.swing.JOptionPane;

public class Aplicacion {
	
	Funciones obj1 = new Funciones();
	
	public static void main(String[] args) {
		
		Funciones obj1 = new Funciones();
//		int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er numero"));
//		int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do numero"));
//		
//		System.out.println(obj1.suma(x, y));
//		System.out.println(obj1.convertir("Digite un numero"));
		
		hipotec();
	}
	
	public static void hipotec(){
		Funciones obj1 = new Funciones();
		System.out.println(Math.sqrt(Math.pow(obj1.convertir("Ingrese 1er numero"), 2)+ Math.pow(obj1.convertir("Ingrese 2do numero"), 2)));
	}

}
