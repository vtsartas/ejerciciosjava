package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

/* Ejercicio 2 - Intercambiar el valor de dos variables dadas */
public class Ejercicio02 {

    public static void main(String[] args) {
        // Definimos las variables enteras que vamos a usar, siendo 'c' será una auxiliar
        int a,b,c;
        // Pedimos por consola el valor de 'a' y 'b'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        System.out.println("Introduce el valor de 'b': ");
        b=entrada.nextInt();
        System.out.println("El valor ORIGINAL de 'a' es "+a+" y el de 'b' es "+b+".");
        // Intercambiamos los valores apoyándonos en la variable auxiliar para que no se pierdan
        c=a;
        a=b;
        b=c;
        System.out.println("El valor FINAL de 'a' es "+a+" y el de 'b' es "+b+".");
        }
    } 