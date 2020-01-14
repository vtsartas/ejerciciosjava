package tema7;

public class UtilArrayMulti {

    public static int[][] leernotas(int numalum,int numasig){
        int[][] retorno=new int[numalum][numasig];
        int i,j;

        for(i=0;i<numalum;i++){
            System.out.print("Alumno nº "+(i+1)+"\n");
            for(j=0;j<numasig;j++){
                System.out.print("Introduce la nota de la asignatura nº "+(j+1)+": ");
                retorno[i][j]=LeeTeclado.readInt();
            } //fin for 'j'
            System.out.print("\n");
        } // fin for 'i'
        return retorno;

    }

    public static void escribirnotas(int[][] notas){

        int i,j;

        for(i=0;i<notas.length;i++){
            System.out.print("Alumno nº "+(i+1)+"\n");
            for(j=0;j<notas[0].length;j++){
                System.out.print("Nota de la asignatura nº "+(j+1)+": "+notas[i][j]+".\n");
            } //fin for 'j'
            System.out.print("\n");
        } // fin for 'i'

    }

    
}