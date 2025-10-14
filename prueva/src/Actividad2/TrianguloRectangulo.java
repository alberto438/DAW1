package Actividad2;

public class TrianguloRectangulo {

	private double catetoA;
	private double catetoB;
	
	public TrianguloRectangulo(double catetoA, double catetoB) {
		super();
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}
	
	public double getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(double catetoA) {
		this.catetoA = catetoA;
	}

	public double getCatetoB() {
		return catetoB;
	}

	public void setCatetoB(double catetoB) {
		this.catetoB = catetoB;
	}

	public void calcularHipotenusa() {
		double hipotenusa = catetoA * catetoA + catetoB * catetoB;
		hipotenusa = Math.sqrt(hipotenusa);
		System.out.println("Tu hipotenusa mide: " + hipotenusa + " cm " );
}


}
