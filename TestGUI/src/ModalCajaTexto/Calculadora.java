package ModalCajaTexto;

public class Calculadora {
	
	
	public String contarNumeros(int num){
		String mess = "";
		
		if (num>0) {
			for (int i = 0; i <= num; i++) {
				mess += i+" ,";
			}
		}else{
			mess = "No Ha ingresado un numero valido";
		}
		return mess;
	}
	
	public String calcularHora(int num){
		
		String mess = "";
		if ((num>0)&&(num<=2359)) {
			if((num>0)&&(num<=1159)){
				mess="Franja Horaria: mañana";
			}
			if((num>1159)&&(num<=1800)){
				mess="Franja Horaria: Tarde";
			}
			if((num>1800)&&(num<=2359)){
				mess="Franja Horaria: Noche";
			}
		}
		else{
			mess ="No ha ingresado una hora valida";
		}
		
		return mess;
	}
	
	

}
