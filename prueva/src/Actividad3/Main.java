package Actividad3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			System.out.println("¿que operacion quieres hacer?");
			System.out.println("1-Sumar"
								+ "2-Restar"
								+ "3-Multiplicar"
								+ "4-Dividir");
			Scanner sc = new Scanner(System.in);
			int eleccion = sc.nextInt();
			System.out.println("¿cual es el primer numero?");
			double numero1 = sc.nextDouble();
			System.out.println("¿cual es el segundo numero?");
			double numero2 = sc.nextDouble();
			Calculadora c1 = new Calculadora(numero1, numero2);
			switch (eleccion) {
				case 1:
					c1.sumar();
					break;
				case 2:
					c1.restar();
					break;
				case 3:
					c1.multiplicar();
					break;
				case 4: 
					c1.dividir();
					break;
				default:
					System.out.println("opcion no valida");
			}

	}
}
