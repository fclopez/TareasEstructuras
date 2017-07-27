package herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {

	//Atributos
	private java.lang.String carnet;
	private double promedioNotas;
	private int numeroMaterias;

	
	//Constructor sin parametros
	public Estudiante(){
		
	}
	
	//Constructor con parametros
	public Estudiante(String nombre, String apellido, int edad, double peso ,String carnet, double promedioN, int numeroMat ){
		super(nombre,apellido,edad,peso);
		this.carnet = carnet;
		this.promedioNotas = promedioN;
		this.numeroMaterias = numeroMat;
	}
	

	public double getPromedioNotas() {
		return promedioNotas;
	}

	public void setPromedioNotas(double promedioNotas) {
		this.promedioNotas = promedioNotas;
	}

	public int getNumeroMaterias() {
		return numeroMaterias;
	}

	public void setNumeroMaterias(int numeroMaterias) {
		this.numeroMaterias = numeroMaterias;
	}

	public java.lang.String getCarnet() {
		return carnet;
	}

	public void setCarnet(java.lang.String carnet) {
		this.carnet = carnet;
	}
	
	
	
	public double calcularPromedio(double notasTotal,int materias){
		return (notasTotal/materias);
	}
	
	
	public double leerNotasEstudiante(int materias){
		double nota = 0.0;
		
		for (int i = 1; i <= materias; i++) {
			nota += leerDatoTipoReal("Ingrese la nota de la materia N° "+i);
		}
		
		return nota;
	}
	
	public Estudiante ingresarDatosEstudiante(){
		
		Estudiante estud = new Estudiante();
		String nombre, apellido, carnet;
		int edad, numeroMaterias;
		double peso, notasGlobal, promedioNotas;
		
		carnet = leerDatoTipoCadena("Identificacion del estudiante");
		apellido = leerDatoTipoCadena("Apellidos del estudiante");
		nombre = leerDatoTipoCadena("Nombre del estudiante");
		edad = leerDatoTipoEntero("Edad del estudiante");
		peso = leerDatoTipoReal("Peso del estudiante");
		numeroMaterias = leerDatoTipoEntero("Numero de materias vistas por el estudiante");
		notasGlobal = leerNotasEstudiante(numeroMaterias);
		promedioNotas = calcularPromedio(notasGlobal,numeroMaterias);
		
		estud.setCarnet(carnet);
		estud.setApellido(apellido);
		estud.setNombre(nombre);
		estud.setEdad(edad);
		estud.setPeso(peso);
		estud.setNumeroMaterias(numeroMaterias);
		estud.setPromedioNotas(promedioNotas);
		
		return estud;
	}
	
	public void imprimirReporteEstudiante(){
		imprimirDatosPersona();
		JOptionPane.showMessageDialog(null, "Carnet N°: "+getCarnet()+"\n"+"Numero de materias cursadas: "+getNumeroMaterias()+"\n"+"Promedio de notas: "+getPromedioNotas());
	}

	
}
