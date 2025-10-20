package Actividad7;


 //clase



public class NotaAlgoritmos {



 //atributos


 


 private double parcial1;


 private double parcial2;


 private double parcial3;



 private double examenFinal;


 private double trabajoFinal;


 


 //constructor 


 


 public NotaAlgoritmos(double parcial1, double parcial2, double parcial3, double examenFinal,


 double trabajoFinal) {


 super();


 this.parcial1 = parcial1;


 this.parcial2 = parcial2;


 this.parcial3 = parcial3;


 this.examenFinal = examenFinal;


 this.trabajoFinal = trabajoFinal;


 }


 


 //getter y setter


 


 


 public double getParcial1() {


 return parcial1;


 }


 


 public void setParcial1(double parcial1) {


 this.parcial1 = parcial1;


 }


 public double getParcial2() {


 return parcial2;


 }


 public void setParcial2(double parcial2) {


 this.parcial2 = parcial2;


 }


 public double getParcial3() {


 return parcial3;


 }


 public void setParcial3(double parcial3) {


 this.parcial3 = parcial3;


 }


 public double getExamenFinal() {


 return examenFinal;


 }


 public void setExamenFinal(double examenFinal) {


 this.examenFinal = examenFinal;


 }


 public double getTrabajoFinal() {


 return trabajoFinal;


 }


 public void setTrabajoFinal(double trabajoFinal) {


 this.trabajoFinal = trabajoFinal;


 }


 


 //método para calcular la nota final



 public double calcularNotaFinal() {


 double promParciales = (parcial1+parcial2+parcial3)/3;


 double notaFinal = promParciales*0.55+examenFinal*0.3+trabajoFinal*0.15;


 return notaFinal;


 }


}