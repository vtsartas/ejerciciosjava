package tema6;

import java.util.Random; // Clase necesaria para obtener números aleatorios

public class AdivinaPistasAI {

    public static void main(String[] args) {

        boolean acierto=false; // será 'true' cuando se acierte el número secreto, saliendo del bucle do-while
               
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        final int POSIBILIDADES=10000000; // cantidad de números entre los que se elije uno de forma aleatoria
        int numero = aleatorio.nextInt(POSIBILIDADES)+1; // 'numero' es aleatorio entre 1 y 'posibilidades'
        int num=POSIBILIDADES/2; // iniciamos el valor con el que compararemos a 1/2 del total de posibles números
        int intentos=1; // inicializamos el número de intentos.
        int aprox=num/2; // valor de aproximación que sumaremos o restaremos para acercarnos al resultado
        String texto="";
        System.out.printf("El ordenador tratará de averiguar el número secreto entre los %d posibles.\n",POSIBILIDADES);
        do {
            System.out.printf("INTENTO %d. Se comprobará el número %d. Aprox=%d\n",intentos,num,aprox);

            if (numero==num){
                texto="El número secreto era "+numero+". El ordenador ha necesitado "+intentos+" intentos.";
                acierto=true; // así saldremos del bucle
            }
            else{
                texto="Fallo: el número "+num+" no es el secreto ("+numero+"),";
                if (numero<num){
                    texto=texto+" el número secreto es menor.\n";
                    num-=aprox;
                }
                else{
                    texto=texto+" el número secreto es mamyor.\n";
                    num+=aprox;
                }
                
                // reducimos el valor de aproximación a la mitad redondeando al alza
                // porque dejaríamos valores sin comprobar
                aprox=(int)Math.ceil((double)aprox/2);

                intentos++; // si no acertamos, incrementamos el número de intentos en uno
            }
        System.out.printf(texto);
        } while(!acierto); // hará el do-while mientras nos queden intentos
        
    }
}