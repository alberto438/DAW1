package Actividad8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuales son los numeros de los cuales quieres conocer la distancia?");
		System.out.println("¿Cual es el primer numero?");
		double num1 = sc.nextDouble();
		System.out.println("¿Cual es el segundo numero?");
		double num2 = sc.nextDouble();
		
		DistanciaAbsoluta da1 = new DistanciaAbsoluta(num1, num2);
		da1.mostrarDistancia();


	}

}
