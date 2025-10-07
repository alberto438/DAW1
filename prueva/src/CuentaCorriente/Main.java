package CuentaCorriente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1 = new Cuenta("Salvat","8764356C",0);

		c1.Informacion();
		c1.Ingresar();
		c1.Informacion();
		c1.Retirar();
		c1.Informacion();
		c1.Retirar();

		c1.Informacion();
		c1.Ingresar();
		c1.Informacion();
		c1.Retirar();
		c1.Informacion();
		c1.Retirar();
	}

	
}
