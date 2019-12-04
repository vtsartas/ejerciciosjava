package tema2;

// Vemos el efecto de usar los operadores "++"" y "--" antes o después de la variable.
// Si va antes, ejecuta primero la operación. Pero si va después, usa primero la variable y luego opera.

public class OperadorIncremento{
    public static void main(String[] args) {
        int n=1;
        
        System.out.println("Sumando con ++n. Valor inicial de n: "+n);
        while (n<10){
            System.out.printf("%d ",++n);
        }
        // Vemos que primero ha incrementado n en 1 y por eso el primer valor que imprime es "2"
        
        System.out.println("\nSumando con n++. Valor inicial de n: "+n);
        while (n<20){
            System.out.printf("%d ",n++);
        }
        // Aquí imprime primero el último valor que ha generado usar ++n (en este caso "10")
        // Pero no imprime el último porque la operación la ejecuta después de imprimir "19"
        
        System.out.println("\nRestando con --n. Valor inicial de n: "+n);
        while (n>10){
            System.out.printf("%d ",--n);
        }
        // Como primero hace la operación "20-1" el primer valor que imprime es "19"
        
        System.out.println("\nRestando con n--. Valor inicial de n: "+n);
        while (n>0){
            System.out.printf("%d ",n--);
        }
        // El primer valor que imprime es 10, el último que dejó el bucle anterior.
        
        System.out.println("\nEl valor final de 'n' es "+n+".");
        // El valor final de 'n' es "0" aunque el bucle no lo imprima
    }
}