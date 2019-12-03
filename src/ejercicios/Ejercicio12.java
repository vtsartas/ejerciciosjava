package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 12 - Mostrar el cuadrado de los primeros 9 números naturales

public class Ejercicio12 {

    public static void main(String[] args) {
        int num; // Definimos la variable entera 'num'
        num=1; // Inicializamos 'num' con el primer número natural
               
        // Mientras 'num' sea menor que 10 calculamos su cuadrado
        while (num<10){
            System.out.println("El cuadrado de "+num+" es "+(num*num)+".");
            num=num+1; // añadimos una unidad y volvemos a comprobar
        }

   }
}        