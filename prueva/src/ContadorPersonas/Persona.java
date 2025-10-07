package ContadorPersonas;

public class Persona {

	int edad;
	String nombre;
	
	static int Npersonas;
	
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		Npersonas++ ;
	}
	
}
