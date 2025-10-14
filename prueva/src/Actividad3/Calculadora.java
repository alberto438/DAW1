package Actividad3;

public class Calculadora {

	private double numero1;
	private double numero2;
	
	public Calculadora(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public void sumar() {
		double respuesta1;
		respuesta1 = numero1 + numero2;
		System.out.println("el total de la suma es:" + respuesta1);	
	}
	public void restar() {
		double respuesta2;
		respuesta2 = numero1 - numero2;
		System.out.println("el total de la resta es:" + respuesta2);	
	}
	public void multiplicar() {
		double respuesta3;
		respuesta3 = numero1 * numero2;
		System.out.println("el total de la multiplicacion es:" + respuesta3);	
	}
	public void dividir() {
		double respuesta4;
		respuesta4 = numero1 / numero2;
		// double resto = %respuesta4;
		System.out.println("el total de la division es:" + respuesta4 + "y el resto es" + respuesta4);	
	}
	
}
	

