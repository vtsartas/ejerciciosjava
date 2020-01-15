package tema7;

import java.util.Random;

public class HundirFlotaUtils {

    public static boolean [][] rellenaTablero(int anch, int alt, int nbarcos){
        // DEFINIMOS Y RELLENAMOS de forma aleatoria el tablero

        boolean[][] tabl=new boolean[anch][alt];
      
        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
        
        int contador=0;
        int x,y;

        do {
            
            // generamos coordenadas aleatorias x,y para ubicar los barcos
            x=aleatorio.nextInt(anch);
            y=aleatorio.nextInt(alt);

            // nos aseguramos de que en esa posición no haya ya un barco para evitar
            // duplicados (habría menos barcos en el tablero de los indicados) 
            if (!(tabl[x][y])){
                tabl[x][y]=true;
                contador++;
            }

        }while(contador<nbarcos);

        return tabl;
    } // fin de rellenaTablero()

    public static void pintaTablero(boolean [][][] tableroA){
        
        int anchot=tableroA[0].length;
        int altot=tableroA[1].length;

        int i,j;

        String imprime;

        System.out.print("\n");

        // pintamos una primera línea con los números de las coordenadas 'x'
        for (i=0;i<(altot/10)+1;i++){
            System.out.print(" ");
        }
        for (i=0;i<anchot;i++){
            System.out.print(" "+(i+1)+" ");
        }
        System.out.print("--x\n");

        
        for (i=0;i<altot;i++){
            // pintamos los valores de las coordenadas 'y'
            System.out.print(i+1);
            // vamos pintando línea por línea el estado de cada casilla
            for (j=0;j<anchot;j++){
                if ( (!tableroA[j][i][0])&&(!tableroA[j][i][1])){
                    imprime=" # "; // si en ningun de los niveles hay 'true' son casillas no usadas aún
                }
                else if (tableroA[j][i][0]){
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

    } // fin pintaTablero()


    public static void solucion(boolean [][] tableroSol,boolean [][][] tableroAct){

        // Usaremos la rutina que pintado con pequeñas modificaciones
        int ancho=tableroSol[0].length;
        int alto=tableroSol[1].length;

        int i,j;

        String imprime="";
        
        System.out.print("\n");
        // pintamos una primera línea con los números de las coordenadas 'x'
        for (i=0;i<(alto/10)+1;i++){
            System.out.print(" ");
        }

        for (i=0;i<ancho;i++){
            System.out.print(" "+(i+1)+" ");
        }
        System.out.print("--x\n");

                
        for (i=0;i<alto;i++){
            // pintamos los valores de las coordenadas 'y'
            System.out.print(i+1);
            // vamos pintando línea por línea el estado de cada casilla
            for (j=0;j<ancho;j++){
                // si no habíamos hecho nada y había barco, lo pintamos con "b"
                if ( (!tableroAct[j][i][0]) && (!tableroAct[j][i][1]) && (tableroSol[j][i]) ){
                    imprime=" b ";
                }
                // si tampoco había barco pintamos ░
                else if ( (!tableroAct[j][i][0]) && (!tableroAct[j][i][1]) && (!tableroSol[j][i]) ){
                    imprime=" # ";
                }
                // si habíamos fallado, pintamos █
                else if (tableroAct[j][i][0]){
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

    } // fin solucion()
    
}