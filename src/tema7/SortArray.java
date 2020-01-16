package tema7;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] unsorted={4,8,3,0,6,7,24,2356,65,76,23,65,76,8,544,24};
        // .clone copia el objeto
        int[] sorted=unsorted.clone();

        // mostramos el listado original desordenado
        for (int num : unsorted){
            System.out.print(unsorted[num]);
        }
        // ordenamos el clon
        Arrays.sort(sorted);

        // mostramos el listado original desordenado
        for (int num : sorted){
            System.out.print(sorted[num]);
        }
    
    } // final del main

} // final de la clase principal