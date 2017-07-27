package encapsul;

public class Encapsulamiento {
	
	private String lectura;
	
	
	
	public String getLectura() {
		return lectura;
	}

	public void setLectura(String lectura) {
		
		if (!lectura.equalsIgnoreCase("sabado")) {
			this.lectura = lectura;
		}
	}


}
