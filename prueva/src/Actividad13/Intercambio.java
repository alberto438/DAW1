package Actividad13;



public class Intercambio {

 private int a;
 private int b;


 public Intercambio(int a, int b) {
	 
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

 public void intercambiar() {
	 
 int auxA = this.a;
 this.a = this.b;
 this.b = auxA;
 }


}