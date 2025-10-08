package ContadorPersonas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona chu = new Persona(25,"Paco");
		Persona three = new Persona(30,"Jose");
		Persona four = new Persona(83, "Eustaquio");
				
		Persona.mostrarTotalPersona();
		Persona.mostrarultimaPersona();
		Persona.mostrarUltimoNombre();
	}

}
