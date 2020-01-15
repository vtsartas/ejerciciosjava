package tema7;

// import java.util.Random; // Clase necesaria para obtener números aleatorios

public class HundirFlota {
    public static void main(String[] args) {

        LeeTeclado.iniSc();

        System.out.print("El juego consiste en localizar la flota enemiga introduciendo\n");
        System.out.print("las coordenadas donde crees que tiene sus barcos.\n");

        // Establecemos el TAMAÑO del tablero y CUÁNTOS BARCOS habrá

        System.out.print("Introduce el ancho del tablero: ");
        final int ANCHO_TABLERO=LeeTeclado.readInt();

        System.out.print("Introduce el alto del tablero: ");
        final int ALTO_TABLERO=LeeTeclado.readInt();

        int numbarcos;
        int maxbarcos=ALTO_TABLERO*ANCHO_TABLERO/2; // definimos el máximo de barcos en función del tablero
        int x,y;

        System.out.print("Introduce el número de barcos (máximo "+maxbarcos+"): ");
        do {
            numbarcos=LeeTeclado.readInt();
            if (numbarcos<1||numbarcos>maxbarcos){
                System.out.print("ERROR: número de barcos erroneo.\nIntroduce el número de barcos (entre 1 y "+maxbarcos+"): ");
            }

        }while(numbarcos<1||numbarcos>maxbarcos);

        // DEFINIMOS Y RELLENAMOS de forma aleatoria el tablero

        boolean [][] tablero=HundirFlotaUtils.rellenaTablero(ANCHO_TABLERO, ALTO_TABLERO, numbarcos);

        // EMPEZAMOS el juego

        // definimos otro tablero de dos niveles para ir anotando resultados,
        // en un nivel anotaremos los fallos (agua) y en otro los aciertos (barco)
        boolean[][][] tableroAciertos=new boolean[ANCHO_TABLERO][ALTO_TABLERO][2];

        // definimos la cantidad de intentos en función del tamaño del tablero y los barcos
        int intentos=numbarcos+(ALTO_TABLERO*ANCHO_TABLERO/3);

        System.out.print("Comienza el juego...\n\n");

        int barcosFaltan=numbarcos; // en una variable tendremos el número de barcos por descubrir
        
        
        // AQUÍ EMPIEZA EL BUCLE PRINCIPAL DEL PROGRAMA DONDE IREMOS PIDIENDO COORDENADAS Y COMPROBANDO
        // SI ES ACIERTO O NO, Y SI EL JUEGO CONCLUYE POR ENCONTRAR TODOS LOS BARCOS O HABER
        // CONSUMIDO TODOS LOS INTENTOS

        // LAS COORDENADAS EMPEZARÁN EN 1

        boolean salida=false; // controlaremos la salida con una variable lógica 

        do{
            // MOSTRAMOS el estado actual de aciertos/fallos del tablero
            HundirFlotaUtils.pintaTablero(tableroAciertos);

            // PEDIMOS LAS COORDENADAS, asegurándonos de que no son repetidas ni se salen de los límites del tablero
            
            boolean coordOK=false; // controlaremos que las coordenadas introducidas estén en los límites del tablero

            do{
                // mostramos los intentos restantes y los barcos que faltan por descubrir
                System.out.print("\nTe quedan "+intentos+" intentos y "+barcosFaltan+" barcos por encontrar.\n");
                

                // pedimos la coordenada 'x'
                System.out.print("\nIntroduce la coordenada 'x': ");
                do{
                    x=LeeTeclado.readInt();
                    // si el dato introducido es mayor o igual al ancho no sirve y pedimos de nuevo
                    if (x<1||x>ANCHO_TABLERO){
                        System.out.print("ERROR: la coordenada 'x' no es correcta.\nIntroduce una entre 1 y "+ANCHO_TABLERO+": ");
                    }
                }while(x<1||x>ANCHO_TABLERO);
                
                // pedimos la coordenada 'y'
                System.out.print("Introduce la coordenada 'y': ");
                do{
                    y=LeeTeclado.readInt();
                    // si el dato introducido es mayor o igual al alto no sirve y pedimos de nuevo
                    if (y<1||y>ALTO_TABLERO){
                        System.out.print("ERROR: la coordenada 'y' no es correcta.\nIntroduce una entre 1 y "+ALTO_TABLERO+": ");
                    }
                }while(y<1||y>ALTO_TABLERO);

                
                // una vez obtenido el juego de coordenadas comprobamos si ya se ha
                // introducido antes chequeando en ambos niveles del teblero de estado
                if (tableroAciertos[x-1][y-1][0]||tableroAciertos[x-1][y-1][1]){
                    System.out.print("ERROR: has repetido una coordenada\n");
                    coordOK=false;
                }
                else{
                    coordOK=true;
                }

                // mientras no tengamos un juego OK de coordenadas el programa volverá a pedirlas
            }while(!coordOK);

            // COMPROBAMOS si es acierto o fallo, y los intentos que quedan

            intentos--; // ya podemos restar un intento al tener coordenadas nuevas a comprobar

            // si la posición indicada contiene un barco habremos acertado
            if (tablero[x-1][y-1]){
                barcosFaltan--; // faltará un barco menos por encontrar
                System.out.print("\n¡HUNDIDO!\n");
                tableroAciertos[x-1][y-1][1]=true; // marcamos el acierto en el nivel segundo de tablero de estados
                
                // si con este acierto no quedan barcos por encontrar es que hemos ganado el juego
                if (barcosFaltan==0){
                    System.out.print("\n¡HAS CONSEGUIDO HUNDIR TODOS LOS BARCOS!");
                    salida=true; // con esto saldremos del bucle principal para terminar el programa
                    HundirFlotaUtils.solucion(tablero, tableroAciertos);
                }
            }
            else{
                // en caso contrario, anotamos el fallo en el primer nivel del tablero de estados
                System.out.print("\n¡AGUA!\n");
                tableroAciertos[x-1][y-1][0]=true;

                // comprobar en qué punto de los intentos disponibles nos encontramos

                // si no quedan intentos o nos quedan menos intentos que barcos faltan por localizar habremos perdido
                if (intentos==0||(intentos<barcosFaltan)){
                    salida=true; // con esto saldremos del bucle
                    System.out.print("GAME OVER. Te mostramos la solución:");
                    
                    // Mostramos la solución marcando de forma diferente los fallos
                    
                    HundirFlotaUtils.solucion(tablero, tableroAciertos);

                } // fin del if que comprueba los intentos
            
            } // fin del else de los fallos

        }while(!salida); // fin del do...while principal

        LeeTeclado.cierraSc();

    } // fin del main
    
} // fin de la clase principal