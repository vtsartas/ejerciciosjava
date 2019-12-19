package tema6;

import java.util.Random; // Clase necesario para obtener números aleatorios
import java.util.Scanner; // Necesario para leer teclado

public class AdivinaPistasAI {

    public static void main(String[] args) {
        Scanner valor=new Scanner (System.in);

        boolean acierto=false;
               
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        int numero = aleatorio.nextInt(1000)+1,num=500; // 'numero' tendrá un valor aleatorio del 1 al 10
        int intentos=1; // inicializamos el número de intentos.
        System.out.println("El ordenador tratará de averiguar el número secreto");
        do {
            System.out.println("INTENTO "+intentos+":");

            if (numero==num){
                System.out.println("El número secreto era "+numero+". El ordenador has necesitado "+(intentos)+" intentos.");
                acierto=true; // así saldremos del bucle
            }
            else{
                System.out.println("Fallo: el número "+num+" no es el secreto.");
                if (num<numero){
                    System.out.println("Pista: el número secreto es "+((numero<num)?"menor":"mayor")+" que el introducido ("+num+").");
                    num=num-(num/2);
                }
                else{
                    System.out.println("Pista: el número secreto es "+((numero<num)?"menor":"mayor")+" que el introducido ("+num+").");
                    num=num+(num/2);
                }
                intentos++; // si no acertamos, incrementamos el número de intentos en uno
            }
        
        } while(!acierto); // hará el do-while mientras nos queden intentos
     

        valor.close();
        
    }
}