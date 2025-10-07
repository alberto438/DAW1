package prueva;


/* sección imports, utilizo las importaciones de metodos deArrays, Random para numeros aleatorios
y el escaner para la comunicacion con el usuario */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ENTREGABLE_Blackjackcorregido {

// abro la clase de mi archivo java
//========================================METODO BARAJA===============================================0
// En ka ckase baraja genero la baraja que se utilizara para la partida 

    public static String[] Baraja() {

        String [] numerosbaraja = {"2", "3", "4", "5", "6", "7",
                                 "8", "9", "10", "J", "Q", "K", "A"};

// Array de los numeros de la baraja

        String [] palosbaraja = { "♠", "♥", "♦", "♣"};

// Array de los palos e la baraja

        String[] mazo = new String[numerosbaraja.length * palosbaraja.length];

// Coleccion de las cartas combinando el array numerosbaraja y palosbaraja

        int indice = 0; 
        for (String palo : palosbaraja) {
            for (String numero : numerosbaraja) {
                mazo[indice] = numero + palo; 
                indice++;            
            }
        }

 // imprimo la baraja con un bucle for each

        for (String cartas : mazo) {
            System.out.println(cartas);
        }
        return mazo;
    } 

//=======================================METODOFISHERYATES==================================================  
// creo el metodo fisheryates para barajar el mazo en un bucle for del de la variable i, que contiene
// los numeros de la baraja y en una variable j que contiene los palos de la naraja.

    public static void fisherYates(String[] mazo) {
        Random random = new Random();
        for (int i = mazo.length - 1; i > 0; i--) {

// Empieza el bucle desde el final del mazo y desciendo 1 unidad

            int j = random.nextInt(i + 1);

// Intercambiar los elementos en las posiciones i y j usando una variable temporal

            String temporal = mazo[i];
            mazo[i] = mazo[j];
            mazo[j] = temporal;
        }
    }

//=============================================METODO IMPRIMIR MAZO========================================
// este es el metodo que imprime la baraja creando una variable carta que navega por el array mazo

    public static void imprimirMazo(String[] mazo) {
        for (String cartas : mazo) {
            System.out.print(cartas + ", ");
        }
        System.out.println(); 
    }
//==========================================METODO DARCARTA===============================================
/*Este metodo da la primera carta del mazo barajado, crea un array nuevo borrando esa carta del mismo
 hacendo 1 unidad mas pequeño el array */

    public static String darCarta(String[] mazo) {

/*  cartaA es la primer carta del mazo barajado que es la que siempre se reparte ya que están 
barajadas */

        String cartaA = mazo[0];

// Aqui restrinjo la opcion de quedarse sin cartas, aunque sea imposible por corrección

        if (mazo.length == 0) {
            System.out.println("No quedan cartas");
            
/*  Retiro la carta repartida eliminando la primera carta del mazo que es la que siempre 
se reparte al usar darCarta */

        }String[] nuevoMazo = new String[mazo.length - 1];
        for (int i = 1; i < mazo.length; i++) {
            nuevoMazo[i - 1] = mazo[i];
        }
/* Copio los elementos restantes del nuevoMazo al array original mazo para actualizarlo
y poder seguir utilizandolo con el string arraycopy */

        System.arraycopy(nuevoMazo, 0, mazo, 0, nuevoMazo.length);
// El método devuelve cartaA para poder contablizarla en la mano de crupier y jugador
        return cartaA;
    }

// ============================================METODO VALOR CARTA ==========================================
//Este metodo me da los valores de cada carta

    public static int valorCarta(String carta) {

/*  Extraigo el valor de la carta con el metodo substring indicándole que quiero 
la primera string de la cadena de string que es una carta y que indica su valor real */

        String valor = carta.substring(0, carta.length() - 1);

/*  Utilizo switch para darle el valor a cada carta, el valor de A variante lo modi-
ficare despues */

            switch (valor){
                case "A":
                    return 11;
                case "J", "Q", "K":
                    return 10;

/*  Convierto el contenido de la variable valor (que es una cadena de strings) en un
número entero mediante integer.parseInt  */

                default:
                    return Integer.parseInt(valor);
            }
    }

// ===============================================METODO VALOR MANO =========================================
// Este metodo me da el valor de las cartas de la mano

    public static int valorMano(String[] mano) {

// Inicio las variables total y ases

        int total = 0;
        int ases = 0;

/*  Uso un bucle for each para recorrer cada carta del array mano, obtengo el valor de cada
carta con el metodo valorCarta, reasigno la suma de valores a la variable total */

        for (String carta : mano) {
            int valor = valorCarta(carta);
            total += valor;

// Añado un contador de ases utilizando el método string startwith de cadenas multiples 

            if (carta.startsWith("A")) {
                ases++;
            }

/*El bucle while, se activa cuando el total de la mano es mayor a 21 y el numero de ases
* de la mano es mayor a 0, haciendo que el total de la mano se reduzca en 10, a continuación
* añado un contador negativo de ases para que si en la mano de cualquiera de los jugadores
* hay 2 ases, el siguiente tambien se reduzca su valor */

            while (total > 21 && ases > 0) {
                total -= 10; 
                ases--;
            }
        }

// Devuelve el valor total de la mano  

    return total;
    }

/*  =============================================METODO CRUPIER===========================================
   En este metodo elaboro los pasos a seguir del cuprier, primero creo la mano crupier
 * creando un nuevo array de tamaño 2 con las dos cartas llamadas por el metodo darCarta
 * inmprimo ambas cartas y marco el valormanocrupier como un entero aplicando el método
 * valorMano al string manocrupier */

    public static String[] crupier(String[] mazo,String[] manocrupier, int totalMano){
        System.out.println("Ahora me toca a mi");
        int valormanocrupier = valorMano(manocrupier);
        while (valormanocrupier <= totalMano) {
            String nuevacarta = darCarta(mazo);
            System.out.println("El crupier pide carta: " + nuevacarta);

            // Ampliar el array para incluir la nueva carta

            String[] nuevaManoCrupier = Arrays.copyOf(manocrupier, manocrupier.length + 1);
            nuevaManoCrupier[manocrupier.length] = nuevacarta;
            manocrupier = nuevaManoCrupier;
    
            // Recalcular el valor de la mano del crupier

            valormanocrupier = valorMano(manocrupier);
           
/*En el bucle while obligo al crupier a seguir robando carta mientras el valor de su mano
* sea menor o igual al de la mano del usuario, la carta pasa a ser parte del array manocrupier
ya que se copia el mismo mediante Arrays.copyOf y la amplitud +1 de manocrupier, posteriormente reasigno
manocrupier al valor del array nuevamanocrupier*/

       
/* Añado las condiciones para que el crupier siga robando, pierda o gane la partida según su punutación */

            if (valormanocrupier > totalMano && valormanocrupier < 22){
                System.out.println("Perdiste");   
            }else if (valormanocrupier > 21) {
                System.out.println("Felicidades");
            }else if (valormanocrupier == 21 && totalMano == 21){
                System.out.println("Empate");
                break;
            }
        }
        return manocrupier;
    }
// ==================================METODO MAIN ==============================================

    public static void main(String[] args) {

//Llamo al scanner

        Scanner scanner = new Scanner(System.in);

        
// Llamo la baraja

        System.out.println("Aquí está la baraja");
        System.out.println("Mazo:");
        String[] mazo = Baraja();

// Imprimir la baraja original

        System.out.println("");
        System.out.println("Baraja original:");
        imprimirMazo(mazo);

// Mezclar la baraja usando Fisher-Yates

        System.out.println("");
        System.out.println("Voy a barajar el mazo");
        fisherYates(mazo);

// Imprimir la baraja mezclada

        System.out.println("\nBaraja mezclada:");
        imprimirMazo(mazo);fisherYates(mazo);

// Dar primeras cartas

        System.out.println("Aqui tienes tus cartas");
        String[] mano = new String[2];
        mano[0] = darCarta(mazo);
        mano[1] = darCarta(mazo);
        System.out.println("Tu mano inicial: " + Arrays.toString(mano));
        for (String carta : mano) {
            System.out.println(carta);
        }
        // Mano inicial del crupier (solo una carta visible)
        String[] manocrupier = new String[1];
        manocrupier[0] = darCarta(mazo);
        System.out.println("Carta visible del crupier: " + manocrupier[0]);
        
// Calcular valor mano mediante el método

        int totalMano = valorMano(mano);

// Creo la string nueva mano para que exista previamente a la condicion if

        String[] nuevaMano = null;
        while (totalMano < 21) {

// Aqui pregunto al usuario si quiere otra carta o decide plantarse

            System.out.println("¿Quieres otra carta s/n?");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("s")) {
                String nuevaCarta = darCarta(mazo);
                System.out.println("Carta: " + nuevaCarta);

/*  utilizo el mismo sistema para robar carta y añadirla a la mano del usuario que
utilice con la mano del crupier */

                nuevaMano = new String[mano.length + 1];
                System.arraycopy(mano, 0, nuevaMano, 0, mano.length);
                nuevaMano[mano.length] = nuevaCarta;
                mano = nuevaMano;
                totalMano = valorMano(mano);
            
                
/*  Condiciono la condicion de seguir robando según si se ha pasado o ha alcanzado 21 y ha
hecho blackjack */ 

                if (totalMano > 21){
                    break;
                }else if( totalMano == 21){
                    System.out.println("Felicidades");
                    break;
                }
// En caso de que no pida mas cartas break para pasar a la siguiente tarea

            }else if(respuesta.equals("n")){
                System.out.println("Por tu cara, parece que no quieres mas cartas");
                break;
            }
            else{
                System.out.println("Disculpa, no te he entendido bien, prueba otra vez.");
            }
        }

// En caso de que mientras robe se pase de 21, se termina el juego y ha perdido el usuario

            if (totalMano > 21) {
                 System.out.println("El juego ha terminado. El crupier no juega porque perdiste.");

// en caso de que responda que no a la pregunta de si quiere mas cartas, comienza el turno del crupier

            }else {
            crupier(mazo, manocrupier, totalMano);
            }

// cierro el scanner y fin

        scanner.close();   

    }
}
 