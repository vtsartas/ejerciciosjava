package tema7;

/**
 * BucleAnidado
 */
public class BucleAnidado {

    public static void main(String[] args) {
        final int FILAS=4,COLUMNAS=4;
        int i,j;
        int contador=0;
        int [][] numeros=new int [FILAS][COLUMNAS];


        for (i=0;i<FILAS;i++){
            for (j=0;j<COLUMNAS;j++){
                numeros[i][j]=contador;
                contador++;
            }
        }

        for (i=0;i<FILAS;i++){
            System.out.print("Fila "+i+": ");
            for (j=0;j<COLUMNAS;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}