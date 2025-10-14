package Actividad6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿cual es el importe de la compra?");
		double numero1 = sc.nextDouble();
		Compra c1 = new Compra (numero1);
		c1.mostrarTotalConDescuento();

	}

}
