package ContadorPersonas;

public class Persona {

	int edad;
	String nombre;
	
	static int Npersonas = 0;
	static String ultimoNombre = "";
	static Persona ultimaPersona = null;
	
	Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		ultimoNombre = nombre;
		ultimaPersona = this;
		Npersonas++ ;
	}
	static void mostrarTotalPersona () {
		System.out.println("Se han creado " + Npersonas + "en total");
	}
	static void mostrarUltimoNombre () {
		System.out.println("el ultimo nombre creado es " + ultimoNombre);
	}
	static void mostrarultimaPersona () {
		System.out.println("La ultima persona creada tiene el nombre:" + ultimaPersona.nombre + " y tiene"  + ultimaPersona.edad + " años");
		System.out.println("La ultima persona creada tiene:" + ultimaPersona.edad + " años");
	}	
}
