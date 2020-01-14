package tema7;

import java.util.Random; // Clase necesaria para obtener números aleatorios

public class HundirFlota {
    public static void main(String[] args) {

        // Establecemos el TAMAÑO del tablero y CUÁNTOS BARCOS habrá

        LeeTeclado.iniSc();

        System.out.print("Introduce el ancho del tablero: ");
        final int ANCHO_TABLERO=LeeTeclado.readInt();

        System.out.print("Introduce el alto del tablero: ");
        final int ALTO_TABLERO=LeeTeclado.readInt();

        int numbarcos,contador=0,x,y,i,j;

        System.out.print("Introduce el número de barcos (máximo "+((ALTO_TABLERO*ANCHO_TABLERO)/2)+"): ");
        do {
            numbarcos=LeeTeclado.readInt();
            if (numbarcos>(ALTO_TABLERO*ANCHO_TABLERO)/2){
                System.out.print("ERROR: demasiados barcos.\nIntroduce el número de barcos: (máximo "+((ALTO_TABLERO*ANCHO_TABLERO)/2)+"): ");
            }

        }while(numbarcos>(ALTO_TABLERO*ANCHO_TABLERO)/2);
        final int NUM_BARCOS=numbarcos;

        boolean[][] tablero=new boolean[ANCHO_TABLERO][ALTO_TABLERO];
        boolean[][][] tableroAciertos=new boolean[ANCHO_TABLERO][ALTO_TABLERO][2];
        int intentos=(ALTO_TABLERO*ANCHO_TABLERO)-(ALTO_TABLERO*ANCHO_TABLERO/3);


        // RELLENAMOS de forma aleatoria el tablero

        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"

        do {
            x=aleatorio.nextInt(ANCHO_TABLERO);
            y=aleatorio.nextInt(ALTO_TABLERO);

            if (!(tablero[x][y])){
                tablero[x][y]=true;
                contador++;
            }
        }while(contador<NUM_BARCOS);

        // EMPEZAMOS el juego

        System.out.print("Comienza el juego. Tienes "+intentos+" intentos.\n");

        int barcosFaltan=NUM_BARCOS;
        char imprime;
        boolean coordOK=false;
        
        // MOSTRAMOS el estado de aciertos/fallos del tablero

        do{
            System.out.print(" ");
            for (j=0;j<ANCHO_TABLERO;j++){
                System.out.print(" "+j+" ");
            }
            System.out.print(" x\n");
            for (i=0;i<ALTO_TABLERO;i++){
                System.out.print(i);
                for (j=0;j<ANCHO_TABLERO;j++){
                    if ( (!tableroAciertos[j][i][0])&&(!tableroAciertos[j][i][1])){
                        imprime='░';
                    }
                    else if (tableroAciertos[j][i][0]){
                        imprime='█';
                    }
                    else{
                        imprime='B';
                    }
                    System.out.print(" "+imprime+" ");
                }
                System.out.print("\n");
            }
            System.out.print("y\n");

            // PEDIMOS LAS COORDENADAS, asegurándonos de que no son repetidas ni se salen de los límites del tablero

            do{
                System.out.print("\nTe quedan "+intentos+" intentos y "+barcosFaltan+" barcos por encontrar.\n");

                System.out.print("\nIntroduce la coordenada 'x': ");
                do{
                    x=LeeTeclado.readInt();
                    if (x>=ANCHO_TABLERO){
                        System.out.print("ERROR: la coordenada 'x' no es correcta.\nIntroduce una menor a "+ANCHO_TABLERO+": ");
                    }
                }while(x>=ANCHO_TABLERO);

                System.out.print("Introduce la coordenada 'y': ");
                do{
                    y=LeeTeclado.readInt();
                    if (y>=ALTO_TABLERO){
                        System.out.print("ERROR: la coordenada 'y' no es correcta.\nIntroduce una menor a "+ALTO_TABLERO+": ");
                    }
                }while(y>=ALTO_TABLERO);

                if (tableroAciertos[x][y][0]||tableroAciertos[x][y][1]){
                    System.out.print("ERROR: has repetido una coordenada\n");
                    coordOK=false;
                }
                else{
                    coordOK=true;
                }
            }while(!coordOK);

            // COMPROBAMOS si es acierto o fallo, y los intentos que quedan

            intentos--;
            if (tablero[x][y]){
                barcosFaltan--;
                System.out.print("\n¡ACIERTO!\n");
                tableroAciertos[x][y][1]=true;
                if (barcosFaltan==0){
                    System.out.print("\n¡HAS CONSEGUIDO HUNDIR TODOS LOS BARCOS!");
                    break;
                }
            }
            else{
                System.out.print("\n¡AGUA!\n");
                tableroAciertos[x][y][0]=true;
            }

            if (intentos==0||(intentos<barcosFaltan)){
                System.out.print("GAME OVER. Te mostramos la solución: \n");
                // solución
                System.out.print(" ");
                for (j=0;j<ANCHO_TABLERO;j++){
                    System.out.print(" "+j+" ");
                }
                System.out.print("\n");
                for (i=0;i<ALTO_TABLERO;i++){
                    System.out.print(i);
                    for (j=0;j<ANCHO_TABLERO;j++){
                        if ((!tableroAciertos[j][i][0])&&(!tableroAciertos[j][i][1])){
                            imprime='░';
                        }
                        else if (tableroAciertos[j][i][0]){
                            imprime='E';
                        }
                        else{
                            imprime='B';
                        }
                        System.out.print(" "+imprime+" ");
                    }
                    System.out.print("\n");
                }
            }

        }while(intentos>0); // fin del do...while de la entrada de posiciones


        LeeTeclado.cierraSc();
    } // fin del main

    
} // fin de la clase principal