package tema7;

import java.util.Scanner;


public class LeeTeclado{

    // para poder abrir solo un Scanner y usarlo en toda la clase definimos un objeto de la clase de forma global
    // Es necesario abrir una vez el Scanner, lo haremos en la clase main() ** [sc = new Scanner(System.in);]
    // Del mismo modo, solo cerraremos una vez el Scanner, también en el método 'main()' [sc.close();]
    private static Scanner sc;

    // método para abrir el Scanner (importante porque 'sc' es 'private') (uso: LeeTeclado.iniSc();)
    public static void iniSc() {
        LeeTeclado.sc = new Scanner(System.in);
    }

    // método para cerrar el Scanner (importante porque 'sc' es 'private'). (uso: LeeTeclado.cierraSc();)
    public static void cierraSc() {
        sc.close();
    }

    // luego creamos métodos que usan el objeto creado para leer la consola y devolver el valor
    // será necesario uno por cada tipo de datos que vayamos a necesaitar. P.ej, este es para leer enteros
    public static int readInt() {
        
        int valor=0;
        boolean lecturaOK=false;
        do{
            try{
                valor=Integer.parseInt(readStr().trim());
                lecturaOK=true;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Error. Introduce un valor entero: ");
            }
        }while(!lecturaOK);

        return valor;

    }

    // Este es para leer String
    public static String readStr() {
        return sc.next();
    }


} // final de la clase LeeTeclado