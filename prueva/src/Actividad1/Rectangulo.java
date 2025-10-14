package Actividad1;
import java.util.Scanner;
public class Rectangulo {

	
//	Crea una clase denominada Rectangulo con los atributos base y altura. Escribe un programa que solicite al usuario la base y 
//	la altura de un rectángulo, cree un objeto de la clase y calcule, mediante métodos, su perímetro y su área. Muestra ambos resultados
//	por pantalla.
	
	//Ejercicio
	
	private int base;
	private int altura;
	
	Scanner sc = new Scanner(System.in);
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	
	public void getBase() {
		System.out.println(this.base);
	}



	public void setBase(int base) {
		this.base = base;
	}



	public void getAltura() {
		System.out.println(this.altura);
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public void CalcularPerimetroYArea() {
		int base = 0;
		System.out.println("¿Que base tiene?");
		base = sc.nextInt();
		System.out.println("¿Que altura tiene?");
		altura = sc.nextInt();
		int area = base * altura;
		int perimetro = base * 2 + altura * 2;
		System.out.println("El área del cuadrilatero es " + area);
		System.out.println("El perímetro del cuadrilatero es " + perimetro);
		
	}
	
	
}
