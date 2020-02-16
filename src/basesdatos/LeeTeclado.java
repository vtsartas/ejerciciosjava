package basesdatos;

import java.util.Scanner;


public class LeeTeclado{

    // para poder abrir solo un Scanner y usarlo en toda la clase definimos un objeto de la clase de forma global
    // Es necesario abrir una vez el Scanner, lo haremos en la clase main() ** [sc = new Scanner(System.in);]
    // Del mismo modo, solo cerraremos una vez el Scanner, también en el método 'main()' [sc.close();]
    private static Scanner sc;

    // método para abrir el Scanner (importante porque 'sc' es 'private') (uso: LeeTeclado.iniSc();)
    public static void iniSc() {
        LeeTeclado.sc = new Scanner(System.in,"UTF-8");
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

    } // fin de readInt()

    // Este es para leer String
    public static String readStr() {
        return sc.next();
    } // fin de readStr

    // sobrecarga para poder devolver texto en mayúsculas o minúsculas
    public static String readStr(boolean upperlower) {
        return (upperlower?sc.next().toUpperCase():sc.next().toLowerCase());
    } // fin de readStr(boolean)

    // Para leer un solo carácter
    public static char readChar() {
        return (char)sc.next().charAt(0);
    } // fin de readChar()

    // Sobrecarga para tener la opción de transformar a mayúsculas o minúsculas 
    public static char readChar(boolean upperlower) {
        // si upperlower es true devuelve siempre en mayúsculas, si es false en minúsculas
        return (upperlower?( (char)sc.next().toUpperCase().charAt(0)):((char)sc.next().toLowerCase().charAt(0)) );
    } // fin de readChar(boolean)

} // final de la clase LeeTeclado