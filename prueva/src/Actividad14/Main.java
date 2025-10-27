package Actividad14;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual es la velocidad del primer vehiculo?");
		double velocidad1 = sc.nextDouble();
		System.out.println("¿Cual es la velocidad del segundo vehiculo?");
		double velocidad2 = sc.nextDouble();
		System.out.println("¿Cual es la distancia que tienen que recorrer antes de encontrarse?");
		double distancia = sc.nextDouble();
		CruceVehiculos primero = new CruceVehiculos(velocidad1, velocidad2, distancia);
		primero.calcularTiempoAlcance(velocidad1, velocidad2, distancia);
		sc.close();
		
	}

}
