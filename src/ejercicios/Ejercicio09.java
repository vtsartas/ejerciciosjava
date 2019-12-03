package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 9 - Decir si un número entero es par, impar o cero
public class Ejercicio09 {

    public static void main(String[] args) {
        // Definimos la variable entera 'a'
        int a;
        // Pedimos por consola el valor de 'a'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        
        // Indicamos si el valor de 'a' es cero
        if (a==0){
            System.out.println("El valor de 'a' es cero, no es ni par ni impar");
        }
        // Si no, indicamos si es par o impar con el resto según el resto de su divisioón entre 2
        else if (a%2==0){
            System.out.println("El número "+a+" es PAR.");
        }
        else {
            System.out.println("El número "+a+" es IMPAR.");
        }
        entrada.close();
   }
}        