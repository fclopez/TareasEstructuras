/**
 * 
 */
package Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author Camilo
 *
 */
public class Imagenes {
	
	// atributos - Temporales - borrare despues
	private JLabel lblDescripcion, lblImagen, lblTitulo;
	private String txtFoto1 = "";
	private String txtFoto2 = "";
	private String txtFoto3 = "";
	
	//Creacion del un objeto - arreglo de imagenes
	ImageIcon imagenes[] = new ImageIcon[3];
	
	
	//Constructor de imagenes
	public Imagenes(){
		
		//ciclo para el cambio de imagenes con cada clic de boto siguiente
		for (int i = 1; i<3; i++){
			imagenes[i] = new ImageIcon(getClass().getResource("icons/imagen"+i+".jpg"));
		}
		//actualizacion de la imagen en el lblImagen
		lblImagen.setIcon(imagenes[1]);
	}//*************************************************************************************
	
	
	
	
	
	
	
	//Sets
	public String setTxtFoto1(String msg){
		txtFoto1 = msg;
		return txtFoto1;
	}
	
	public String setTxtFoto2(String msg){
		txtFoto1 = msg;
		return txtFoto2;
	}
	
	public String setTxtFoto3(String msg){
		txtFoto1 = msg;
		return txtFoto3;
	}
	
	//Gets
	public String getTxtFoto1(){
		return txtFoto3;
	}
	
	public String getTxtFoto2(){	
		return txtFoto3;
	}
	
	public String getTxtFoto3(){
		return txtFoto3;
	}
	
	

}
