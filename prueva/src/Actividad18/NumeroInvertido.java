package Actividad18;



public class NumeroInvertido {



 private int numero;


 private int nuevoNumero;



 public int getNumero() {


 return numero;


 }



 public void setNumero(int numero) {


 this.numero = numero;


 }


 


 public int getNuevoNumero() {


 return nuevoNumero;


 }



 public void setNuevoNumero(int nuevoNumero) {


 this.nuevoNumero = nuevoNumero;


 }



 void InvertirNumero(){


 int unidades = numero / 10;


 int decenas = numero %10;


 this.nuevoNumero = decenas * 10 + unidades; 


 }


 


}

