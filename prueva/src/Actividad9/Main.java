package Actividad9;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		NotaExamenes alumno = new NotaExamenes(0,0);
		System.out.println("¿Cual es tu primera nota?");
		alumno.setnota1(sc.nextDouble());
		System.out.println("¿Cual es la media que deseas?");
		alumno.setmediaDeseada(sc.nextDouble());
		System.out.println("La nota que necesitas sacar en el primer examen es : " + alumno.calcularNotaNecesaria());   
		sc.close();
		
	}

}
