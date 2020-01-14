package tema7;

import java.util.Random; // Clase necesaria para obtener números aleatorios

public class HundirFlota {
    public static void main(String[] args) {

        LeeTeclado.iniSc();

        // Establecemos el TAMAÑO del tablero y CUÁNTOS BARCOS habrá

        System.out.print("Introduce el ancho del tablero: ");
        final int ANCHO_TABLERO=LeeTeclado.readInt();

        System.out.print("Introduce el alto del tablero: ");
        final int ALTO_TABLERO=LeeTeclado.readInt();

        int numbarcos;
        int maxbarcos=ALTO_TABLERO*ANCHO_TABLERO/2; // definimos el máximo de barcos en función del tablero
        int i,j;
        int x,y;

        System.out.print("Introduce el número de barcos (máximo "+maxbarcos+"): ");
        do {
            numbarcos=LeeTeclado.readInt();
            if (numbarcos>maxbarcos){
                System.out.print("ERROR: demasiados barcos.\nIntroduce el número de barcos: (máximo "+maxbarcos+"): ");
            }

        }while(numbarcos>maxbarcos);

        // DEFINIMOS Y RELLENAMOS de forma aleatoria el tablero

        boolean[][] tablero=new boolean[ANCHO_TABLERO][ALTO_TABLERO];
      
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        
        int contador=0;

        do {
            
            // generamos coordenadas aleatorias x,y para ubicar los barcos
            x=aleatorio.nextInt(ANCHO_TABLERO);
            y=aleatorio.nextInt(ALTO_TABLERO);

            // nos aseguramos de que en esa posición no haya ya un barco para evitar
            // duplicados (habría menos barcos en el tablero de los indicados) 
            if (!(tablero[x][y])){
                tablero[x][y]=true;
                contador++;
            }

        }while(contador<numbarcos);

        // EMPEZAMOS el juego

        // definimos otro tablero de dos niveles para ir anotando resultados,
        // en un nivel anotaremos los fallos (agua) y en otro los aciertos (barco)
        boolean[][][] tableroAciertos=new boolean[ANCHO_TABLERO][ALTO_TABLERO][2];

        // definimos la cantidad de intentos en función del tamaño del tablero y los barcos
        int intentos=(ALTO_TABLERO*ANCHO_TABLERO)-(ALTO_TABLERO*ANCHO_TABLERO/4);

        System.out.print("Comienza el juego...\n\n");

        int barcosFaltan=numbarcos; // en una variable tendremos el número de barcos por descubrir
        String imprime=""; // aquí tendremos lo que pintaremos en el cuadro del panel
        
        // MOSTRAMOS el estado actual de aciertos/fallos del tablero
        // AQUÍ EMPIEZA EL BUCLE PRINCIPAL DEL PROGARMA

        // LAS COORDENADAS EMPEZARÁN EN 1

        boolean salida=false; // controlaremos la salida con una variable lógica 

        do{
            // pintamos una primera línea con los números de las coordenadas 'x'
            for (i=0;i<(ALTO_TABLERO/10)+1;i++){
                System.out.print(" ");
            }
            for (i=0;i<ANCHO_TABLERO;i++){
                System.out.print(" "+(i+1)+" ");
            }
            System.out.print("--x\n");

            
            for (i=0;i<ALTO_TABLERO;i++){
                // pintamos los valores de las coordenadas 'y'
                System.out.print(i+1);
                // vamos pintando línea por línea el estado de cada casilla
                for (j=0;j<ANCHO_TABLERO;j++){
                    if ( (!tableroAciertos[j][i][0])&&(!tableroAciertos[j][i][1])){
                        imprime=" # "; // si en ningun de los niveles hay 'true' son casillas no usadas aún
                    }
                    else if (tableroAciertos[j][i][0]){
                        imprime=" * "; // si el 'true' están en el primer nivel es que hubo un error (agua)
                    }
                    else{
                        imprime=" B "; // si no, habrá un 'true' en el segundo nivel y es que hubo acierto (B)
                    }
                    System.out.print(imprime); // mostramos el contenido de la casilla
                }
                System.out.print("\n"); // al acabar de imprimir cada línea hacemos el salto de línea
            }
            // por último mostramos la indicación del eje 'y'
            System.out.print("|\n");
            System.out.print("y\n");


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
                System.out.print("\n¡ACIERTO!\n");
                tableroAciertos[x-1][y-1][1]=true; // marcamos el acierto en el nivel segundo de tablero de estados
                
                // si con este acierto no quedan barcos por encontrar es que hemos ganado el juego
                if (barcosFaltan==0){
                    System.out.print("\n¡HAS CONSEGUIDO HUNDIR TODOS LOS BARCOS!");
                    salida=true; // con esto saldremos del bucle principal para terminar el programa
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
                    System.out.print("GAME OVER. Te mostramos la solución: \n");
                    
                    // Mostramos la solución marcando de forma diferente los fallos
                    // Usaremos la rutina que pintaba el tablero con pequeñas modificaciones
                    
                    // pintamos una primera línea con los números de las coordenadas 'x'
                    for (i=0;i<(ALTO_TABLERO/10)+1;i++){
                        System.out.print(" ");
                    }

                    for (i=0;i<ANCHO_TABLERO;i++){
                        System.out.print(" "+(i+1)+" ");
                    }
                    System.out.print("--x\n");

                    
                    for (i=0;i<ALTO_TABLERO;i++){
                        // pintamos los valores de las coordenadas 'y'
                        System.out.print(i+1);
                        // vamos pintando línea por línea el estado de cada casilla
                        for (j=0;j<ANCHO_TABLERO;j++){
                            // si no habíamos hecho nada y había barco, lo pintamos con "b"
                            if ( (!tableroAciertos[j][i][0]) && (!tableroAciertos[j][i][1]) && (tablero[j][i]) ){
                                imprime=" b ";
                            }
                            // si tampoco había barco pintamos ░
                            else if ( (!tableroAciertos[j][i][0]) && (!tableroAciertos[j][i][1]) && (!tablero[j][i]) ){
                                imprime=" # ";
                            }
                            // si habíamos fallado, pintamos █
                            else if (tableroAciertos[j][i][0]){
                                imprime=" * ";
                            }
                            // si no, quiere decir que habíamos acertado y pintamos la B
                            else {
                                imprime=" B ";
                            }
                            System.out.print(imprime); // mostramos el contenido de la casilla
                        } // fin del for j
                        System.out.print("\n"); // al acabar de imprimir cada línea hacemos el salto de línea
                    } // fin del for i

                    // por último mostramos la indicación del eje 'y'
                    System.out.print("|\n");
                    System.out.print("y\n");

                } // fin del if que comprueba los intentos
            
            } // fin del else de los fallos

        }while(!salida); // fin del do...while principal

        LeeTeclado.cierraSc();

    } // fin del main

    
} // fin de la clase principal