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

    // método que usará 'MediaNotas()' para mostrarnos la media de un array con notas de alumnos
    public static void UsaMediaNotas(){
        int numalumnos; // número de alumnos de la clase
        String otraclase; // por si queremos calcular la media de otra clase
        do {
            // preguntamos cuántos alumnos hay
            System.out.println("¿Cuántos alumnos hay en clase?");
            numalumnos=readInt(); // leemos con el método propio readInt() la cantidad de alumnos
            int notas[]=new int[numalumnos]; // creamos un array de enteros que tendrá tantos valores como alumnos haya
            
            // vamos recorriendo rellenando el array con valores que leemos de consola mediante el método propio readInt()
            for(int i=0;i<numalumnos;i++){
                System.out.printf("Introduce la nota [0 a 10] del alumno número %d: ",(i+1));    
                notas[i]=readInt();
            }

            // Mostramos la media llamando al método Matematicas.Medianotas()
            System.out.printf("La media de las notas indicadas es %.2f.\n",Matematicas.MediaNotas(notas));
            
            // preguntamos si se quiere calcular la media de otra clase
            System.out.println("¿Quieres calcular la media de otra clase? (s/n)");
            otraclase=readStr(); // leemos un String en la consola con el método propio readStr();

        } while (otraclase.equals("s")); // si el valor leido en consola es "s" pediremos datos de otra clase

    } // fin del método 'UsaMediaNotas()'


    // método que usará 'NotaMax()' y 'NotaMin()' para mostrarnos la mayor y menor nota de un array
    public static void UsaMaxMinNotas(){
        int numalumnos; // número de alumnos de la clase.
        String otraclase; // por si queremos calcular la media de otra clase
        do {
            // preguntamos cuántos alumnos hay
            System.out.println("¿Cuántos alumnos hay en clase?");
            numalumnos=readInt(); // leemos con el método propio readInt() la cantidad de alumnos
            int notas[]=new int[numalumnos]; // creamos un array de enteros que tendrá tantos valores como alumnos haya
            
            // vamos recorriendo rellenando el array con valores que leemos de consola mediante el método propio readInt()
            for(int i=0;i<numalumnos;i++){
                System.out.printf("Introduce la nota [0 a 10] del alumno número %d: ",(i+1));    
                notas[i]=readInt();
            }

            // Mostramos la mayor y menor nota del array
            System.out.printf("La mayor nota entre las notas indicadas es %d y la menor %d.\n",Matematicas.NotaMax(notas),Matematicas.NotaMin(notas));
            
            System.out.println("¿Quieres encontrar la mayor y menor nota de otra clase? (s/n)");
            otraclase=readStr(); // leemos un String en la consola con el método propio readStr();

        } while (otraclase.equals("s")); // si el valor leido en consola es "s" pediremos datos de otra clase

    } // fin del método 'UsaMediaNotas()'

    public static void UsaBuscaNum(){
        int numnumeros; // cantidad de números en el array
        int valornum; // número a buscar
        String otralista,otroval; // por si queremos buscar un valor en otra lista
        do {
            // preguntamos de cuántos número queremos el listado
            System.out.println("¿De cuántos es el listado que quieres introducir?");
            numnumeros=readInt(); // leemos con el método propio readInt() la cantidad
            int listadonum[]=new int[numnumeros]; // creamos un array de enteros
            
            // vamos recorriendo rellenando el array con valores que leemos de consola mediante el método propio readInt()
            for(int i=0;i<numnumeros;i++){
                System.out.printf("Faltan %d valores. Introduce el siguente: ",(numnumeros-i));    
                listadonum[i]=readInt();
            }

            do{
                System.out.printf("¿Qué número deseas buscar en el listado? ");
                valornum=readInt();

                // Mostramos si está en el listado usando el método 'BuscaNum()'
                System.out.printf("El número indicado (%d) %s está entre los del listado\n",valornum,(Matematicas.BuscaNum(listadonum,valornum)?"sí":"no"));
            
                System.out.println("¿Quieres buscar otro número en esta lista? (s/n)");
                otroval=readStr();
            } while (otroval.equals("s")); // si el valor leido en consola es "s" pediremos otro número para buscarlo en la lista creada
            
            System.out.println("¿Quieres buscar otro número en otra lista? (s/n)");
            otralista=readStr(); // leemos un String en la consola con el método propio readStr();

        } while (otralista.equals("s")); // si el valor leido en consola es "s" pediremos datos de otra clase

    } // fin del método 'UsaMediaNotas()'

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
            System.out.println("6. Media aritmética de las notas indicadas");
            System.out.println("7. Notas máxima y mínima de un listado dado");
            System.out.println("8. Decir si un valor dado está entre los indicados");
            
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
                case 6:
                    UsaMediaNotas();
                    break;                    
                case 7:
                    UsaMaxMinNotas();
                    break;                 
                case 8:
                    UsaBuscaNum();
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