package encapsul;

import javax.swing.JOptionPane;

public class Aplicacion {
	
	public static void main(String[] args) {
		Encapsulamiento obj1 = new Encapsulamiento();
		
		obj1.setLectura(JOptionPane.showInputDialog("Ingrese una palabra"));
		
		System.out.println(obj1.getLectura());

	}

}
