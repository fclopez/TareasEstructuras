package kilovatio;

public class Kilovatio {
	
	
	public double calcularCostoKilovatios(double kilovatio, int estrato)
	{
		double costo = 0;

			if (estrato<3) {
				costo = kilovatio *99; 
			}else 
				if ((estrato>3)&&(estrato<5)) {
					costo = kilovatio *108;
			}else 
				if (estrato>=5) {
					costo = kilovatio *200;
			}

		return costo;
	}
}
