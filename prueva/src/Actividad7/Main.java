package Actividad7;


import java.util.Scanner;



public class Main {



 public static void main(String[] args) {


 // TODO Auto-generated method stub



 //creamos un scanner


 Scanner sc = new Scanner(System.in);


 //creamos un objeto de la clase don los valores en 0 


 NotaAlgoritmos usuario1 = new NotaAlgoritmos (0,0,0,0,0);


 //preguntamos al usuario la nota del primer parcial


 System.out.println("¿Cual ha sido tu nota en el primer parcial?");


 //incluimos la nota en parcial1 y la cambiamos utilizando el set de parcial1


 usuario1.setParcial1(sc.nextDouble());


 //hacemos lo mismo para el parcial2


 System.out.println("¿Cual ha sido tu nota en el segundo parcial?");


 usuario1.setParcial2(sc.nextDouble());


 //y con el tercero


 System.out.println("¿Cual ha sido tu nota en el tercer parcial?");


 usuario1.setParcial3(sc.nextDouble());


 //la nota del examen final


 System.out.println("¿Cual ha sido la nota de su examen final?");


 usuario1.setExamenFinal(sc.nextDouble());


 //y la de su trabajo final


 System.out.println("¿Cual ha sido la nota de su trabajo final?");


 usuario1.setTrabajoFinal(sc.nextDouble());


 


 //en la variable notaFinal, insertamos el valor de utilizar


 //el metodo que calcula la ponderacion


 double notaFinal = usuario1.calcularNotaFinal();


 System.out.printf("la nota final corresponde a un %.2f sobre 10%n", notaFinal);


 }


}

