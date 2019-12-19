package tema6;

import java.util.Random; // Clase necesaria para obtener números aleatorios

public class AdivinaPistasAI {

    public static void main(String[] args) {

        boolean acierto=false; // será 'true' cuando se acierte el número secreto, saliendo del bucle do-while
               
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        int posibilidades=1000000; // cantidad de números entre los que se elije uno de forma aleatoria
        int numero = aleatorio.nextInt(posibilidades)+1; // 'numero' es aleatorio entre 1 y 'posibilidades'
        int num=posibilidades/2; // iniciamos el valor con el que compararemos a 1/2 del total de posibles números
        int intentos=1; // inicializamos el número de intentos.
        int aprox=num/2; // valor de aproximación que sumaremos o restaremos para acercarnos al resultado
        System.out.printf("El ordenador tratará de averiguar el número secreto entre los %d posibles.\n",posibilidades);
        do {
            System.out.printf("INTENTO %d. Se comprobará el número %d. Aprox=%d\n",intentos,num,aprox);

            if (numero==num){
                System.out.println("El número secreto era "+numero+". El ordenador ha necesitado "+(intentos)+" intentos.");
                acierto=true; // así saldremos del bucle
            }
            else{
                System.out.printf("Fallo: el número %d no es el secreto (%d)",num,numero);
                if (numero<num){
                    System.out.print("(el número secreto es menor).\n");
                    num-=aprox;
                }
                else{
                    System.out.print("(el número secreto es mayor).\n");
                    num+=aprox;
                }
                
                // reducimos el valor de aproximación a la mitad redondeando al alza
                // porque dejaríamos valores sin comprobar
                aprox=(int)Math.ceil((double)aprox/2);

                intentos++; // si no acertamos, incrementamos el número de intentos en uno
            }
        
        } while(!acierto); // hará el do-while mientras nos queden intentos
        
    }
}