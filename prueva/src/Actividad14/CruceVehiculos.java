package Actividad14;

public class CruceVehiculos {

	private double velocidad1;
	private double velocidad2;
	private double distancia;

	public CruceVehiculos(double velocidad1, double velocidad2, double distancia) {
		
		this.velocidad1 = velocidad1;
		this.velocidad2 = velocidad2;
		this.distancia = distancia;
	}

	public double getVelocidad1() {
		return velocidad1;
	}

	public void setVelocidad1(double velocidad1) {
		this.velocidad1 = velocidad1;
	}

	public double getVelocidad2() {
		return velocidad2;
	}

	public void setVelocidad2(double velocidad2) {
		this.velocidad2 = velocidad2;
	}

	public double getDistancia() {
		return distancia;
	}
  
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double calcularTiempoAlcance(double velocidad1, double velocidad2, double distancia) {
		
		double tiempo1 = velocidad1 / distancia;
		velocidad2 = distancia / tiempo1;
		System.out.println("tardarán en encontrarse " + tiempo1 + "segundos");
		return tiempo1;
		
	}
	
	
}
