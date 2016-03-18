package tarea;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ConteoCubico {
	
	
	
	public void contarNumero(){
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		for (int i = 0; i < num; i+=3) {
			System.out.println(i);
		}
		System.out.println(num);
	}
	
	
	public void otroContadorNumero(){
		int i=0;
		int acum=0;
		int dato=0;
		while ((acum+dato)<=100) {
			dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
			acum += dato;
			i++;
		}
		JOptionPane.showMessageDialog(null, "Cantidad de Numeros Ingresados: "+i+"\n"+"Promedio de los numeros: "+(acum/i)+"\n"+"Sumatoria de los numeros: "+acum);
		
	}
	
	public void ubicarLetras(){
		String datoa,pos = "";
		String datob;
		ArrayList<String> lista = new ArrayList<String>();
		
		datoa = JOptionPane.showInputDialog("Ingrese una palabra");
			 
		 for (int i = 0; i < datoa.length(); i++) {
			lista.add(datoa.substring(i, i+1));
		}
		 JOptionPane.showMessageDialog(null, "Ingresó la palabra: "+datoa+"\n"+"Cantidad de caracteres: "+datoa.length());
		 datob = JOptionPane.showInputDialog("Ingrese un solo caracter que desea buscar: ");
		 
		 if((datob!="" )||datob.length()<=1)
		 {
			 for (int i = 0; i < lista.size(); i++) 
			 {
				if(datob.equals(lista.get(i)))
				{
					pos += i+1 +", ";
				}
			 }
			 JOptionPane.showMessageDialog(null, "El caracter se encontró en las posiciones: "+pos);
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(null, "No ha ingresado un caracter valido.");
		 }

	}
	
	
	public void factorial(){
		int num,numa, fact=1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
		numa=num;
		while(num!=0){
			fact *=num;
			num--;
		}
		JOptionPane.showMessageDialog(null, "El factorial de "+numa+" es: "+fact);
		
	}

}
