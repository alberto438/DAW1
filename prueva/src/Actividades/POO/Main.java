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
		
		System.out.println(o1.nombre);
	}

}
