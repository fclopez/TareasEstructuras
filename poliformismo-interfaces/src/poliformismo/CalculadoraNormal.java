package poliformismo;

public class CalculadoraNormal implements InterfazCalculadora {

	@Override
	public int suma(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1+n2);
	}

	@Override
	public int resta(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1-n2);
	}

	@Override
	public int multiplicar(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1*n2);
	}

	@Override
	public double dividir(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1/n2);
	}

	@Override
	public double raizCuadrada(int n1) {
		// TODO Auto-generated method stub
		return Math.sqrt(n1);
	}

}
