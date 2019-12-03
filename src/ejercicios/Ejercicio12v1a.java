package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 12v1a - Mostrar el cuadrado de los primeros n números naturales

public class Ejercicio12v1a {

    public static void main(String[] args) {
        int num,n; // Definimos la variable entera 'num'
        num=1; // Inicializamos 'num' con el primer número natural
        
        // Pedimos de cuántos de los primeros naturales mostrar el cuadrado ('n')
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Indica de cuántos de los primeros números naturales quieres calcular su cuadrado: ");
        n=entrada.nextInt(); // Pedimos el valor de 'n' usando el objeto creado
               
        // Mientras 'num' sea menor que n+1 calculamos su cuadrado
        while (num<(n+1)){
            System.out.println("El cuadrado de "+num+" es "+(num*num)+".");
            num=num+1; // añadimos una unidad y volvemos a comprobar
        }

   }
}