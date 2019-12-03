package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

/* Ejercicio 4 -  Decir cuál de los tres valores es el mayor */
public class Ejercicio04 {

    public static void main(String[] args) {
        // Definimos las variables enteras que vamos a usar
        int a,b,c;
        // Pedimos por consola el valor de 'a','b' y 'c'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        System.out.println("Introduce el valor de 'b': ");
        b=entrada.nextInt();
        System.out.println("Introduce el valor de 'c': ");
        c=entrada.nextInt();
        // Averiguamos si el valor de 'a' es mayor que el de 'b' y el de 'c' (sería la mayor)
        if (a>b && a>c){
            System.out.println("El valor de 'a'("+a+") es el mayor.");
        }
        // Si no, averiguamos si el valor de 'b' es mayor que el de 'a'
        else if (b>c){
            System.out.println("El valor de 'b'("+b+") es el mayor.");
        }
        else{
            System.out.println("El valor de 'c'("+c+") es el mayor.");
        }
        entrada.close();
    }
        
}