package parcial;

import java.util.Scanner;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class AplicacionLista {
	private Lista lst;
	private String menuOpciones;
	private String opcion;
	private int numero;
	private int dato;
	private int datoInicio;
	private Scanner input;
	/**
	 * constructor de la clase ListaApp
	*/
	public AplicacionLista() {
		this.lst=new Lista ();
		this.menuOpciones="Listas Enlazadas Simples\n" +	
				"=========================\n"+
				"1. Crear lista\n2. Imprimir lista" +
				"\n3. Anexar nodos Inicio \n4. Anexar nodos final\n5. Buscar nodos\n6. Borrar nodo inicio" +"\n7. Borrar nodo final\n8. Modificar nodo\n9. Salir";
		this.opcion="";
		this.dato=0;
		this.numero=0;
		this.datoInicio=0;
		this.input = new Scanner(System.in);
	}
	/**
	 * Metodo que tiene las opciones del menu de la lista
	*/
	public void leerMenu() {
		do{
			listarMenu(menuOpciones);
			numero=input.nextInt();
			switch (numero){
				case 1: crearLista(); break;
				case 2: listar(); break;
				case 3: anexarNodoInicio(); break;
				case 4: anexarNodoFinal(); break;
				case 5: buscarNodo(); break;
				case 6: borrarDatoInicio(); break;
				case 7: borrarDatoFinal(); break;
				case 8: cambiarDatoNodo(); break;
			}
		}while(numero !=9);
	}
	/**
	 * Metodo que imprime el menu de opciones de la aplicacion
	 * @param menu
	 */
	public void listarMenu(String menu){
		System.out.println(menu);
	}
	/**
	 * creacion de la lista con 10 nodos
	 */
	public void crearLista() {
		lst=new Lista ();
		for (int dato=1; dato<=10; dato++){
			lst.anexarFinalLista(dato);
			this.dato=dato;
		}
		listar();
	}
	/**
	 * Se anexa un nodo al inicio de la lista
	 */
	public void anexarNodoInicio() {
		lst.anexarInicioLista(datoInicio);
		--datoInicio;
		listar();
	}
	/**
	 * Se anexa un nodo al final de la lista
	 */
	public void anexarNodoFinal() {
		dato++;
		lst.anexarFinalLista(dato);
		listar();
	}
	/**
	 * Se imprime la lista
	 */
	public void listar() {
		String laLista=lst.imprimirLista();
		System.out.println(laLista);
	}
	/**
	 * metodo que a partir de un valor invoca el metodo a buscar
	 * este numero en la lista
	 */
	public void buscarNodo(){
		int n=0;
		System.out.println("digite el numero a buscar");
		n=input.nextInt();
		if(lst.buscarNodo(n)){
			System.out.println("valor encontrado");
		}
		else{
			System.out.println("valor no encontrado");
		}
		listar();
	}
	/**
	 * metodo que borra el primer nodo de la lista
	*/
	public void borrarDatoInicio(){
		if(lst.borrarNodoInicio()){
			System.out.println("nodo borrado");	
		}
		else{
			System.out.println("valor no borrado");
		}
		listar();
	}
	/**
	 * metodo que borra el nodo al final de la lista
	 */
	public void borrarDatoFinal(){
		if(lst.borrarNodoFinal()){
			System.out.println("nodo borrado");
		}
		else{
			System.out.println("valor no borrado");
		}
		listar();
	}
	
	public void cambiarDatoNodo() {
		int num1 = 0,num2 = 0;
		System.out.println("Ingrese el valor a cambiar");
		num1 = input.nextInt();
		System.out.println("Ingres el nuevo dato");
		num2 = input.nextInt();
		lst.cambiarDato(num1,num2);
	}
	
	
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String []args) {
		AplicacionLista lista= new AplicacionLista();
		lista.leerMenu();
	}
}

