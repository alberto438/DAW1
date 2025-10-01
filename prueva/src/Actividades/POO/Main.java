package Actividades.POO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		Objetos o1 = new Objetos();
		
		o1.nombre = "Cuñao";
		o1.peso = 19283491;
		o1.tamaño = 142;
		
		System.out.println("Su nombre es " + o1.nombre);
		System.out.println("Su peso es " + o1.peso + " kg");
		
		Objetos o2 = new Objetos();
		
		o1.encender();
		o2.encender();
		o1.presentar();
		o2.presentar();
		
	}

}
