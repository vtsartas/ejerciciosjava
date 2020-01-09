/* 9. Programa que crea un array de 20 elementos
llamado Pares y  guarde los 20 primeros números pares.
Mostrar por pantalla el contenido del array creado. */

package ejercicios2;

public class Ejercicio9 {

    public static void ejercicio9(){

        int contadorpares=0;
        int num=0;
        int[] listapares=new int[20];
        int i;

        do {
            if (num%2==0){
                listapares[contadorpares]=num;
                contadorpares++;
            }
            num++;
        }while(contadorpares<20);

        for (i=0;i<20;i++){
            System.out.print(listapares[i]+" ");
        }
        System.out.print("\n");

    }
    
}