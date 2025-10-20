package Actividad18;


import java.util.Scanner;



public class Main {



 public static void main(String[] args) {


 // TODO Auto-generated method stub



 Scanner sc = new Scanner(System.in);


 System.out.println("¿Cual es su numero?"); 


 NumeroInvertido Num = new NumeroInvertido ();


 Num.setNumero(sc.nextInt());


 System.out.println("su numero es " + Num.getNumero());


 Num.InvertirNumero();


 System.out.println("Su numero invertido es " + Num.getNuevoNumero());


 


 sc.close();


 }



}

