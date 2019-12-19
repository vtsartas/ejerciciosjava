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

    
}