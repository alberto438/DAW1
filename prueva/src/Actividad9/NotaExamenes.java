package Actividad9;

public class NotaExamenes {

	private double nota1;
	private double mediaDeseada;
	
	public NotaExamenes (double nota1, double mediaDeseada) {
		
		this.nota1 = nota1;
		this.mediaDeseada = mediaDeseada;
	}
	
	
	
	public double getnota1() {
		return nota1;
	}
	
	public void setnota1 (double nota1) {
		this.nota1 = nota1;
	}

	public double getmediaDeseada() {
		return mediaDeseada;
	}
	
	public void setmediaDeseada (double mediaDeseada) {
		this.mediaDeseada = mediaDeseada;
	}
	public double calcularNotaNecesaria () {
		double nota2 = (this.mediaDeseada - nota1*0.4) / 0.6;
		return nota2;
	}
}
