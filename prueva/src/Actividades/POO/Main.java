package Actividades.POO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		Objetos o1 = new Objetos(42, "luis", "dsasa");
		
		o1.nombre = "Cuñao";
		o1.peso = 82;
		o1.tamaño = 142;
				
		System.out.println("Su nombre es " + o1.nombre);
		System.out.println("Su peso es " + o1.peso + " kg");
		
		Objetos o2 = new Objetos(25, "Salvat", "lksadahjk");
		o1.encender();
		o2.encender();
		o1.presentar();
		o2.presentar();
		o1.saludar();
		o1.engordar();
		o1.crecer();
		o1.crecer();
		o1.crecer();
		o1.crecer();
		o1.crecer();
		o1.crecer();
		o1.engordar();
		o1.engordar();
		o1.engordar();
		o1.engordar();
		o1.saludar();
		o2.saludar();
		o2.crecer();
		o2.crecer();
		o2.crecer();
		o2.crecer();
		o2.crecer();
		o2.crecer();
		o2.crecer();
		o2.crecer();
		o2.engordar();
		o2.engordar();
		o2.engordar();
		o2.engordar();
		o2.engordar();
		o2.engordar();
		o2.saludar();
		
	}

}
