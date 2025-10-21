package Actividad10;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿cuantos megabytes tiene tu ordenador?");
		Scanner sc = new Scanner(System.in);
		double respuesta = sc.nextDouble();
		Capacidad capaz = new Capacidad(0);
		capaz.Capacidad();
		
		
	}

}
