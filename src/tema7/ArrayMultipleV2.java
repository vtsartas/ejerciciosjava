package tema7;

public class ArrayMultipleV2 {
    public static void main(String[] args) {

        final int NUM_ALUMNOS=3,NUM_ASIGNATURAS=5;

        int[][] listanotas=new int[NUM_ALUMNOS][NUM_ASIGNATURAS];

        LeeTeclado.iniSc();

        listanotas=UtilArrayMulti.leernotas(NUM_ALUMNOS,NUM_ASIGNATURAS);

        UtilArrayMulti.escribirnotas(listanotas);

        LeeTeclado.cierraSc();
    
    } // fin del main
    
} // fin de la clase principal