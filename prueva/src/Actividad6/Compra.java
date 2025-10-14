package Actividad6;

public class Compra {

	double total;
	
	
	
	public Compra(double total) {
		super();
		this.total = total;
	}

	public double gettotal() {
		return total;
	}
	
	public void settotal () {
		this.total = total;
	}
	
	
	
	public void mostrarTotalConDescuento() {
		
		double totalDescuento = total * 15 / 100;
		double totalConDescuento = total - totalDescuento;
		System.out.println("la rebaja de la compra es " + totalDescuento);
		System.out.println("el coste de la compra real es " + totalConDescuento);
	}
}
