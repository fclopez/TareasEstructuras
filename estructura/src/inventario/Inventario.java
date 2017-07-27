package inventario;

import java.util.Scanner;

public class Inventario {
	
	private Lista list;
	private String menu;
	private int opcion, indice, base;
	private Scanner entrada;
	//*************************************************************************
	
	public Inventario(){
		this.list = new Lista();
		this.menu = "==== Inventario SYSCorp ===="+"\n**** Opciones del Menu ****"+"\n1. Crear Inventario\n2. Imprimir Inventario"+"\n3. Anexar producto\n4. Buscar producto\n5. Borrar producto inicio" +"\n6. Borrar producto final\n7. Modificar producto\n8. Salir";
		this.opcion = 0;
		this.indice = 0;
		this.base = 0;
		this.entrada = new Scanner(System.in);
	}
	//*************************************************************************
	
	public Lista getList() {
		return list;
	}

	public void setList(Lista list) {
		this.list = list;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int ndato) {
		this.indice = ndato;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int bdato) {
		this.base = bdato;
	}
	//*************************************************************************
	
	public void leerMenu() {
		do { 
			System.out.println(getMenu());
			setOpcion(entrada.nextInt());
			
			switch (opcion) {
			case 1:crearInventario();
				break;
			case 2:imprimirInventario();
				break;
			case 3:ingresarProductoFin();
				//ingresarProductoInicio();
				break;
			case 4:buscarArticulo();
				break;
			case 5:borrarArticuloInicio();
				break;
			case 6:borrarArticuloFin();
				break;
			case 7:ModificarArticulo();
				break;
			}
		} while (opcion!=8);
	}
	//**************************************************************
	
	public void crearInventario() {
		list = new Lista();
		for (int ndato = 0; ndato <= 10; ndato++) {
			list.insertarNodoFin(ndato, "", 0);
			setIndice(ndato);
		}
	}
	//**************************************************************
	
	public void imprimirInventario() {
		String inventario = list.imprimirLista();
		System.out.println(inventario);
	}
	//**************************************************************
	
	public void ingresarProductoInicio() {
		String n = "";
		int c = 0;
		
		System.out.println("Ingrese el nombre de un articulo: ");
		n = entrada.next();
		System.out.println("Cantidad: ");
		c = entrada.nextInt();
		
		--base;
		list.insertarNodoIni(base, n, c);
		imprimirInventario();				
	}
	//**************************************************************
	
	public void ingresarProductoFin() {
		System.out.println("Ingrese el nombre de un articulo: ");
		String n = entrada.next();
		System.out.println("Cantidad: ");
		int c = entrada.nextInt();
		
		++indice;
		list.insertarNodoFin(indice, n, c);
		imprimirInventario();	
	}
	//**************************************************************
	
	public void buscarArticulo() {
		String cod = "";
		System.out.println("Ingrese el codigo del producto");
		cod = entrada.nextLine();
		if (list.buscarNodoDerecha(cod)) {
			
		}else {
			System.out.println("Articulo no encontrado! ");
		}
		imprimirInventario();
	}
	//**************************************************************
	
	public void borrarArticuloInicio() {
		if (list.borrarNodoIni()) {
			System.out.println("Articulo inicial borrado! ");
		}else {
			System.out.println("No se ha borrado ningun articulo! ");
		}
		imprimirInventario();
	}
	//**************************************************************
	
	public void borrarArticuloFin() {
		if (list.borrarNodoFin()) {
			System.out.println("Articulo Final borrado! ");
		}else {
			System.out.println("No se ha borrado ningun articulo! ");
		}
		imprimirInventario();
	}
	//**************************************************************
	
	public void ModificarArticulo() {
		int nodoActual = 0,nodoNuevo = 0, cant = 0;
		String nombre="";
		
		System.out.println("Ingrese el codigo del articulo a modificar: ");
		nodoActual = entrada.nextInt();
		System.out.println("Ingrese el nuevo codigo: ");
		nodoNuevo = entrada.nextInt();
		System.out.println("Ingrese el nombre del Articulo: ");
		nombre = entrada.next();
		System.out.println("Ingrese la cantidad del articulo: ");
		cant = entrada.nextInt();
		
		if (list.modificarArticulo(nodoActual, nodoNuevo, nombre, cant)) {
			System.out.println("Articulo Modificado Exitosamente!\n");
		}else {
			System.out.println("No se ha creado un inventario previamente");
		}
	}
	//**************************************************************
}
