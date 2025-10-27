package Actividad13;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

 // TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("¿Cual es el valor A?");
 int A = sc.nextInt();
 System.out.println("¿Cual es el valor B?");
 int B = sc.nextInt();
 System.out.println("el valor A es = " + A + " el valor de B es = " + B);
 
 Intercambio Int = new Intercambio(A,B);
 Int.intercambiar();
 System.out.println("Después del intercambio");
 System.out.println("El valor de A es " + Int.getA());
 System.out.println("El valor de B es " + Int.getB());

 sc.close();
 }



}

