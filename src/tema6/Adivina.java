package tema6;

import java.util.Random; // Clase necesario para obtener números aleatorios
import java.util.Scanner; // Necesario para leer teclado

public class Adivina {

    public static void main(String[] args) {
        Scanner valor=new Scanner (System.in);
               
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        int numero = aleatorio.nextInt(10)+1; // 'numero' tendrá un valor aleatorio del 1 al 10
        int intentos=5; // inicializamos el número de intentos.
        System.out.println("TIENES 5 INTENTOS PARA ACERTAR EL NÚMERO SECRETO");
        do {
            System.out.println("¿Cuál piensas que es el número secreto (1 al 10)? (Te quedan "+intentos+" intentos).");
            // si el número aleatorio obtenido es igual al obtenido por consola 'acierto' será 'true'
            // y saldremos del bucle. Si no, restaremos un intento y volveremos a pedirlo al seguir
            // deltro del bucle do-while, que comprueba que los intentos no sean 0
            // o sean más de 5, condición que usamos si acertamos para forzar la salida del bucle
            if (numero==valor.nextInt()){
                System.out.println("Acertaste. El número secreto era "+numero+". Has necesitado "+(6-intentos)+" intentos.");
                intentos=6; // así saldremos del bucle
            }
            else{
                intentos--; // si no acertamos, incrementamos el número de intentos en uno
            }
        
        } while(intentos>0 && intentos<5); // hará el do-while mientras nos queden intentos
        if (intentos==0){
            System.out.println("Has agotado todos los intentos. Game over.");
        }
        
        

        valor.close();
        
    }
}