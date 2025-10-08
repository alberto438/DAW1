package privacidad;

import java.util.Scanner;

public class CuentaCorriente {
	
	public String nombre;
	String dni;
	private int saldo;
	//Atributos
	
	public CuentaCorriente(String nombre, String dni, int saldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}
	//Constructor
	

	Scanner sc = new Scanner(System.in);
	
	//Métodos
	void Ingresar() {
		int efectivo;
		System.out.println("¿Cuanto dinero quieres ingresar?");
		efectivo = sc.nextInt();
		
		saldo += efectivo;
		System.out.println("Acabas de ingresar dinero en tu cuenta,tu saldo actual es: " + this.saldo);
	}
	
	void Retirar() {
		int retiro;
		System.out.println("¿Cuanto dinero quieres retirar?");
		retiro = sc.nextInt();
	
		
		if ( this.saldo < retiro ) {
			System.out.println("no tienes dinero suficiente pringao pídele dinero a tu puta madre");
		} else {
			this.saldo -= retiro;
			System.out.println("Acabas de retirar dinero, tu saldo actual es: " + this.saldo);
		}
	}
	
	void Informacion() {
		System.out.println("Tu puto nombre de mierda es: " + this.nombre + ", tu Dni de mierda es: " + this.dni + ", tienes esta mierda de dinero: " + this.saldo);
	}
	
	void CloseScan() {
		sc.close();
	}
	
}
