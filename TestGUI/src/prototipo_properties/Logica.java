package prototipo_properties;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Logica {	
	
	public String subir(){
		Properties config = null;
		FileReader archivo;
		//BufferedReader buffer = null;
		String ruta, prueba ="";
		ruta = "src/text.txt";
		
		//try del fileReader
		try {
			archivo = new FileReader(ruta);
			//buffer = new BufferedReader(archivo);
			//prueba = buffer.readLine();
			config = new Properties();
			config.load(archivo);
			prueba = config.getProperty(JOptionPane.showInputDialog("Ingrese una pagina a leer"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prueba;		
	}
	
}