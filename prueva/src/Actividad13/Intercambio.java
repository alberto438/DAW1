package Actividad13;



public class Intercambio {


 


 private int a;


 private int b;


 


 public Intercambio(int a, int b) {


 super();


 this.a = a;


 this.b = b;


 }



 public int getA() {


 return a;


 }



 public void setA(int a) {


 this.a = a;


 }



 public int getB() {


 return b;


 }



 public void setB(int b) {


 this.b = b;


 }


 


 void intercambiar() {


 int auxA = a;


 a = b;


 b = auxA;


 }


}