package ejercicios2;

import java.util.Scanner;

public class LeeTeclado{

    // para poder abrir solo un Scanner y usarlo en toda la clase definimos un objeto de la clase de forma global
    // Es necesario abrir una vez el Scanner, lo haremos en la clase main() ** [sc = new Scanner(System.in);]
    // Del mismo modo, solo cerraremos una vez el Scanner, también en el método 'main()' [sc.close();]
    private static Scanner sc;

    // LeeTeclado.iniSc(); // ** es necesario abrir una vez el Scanner, lo haremos en la clase main()
    // LeeTeclado.cierraSc(); // cerramos solo una vez el Scanner, lo hacemos en 'main()'

    // método para cerrar el Scanner (importante porque 'sc' es 'private')
    public static void cierraSc() {
        sc.close();
    }

    // método para abrir el Scanner (importante porque 'sc' es 'private')
    public static void iniSc() {
        LeeTeclado.sc = new Scanner(System.in);
    }

    // luego creamos métodos que usan el objeto creado para leer la consola y devolver el valor
    // será necesario uno por cada tipo de datos que vayamos a necesaitar. P.ej, este es para leer enteros
    public static int readInt() {
        return sc.nextInt();
    }

    // Este es para leer String
    public static String readStr() {
        return sc.next();
    }


} // final de la clase LeeTeclado