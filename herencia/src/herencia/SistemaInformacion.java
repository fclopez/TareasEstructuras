package herencia;
import javax.swing.JOptionPane;
/**
* Clase Java para implementar un cliente
* que emplea la jerarquía de herencia de la persona,
* el empleado y el estudiante para mostrar los cálculos
* de cada uno de los respectivos procesos implementados
* por cada clase
*/
public class SistemaInformacion{

	//Constructor de la clase
	public SistemaInformacion() {
	// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){

		int opcion = 0;
		Persona sistemaInformacion = new Persona();
		try	{
		//Usamos la herencia de la superclase para acceder a los
		//métodos de lectura de datos
			do{
				opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción: \n1. Procesar los datos del empleado\n2. Procesar datos del estudiante\n3. Salir: ");
				if (opcion == 1){
					JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
					Empleado manejadorEmpleado = new Empleado();
					//Leemos los datos
					manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
					//Mostramos el reporte de datos
					manejadorEmpleado.imprimirReporteEstadoEmpleado();
				}
				else if(opcion == 2){
					JOptionPane.showMessageDialog(null,"Procesando datos del estudiante");
					Estudiante objest = new Estudiante();
					//Leemos los datos
					objest =objest.ingresarDatosEstudiante();
					//Mostramos el reporte de datos
					objest.imprimirReporteEstudiante();
					
				}
				else if (opcion == 3){
					JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
					break;
				}
				else {
					JOptionPane.showMessageDialog(null,"Opción inválida");
				}
			
			} while (opcion <= 1 || opcion >= 3);//fin del do-while
		}//Fin del try
		catch (Exception errorMain)	{
			JOptionPane.showMessageDialog(null,"Error en la digitación: ");
			errorMain.printStackTrace();
		}
		/********************************/
	}
	/********************************/
}
