package Actividades;

import java.util.Scanner;

public class Actividadscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inicializar Scanner, pedir dato a usuario

		Scanner Scan = new Scanner(System.in);
		int Edad = 0;
		System.out.println("¿Cuantos años tienes?");
		Edad = Scan.nextInt();
		Edad = Edad + 1;
		System.out.println("El proximo año tendrás " + (Edad));

		// Pedir nombre

		String Nombre;
		System.out.println("¿Cual es tu nombre?");
		Nombre = Scan.next();
		System.out.println("Hola " + (Nombre));

		// Pedir notas y calcular media aritmetica
		
		double media = 0;
		int Nota1 = 0;
		int Nota2 = 0;
		System.out.println("¿Cual es tu primera nota?");
		Nota1 = Scan.nextInt();
		System.out.println("¿Cual es tu segunda nota?");
		Nota2 = Scan.nextInt();
		media = (Nota1 + Nota2) / 2.0;
		System.out.printf("Tu nota media es : %.2f \n", (media));

		// N1 es mayor que N2?
		
		System.out.println("Dime un numero");
		int N1 = Scan.nextInt();
		System.out.println("Dime otro numero");
		int N2 = Scan.nextInt();
		boolean esmayor = (N1 > N2);
		System.out.println("El numero " + (N1) + " es mayor que el numero " + (N2) + " : " + (esmayor));
 
		//comprobar si un numero es par
		
		System.out.println("Dime un numero");
		int N3 = Scan.nextInt();
		boolean comprobar = (N3%2)== 0; 
		System.out.println("ES PAR: " + comprobar);
		
		// Comprobar si esta en edad de trabajar
		System.out.println("¿Cual es tu edad?");
		int N4 = Scan.nextInt();
		boolean laboral = (N4 >= 16 && N4<67);
		System.out.println("Esta en edad de trabajar : " + laboral);
		
		// Asignar el valor a un numero mediante operadores de asignación
		int Digito = 3;
		Digito += 4;
		System.out.println(Digito);

//		//Operador ternario
//		String resultado = N4 ? "edad de trabajar = No estas en edad de trabajar";
		
		
		//Problema de las peras y las manzanas, hay que tener en cuenta los tipos de variable
		
		System.out.println("¿Cuantos kg de manzanas has vendido este semestre?");
		int N5 = Scan.nextInt();
		System.out.println("¿Cuantos kg de peras has vendido este semestre?");
		int N6 = Scan.nextInt();
		double manzanas = N5 * 2.35;
		System.out.println("Tus beneficios en manzanas han sido " + manzanas);
		double peras = N6 * 1.95;
		System.out.println("Tus beneficios en peras han sido " + peras);
		double beneficios = peras + manzanas;
		System.out.println("Tus beneficios totales del semestre han sido " + beneficios);
		System.out.println("¿Cuantos kg de manzanas has vendido este segundo semestre?");
		int N7 = Scan.nextInt();
		System.out.println("¿Cuantos kg de peras has vendido este segundo semestre?");
		int N8 = Scan.nextInt();
		double manzanas2 = N7 * 2.35;
		System.out.println("Tus beneficios en manzanas este segundo han sido " + manzanas);
		double peras2 = N8 * 1.95;
		System.out.println("Tus beneficios en peras este segundo han sido " + peras);
		double beneficios2 = peras + manzanas + peras2 + manzanas2;
		System.out.println("Tus beneficios totales del año han sido " + beneficios2);
	}

}
