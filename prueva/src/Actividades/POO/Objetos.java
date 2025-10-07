package Actividades.POO;

public class Objetos {

	int peso;
	static int tamaño;
	String nombre;
	final String dni;
	static String DiaDeLaSemana = "Lunes";
	
	public Objetos(int peso, String nombre, String dni) {
		super();
		this.peso = peso;
		this.nombre = nombre;
		this.dni = dni;
	}


	void encender() {
		System.out.println("Estoy encendido");
	}
		
		
	void presentar() {
		System.out.println("Hola soy un " + this.nombre);
	
	}

	void engordar() {
		peso+=250;
	}
	
	void crecer() {
		tamaño+=12;
	}
	
	void saludar() {
		System.out.println("Hola soy " + this.nombre + " y peso " + this.peso + "mg" + " y mido " + this.tamaño + "cm " + DiaDeLaSemana);
	}
	
	
}
