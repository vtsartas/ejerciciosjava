package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 13 - Mostrar la suma de los primeros 'n' números naturales

public class Ejercicio13 {

    public static void main(String[] args) {
        int n,contador,suma; // // Definimos las variables que vamos a utilizar
        // pedimos 'n' por pantalla
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce un número. Se calculará la suma de los números naturales hasta esa cifra: ");
        n=entrada.nextInt(); // Pedimos el valor de 'n' usando el objeto creado
        
        contador=1; // inicialicamos el contador con el primer número natural
        suma=0; // inicializamos la suma a cero
               
        // Mientras el contador sea menor o igual al número dado se añadira el contador a la suma
        while (contador<=n){
            System.out.println("El nuevo valor de la suma ("+suma+") al añadir "+contador+" es "+(suma+contador)+".");
            suma=suma+contador; // sumamos el valor del contador
            contador=contador+1; // añadimos 1 al contador para tener el valor del siguiente número natural
        }
        
        // Mostramos el resultado
        System.out.println("La suma de los primeros "+n+" números naturales es "+suma+".");
   }
}       

