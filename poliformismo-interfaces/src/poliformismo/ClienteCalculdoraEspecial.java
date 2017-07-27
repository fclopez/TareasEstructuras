package poliformismo;

public class ClienteCalculdoraEspecial {
	public static void main(String[] args) {
		
		// Variables principales
		int opcion = 0;
		String mensaje1, mensaje2;
		mensaje1 = "ingrese el 1er numero entero";
		mensaje2 = "Ingrese el 2do numero entero";
		
		//Creacion de los objetos
		InterfazCalculadora calesp = new CalculadoraEspecial();
		ProcesadorDatos pd = new ProcesadorDatos();
		
		//Menu
		opcion = pd.leerNumeroEntero("Ingrese una opción \n1. Suma\n2. Resta\n3. Multiplicación\n4. División \n5. Raiz cuadrada ");
		
		switch (opcion) {
		case 1: pd.imprimirResultado(calesp.suma(pd.leerNumeroEntero(mensaje1), pd.leerNumeroEntero(mensaje2)));
			break;
		case 2: pd.imprimirResultado(calesp.resta(pd.leerNumeroEntero(mensaje1), pd.leerNumeroEntero(mensaje2)));
			break;
		case 3: pd.imprimirResultado(calesp.multiplicar(pd.leerNumeroEntero(mensaje1), pd.leerNumeroEntero(mensaje2)));
			break;
		case 4: pd.imprimirResultado(calesp.dividir(pd.leerNumeroEntero(mensaje1), pd.leerNumeroEntero(mensaje2)));
			break;
		case 5: pd.imprimirResultado(calesp.raizCuadrada(pd.leerNumeroEntero(mensaje1)));
			break;
		default: System.exit(0);
			break;
		}
		
	}

}
