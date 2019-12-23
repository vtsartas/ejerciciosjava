package tema6;

import java.util.Random; // Clase necesario para obtener números aleatorios
import java.util.Scanner; // Necesario para leer teclado

public class AdivinaPistas {

    public static void main(String[] args) {
        Scanner valor=new Scanner (System.in);
               
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        int numero = aleatorio.nextInt(100)+1,num; // 'numero' tendrá un valor aleatorio del 1 al 10
        final int MAX_INTENTOS=5;
        int intentos=MAX_INTENTOS; // inicializamos el número de intentos.
        System.out.println("TIENES 5 INTENTOS PARA ACERTAR EL NÚMERO SECRETO");
        do {
            System.out.println("¿Cuál piensas que es el número secreto (1 al 100)? (Te quedan "+intentos+" intentos).");
            // si el número aleatorio obtenido es igual al obtenido por consola 'acierto' será 'true'
            // y saldremos del bucle. Si no, restaremos un intento y volveremos a pedirlo al seguir
            // deltro del bucle do-while, que comprueba que los intentos no sean 0
            // o sean más de 5, condición que usamos si acertamos para forzar la salida del bucle
            num=valor.nextInt();
            if (numero==num){
                System.out.println("Acertaste. El número secreto era "+numero+". Has necesitado "+(6-intentos)+" intentos.");
                intentos=6; // así saldremos del bucle
            }
            else{
                System.out.println("Pista: el número secreto es "+((numero<num)?"menor":"mayor")+" que el introducido ("+num+").");
                intentos--; // si no acertamos, incrementamos el número de intentos en uno
            }
        
        } while(intentos>0 && intentos<5); // hará el do-while mientras nos queden intentos
        if (intentos==0){
            System.out.println("\nHas agotado todos los intentos.\nEl número secreto era "+numero+".");
        }        

        valor.close();
        
    }
}