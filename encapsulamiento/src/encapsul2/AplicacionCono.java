package encapsul2;

import javax.swing.JOptionPane;

public class AplicacionCono {
	
	public static void main(String[] args) {
		
		calcularVolumenCono();
		
	}
	
	public static void calcularVolumenCono(){
		Cono con = new Cono();
		
		con.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cono")));
		con.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cono")));
		
		System.out.println((Math.PI*Math.pow(con.getRadio(),2)*con.getAltura())/3);
		
		
	}

}
