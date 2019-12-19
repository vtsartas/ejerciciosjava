package tema6;

import java.util.Scanner;

public class usaMatematicas {
    
    // para poder abrir solo un Scanner y usarlo en toda la clase definimos un objeto de la clase de forma global
    // Es necesario abrir una vez el Scanner, lo haremos en la clase main() ** [sc = new Scanner(System.in);]
    // Del mismo modo, solo cerraremos una vez el Scanner, también en el método 'main()' [sc.close();]
    private static Scanner sc;

    // luego creamos métodos que usan el objeto creado para leer la consola y devolver el valor
    // será necesario uno por cada tipo de datos que vayamos a necesaitar. P.ej, este es para leer enteros
    public static int readInt() {
        return sc.nextInt();
    }

    // Este es para leer String
    public static String readStr() {
        return sc.next();
    }

    // método para usar el método 'Factorial()' definido en la clase 'Matematicas'
    public static void UsaFactorial(){

        String otrofact;
        int numero;
        // vamos a mostrar si el factorial calculado excede las limitaciones del tipo 'double' o no
        // así no mostraremos directamente "Infinity" sino una explicación para el usuario
        // almacenamos en 'infinito' el valor "Infinity" que retorna Java si se supera el double máximo
        double infinito=Double.POSITIVE_INFINITY; 
        do {
 
            // pedimos de qué número queremos obtener el factorial
            System.out.println("¿De qué número quieres calcular el factorial?");
            numero=readInt(); // usamos el método 'readInt()' para leer enteros del Scanner
    
            // condiciónal por si el factorial del número indicado supera el valor double máximo ('infinito')
            if (Matematicas.Factorial(numero)==infinito){
                System.out.println("ERROR: El factorial de "+numero+" supera el valor máximo 'double permitido por Java.");
            }
            else {
                System.out.println("El factorial de "+numero+" es "+Matematicas.Factorial(numero)+".");
            }

            System.out.println("¿Quieres calcular otro factorial?");
            otrofact=readStr(); // usamos el método 'readStr())' para leer String del Scanner
    
        } while (otrofact.equals("s"));
    }

    // método que usará 'MostrarFactoriales' para mostrar los factoriales de todos los números hasta el indicado
    public static void UsaMostrarFactoriales(){

        System.out.println("¿De qué número quieres calcular el factorial?");
        int numero=readInt(); // usamos el método 'readInt()' para leer enteros del Scanner
               
        Matematicas.MostrarFactoriales(numero);

    }

    // método que usará 'MaxFactorialInt()' para mostrarnos el máximo entero del que podemos calcular el factorial
    public static void UsaMaxFactorialInt(){
        System.out.println("El mayor entero ('int') del que podemos calcular es "+Matematicas.MaxFactorialInt()+".");
    }

    // método que usará 'MaxFactorialFloat()' para mostrarnos el máximo 'float' del que podemos calcular el factorial
    public static void UsaMaxFactorialFloat(){
        System.out.printf("El mayor real ('float') del que podemos calcular es %.0f.\n",Matematicas.MaxFactorialFloat());
    }

    // método que usará 'MaxFactorialDouble()' para mostrarnos el máximo 'double' del que podemos calcular el factorial
    public static void UsaMaxFactorialDouble(){
        System.out.printf("El mayor real ('double') del que podemos calcular es %.0f.\n",Matematicas.MaxFactorialDouble());
    }

    public static void main(String[] args) {
        
        sc = new Scanner(System.in); // ** es necesario abrir una vez el Scanner, lo haremos en la clase main()
        int operacion;
        String otro;

        do {
            // montamos un menú para poder elegir qué operación queremos realizar
            System.out.println("¿Qué operación matemática quieres realizar?");
            System.out.println("1. Factorial de un número");
            System.out.println("2. Mostrar factoriales hasta un número indicado");
            System.out.println("3. Máximo factorial con 'int'");
            System.out.println("4. Máximo factorial con 'float'");
            System.out.println("5. Máximo factorial con 'double'");
            
            operacion=readInt(); // usamos el método 'readInt()' para leer enteros del Scanner
            
            // según el valor que indiquemos por teclado llamará a uno u otro método
            switch (operacion){
                case 1:
                    UsaFactorial();
                    break;
                case 2:
                    UsaMostrarFactoriales();
                    break;
                case 3:
                    UsaMaxFactorialInt();
                    break;
                case 4:
                    UsaMaxFactorialFloat();
                    break;
                case 5:
                    UsaMaxFactorialDouble();
                    break;                    
                default:
                    System.out.println("ERROR: El número introducido no corresponde a ninguna operación disponible");
                    break;        
            }

            // preguntamos si queremos realizar otra operación
            System.out.println("¿Quieres realizar otra operación?");
            otro=readStr(); // usamos el método 'readStr())' para leer String del Scanner

        } while (otro.equals("s"));

        sc.close(); // cerramos solo una vez el Scanner, lo hacemos en 'main()'
        
    }
}