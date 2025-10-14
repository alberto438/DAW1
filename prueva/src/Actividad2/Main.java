package Actividad2;

import java.util.Scanner;

import Actividad1.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto mide el primer cateto? (añade sus decimales despues de .)");
		double catetoA = sc.nextDouble();
		System.out.println("¿Cuanto mide el segundo cateto? (añade sus decimales despues de .)");
		double catetoB = sc.nextDouble();
		
		TrianguloRectangulo tr1 = new TrianguloRectangulo(catetoA, catetoB);
		tr1.calcularHipotenusa();
		
	}

}
