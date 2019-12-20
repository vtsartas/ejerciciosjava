package tema6;

// definimos una clase general de funciones matemáticas
public class Matematicas {
    
    // método para obtener el factorial de un número
    public static double Factorial(int num){
        // "El factorial de un entero positivo n, el factorial de n o n factorial se define
        // en principio como el producto de todos los números enteros positivos desde 1
        // (es decir, los números naturales) hasta n."
        if (num==0){
            return 1;
        }
        else
        {
            double fact=1; // primer número entero positivo
            for (int i=1;i<=num;i++){
                fact=fact*i; // se va multiplicando el producto ya obtenido por el siguiente valor entero con 'i'
            }
            return fact;
        }
    }

        // método para mostrar los factoriales hasta un número
        public static double MostrarFactoriales(int num){
            if (num==0){
                return 1;
            }
            else
            {
                double fact=1; // primer número entero positivo
                for (int i=1;i<=num;i++){
                    fact=fact*i; // se va multiplicando el producto ya obtenido por el siguiente valor entero con 'i'
                    System.out.println("El factorial de "+i+" es "+fact+".");
                }
                return fact;
            }
        }

    public static int MaxFactorialInt(){
        // "El factorial de un entero positivo n, el factorial de n o n factorial se define
        // en principio como el producto de todos los números enteros positivos desde 1
        // (es decir, los números naturales) hasta n."
        int fact=1,i=1,maxfact=1; // primer número entero positivo
        do {
            maxfact=i; // almaceno el mayor valor que no haya dado el fallo de valor negativo
            i++;
            fact=fact*i; // se va multiplicando el producto ya obtenido por el siguiente valor entero con 'i'
            /* System.out.print(fact+":"+i);*/ // Por si queremos ver los valores que va dando
        }while (fact>0); // cuando se supera el valor máximo del entero positivo nos da valores negativos
        return maxfact;
    }

    public static float MaxFactorialFloat(){

        // Cuando se supera el valor máximo permitido para el tipo 'float' devuelve "Infinity"
        // Si queremos asignar ese valor a una variable usamos las propiedades del método Float.

        float fact=1f,i=0f,maxfact=i,infinito=Float.POSITIVE_INFINITY;
        while (fact!=infinito){
            maxfact=i; // almaceno el mayor valor que no haya dado el fallo "Infinity"
            i++;
            fact=fact*i;
            /* System.out.print(fact+" "); */ // Por si queremos ver los valores que va dando
        }
        return maxfact;
    }

    public static double MaxFactorialDouble(){

        // Cuando se supera el valor máximo permitido para el tipo 'double' devuelve "Infinity"
        // Si queremos asignar ese valor a una variable usamos las propiedades del método Double.
        double fact=1.0,i=1.0,maxfact,infinito=Double.POSITIVE_INFINITY;

        do {
            maxfact=i; // almaceno el mayor valor que no haya dado el fallo "Infinity"
            i++;
            fact=fact*i;
            /* System.out.print(fact+" "); */ // Por si queremos ver los valores que va dando
        } while (fact!=infinito);
        return maxfact;
    }

    // método para calcular la media de los valores de un array de enteros
    public static double MediaNotas(int [] notasc){
        double sumanotas=0; // acumulador del valor total de las notas, inicializado a 0
        
        // recorremos el array y vamos acumulando los valores de cada nota
        for (int i=0;i<notasc.length;i++){
            sumanotas+=notasc[i];
            // System.out.printf("Nota del alumno %d es %d. La suma actual es %d\n",(i+1),notasc[i],sumanotas);
        }
        return sumanotas/notasc.length; // devolvemos el valor 'double' con la media (la suma de las notas entre el total de estas)

    }

    // método para averiguar el valor máximo en un array de enteros
    public static int NotaMax(int [] notasmx){
        int max=0; // almacena el mayor valor
        
        // recorremos el array y vamos almacenando el valor en máx si es mayor que el que ya tenía
        for (int i=0;i<notasmx.length;i++){
            if (notasmx[i]==10){
                max=notasmx[i];
                break;
            }
            max=(notasmx[i]>max)?notasmx[i]:max;
        }
        return max; // devolvemos el mayor valor encontrado.

    }

    // método para averiguar el valor mínimo en un array de enteros
        public static int NotaMin(int [] notasmin){
            int min=notasmin[0]; // almacena el menor valor, lo inicializamos con el primer valor del array
            
            // recorremos el array y vamos almacenando el valor en min si es menor que el que ya tenía
            
            for (int i=1;i<notasmin.length;i++){
                if (notasmin[i]==0){
                    min=notasmin[i];
                    break;
                }
                min=(notasmin[i]<min)?notasmin[i]:min;
            }
            return min; // devolvemos el menor valor encontrado
    
        }

    
}