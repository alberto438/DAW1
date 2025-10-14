package Actividad8;

public class DistanciaAbsoluta {

	private double num1;
	private double num2;
	
	public DistanciaAbsoluta(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	 
	public void mostrarDistancia() {
		
		double distancia = num1 - num2;
		distancia = Math.abs(distancia);
		System.out.println("El valor absoluto entre los"
				+ "dos numeros es de: " + distancia);
	}
}
