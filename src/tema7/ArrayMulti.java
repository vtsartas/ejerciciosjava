package tema7;

public class ArrayMulti {
    public static void main(String[] args) {
        // final int FILAS=2,COLUMNAS=3;
        int i,j;
        // int contador=0;
        // int[][] notas=new int [FILAS][COLUMNAS];
        int[][] notas={{5,7,9},{4,6,8}};

        System.out.print("filas: "+notas.length+"\n");
        System.out.print("columnas: "+notas[1].length+"\n");

        for (i=0;i<notas.length;i++){

            for(j=0;j<notas[1].length;j++){
                // notas[i][j]=contador;
                System.out.print(notas[i][j]+" ");
            } // fin del for j

            System.out.print("\n");

        } // fin del for i

    } // fin del main()
    
} // fin de la clase principal