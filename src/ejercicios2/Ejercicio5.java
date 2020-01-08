/* 5. Programa que lea una variable entera mes y compruebe si el valor corresponde
a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días.
Se mostrará además el nombre del mes. Se debe comprobar que el valor
introducido esté comprendido entre 1 y 12. */

package ejercicios2;

public class Ejercicio5 {

    public static void ejercicio5(){
   
        String otro5="";
        int mesnum;
        boolean mesok;

        do{
            mesok=false;
            System.out.print("Introduce el número del mes a comprobar (1 a 12): ");
            do{
                mesnum=LeeTeclado.readInt();
                if (mesnum>0&&mesnum<13){
                    mesok=true;
                }
                else{
                    System.out.print("ERROR: el número del mes no es válido. Introduce otro (1 a 12): ");
                }
            }while(!mesok);

            System.out.printf("El mes de %s tiene %d días.\n",mestexto(mesnum),diasmes(mesnum));

            System.out.print("¿Quieres comprobar otro mes?(s/n) ");
            otro5=LeeTeclado.readStr();
        } while (otro5.equals("s"));
    } // fin del método ejercicio5()

    // método para decir cuántos días tiene el mes recibido de forma numérica
    public static int diasmes(int mes){
        int [] diasxmes={31,28,31,30,31,30,31,31,30,31,30,31};
        return diasxmes[mes-1];
    } // fin del método diasmes()

    // método para devolver en texto el nombre del mes recibido de forma numérica
    public static String mestexto(int mestx){
        String [] mesesentexto={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        return mesesentexto[mestx-1];
    } // fin del método mestexto()

} // fin de la clase principal Ejercicio5{}