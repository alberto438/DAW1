package Actividad10;

public class Capacidad {

	private double megabytes;
	
	public Capacidad (double megabytes) {
		this.megabytes = megabytes;
	}

	public double getmegabytes () {
		return megabytes;
	}
		
	public void setmegabytes (double megabytes) {
		this.megabytes = megabytes;
	}
	
	public double Capacidad() {
		double kilobytes = this.megabytes*1024;
		return kilobytes;
	}
	public double Capacidad2() {
		double bytes = this.megabytes/1024;
		return bytes;
	}
}
