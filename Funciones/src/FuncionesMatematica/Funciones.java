package FuncionesMatematica;

import javax.swing.JOptionPane;

public class Funciones {
	
	public int suma(int a,int b){
		return a+b;
	}
	
	
	public double convertir(String mess){
		
		return Double.parseDouble(JOptionPane.showInputDialog(mess)); 
	}
	
	public double hipote(double a, double b){
		return Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
	}


}
