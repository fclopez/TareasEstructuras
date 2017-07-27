package inventario;

public class Lista {
	
	private Nodo nodoIni, nodoFin;
	
	/*Declaración de constructor y metodos*/
	
	public Lista() {
		this.nodoIni = null;
		this.nodoFin = null;
	}
	//********************************************************
	
	public void insertarNodoIni(int cod, String nom,int cant){
		Nodo temp = new Nodo(cod,nom,cant);
		
		if (nodoIni==null) {
			nodoIni = temp;
			nodoFin = temp;
		}else {
			nodoIni.setIzq(temp);
			temp.setDer(nodoIni);
			nodoIni = temp;
			nodoIni.setIzq(null);
		}
	}
	//*******************************************************
	
	public void insertarNodoFin(int cod, String nom,int cant) {
		Nodo temp = new Nodo(cod,nom,cant);
		
		if (nodoFin==null) {
			nodoFin = temp;
			nodoIni = temp;
		}else {
			nodoFin.setDer(temp);
			temp.setIzq(nodoFin);
			nodoFin = temp;
			nodoFin.setDer(null);
		}
	}
	//*******************************************************

	public boolean buscarNodoDerecha(String param) {
		boolean stat = false;
		Nodo temp = nodoIni;
		
		while (temp.getDer()!=null && stat == false) {
			if (String.valueOf(temp.getCodigo()).equals(param)|| temp.getNombre().equalsIgnoreCase(param))
				stat = true;
			temp = temp.getDer();
		}
		return stat;		
	}
	//*******************************************************
	
	public boolean buscarNodoIzquierda(String param) {
		boolean stat = false;
		Nodo temp = nodoFin;
		
		while (nodoFin.getIzq()!= null && stat == false) {
			if (String.valueOf(temp.getCodigo()).equals(param)|| temp.getNombre().equalsIgnoreCase(param)) {
				stat = true;
			}
			temp = temp.getIzq();			
		}
		return stat;		
	}
	//*******************************************************
		
	public boolean borrarNodoIni() {
		Nodo temp;
		
		if (nodoIni==null)
			return false;
		if (nodoIni.getDer()== null) {
			nodoIni = null;
			nodoFin = null;
			return true;		
		}else {
			temp = nodoIni;
			nodoIni = nodoIni.getDer();
			nodoIni.setIzq(null);
			temp.setDer(null);
			return true;
		}
	}
	//*******************************************************
	
	public boolean borrarNodoFin(){
		Nodo temp;
		if (nodoFin==null)
			return false;
		if (nodoFin.getIzq()== null) {
			nodoIni = null;
			nodoFin = null;
			return true;
		}else {
			temp = nodoFin;
			nodoFin = nodoFin.getIzq();
			nodoFin.setDer(null);
			temp.setIzq(null);
			return true;
		}	
	}
	//*******************************************************
	
	public String imprimirLista() {
		String lista = "";
		Nodo temp;
		if (nodoIni != null) {
			temp = nodoIni;
			do {
				lista +="==> Cod:"+temp.getCodigo()+" Nom:"+temp.getNombre()+" Cant:"+temp.getCantidad()+"\n**************\n";
				temp = temp.getDer();
			} while (temp!=null);
		}else {
			lista = "No se ha creado una lista *i*";
		}
		return lista;
	}
	//*******************************************************
	
	public boolean modificarArticulo(int indice, int nuevo,String nom, int cant) {
		Nodo temp;
		boolean stat = false;
		
		if (nodoIni != null){
			temp = nodoIni;
			while (temp.getDer()!=null){
				if (temp.getCodigo()==indice) {
					temp.setCodigo(nuevo);
					temp.setNombre(nom);
					temp.setCantidad(cant);
					stat = true;
				}
				temp = temp.getDer();			
			}
		}else {
			stat = false;
		}
		return stat;
	}
	//*******************************************************
}
