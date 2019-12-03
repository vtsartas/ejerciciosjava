package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

/* Ejercicio 1 - operaciones básicas con dos variables */
public class Ejercicio01 {

    public static void main(String[] args) {
        // Definimos las variables enteras que vamos a usar
        int a,b,suma,resta,multi,divide;
        // Pedimos por consola el valor de 'a' y 'b'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        System.out.println("Introduce el valor de 'b': ");
        b=entrada.nextInt();
        suma=a+b;
        resta=a-b;
        multi=a*b;   
        System.out.println("La suma de "+a+" más "+b+" es igual a "+suma+".");
        System.out.println(a+" menos "+b+" es igual a "+resta+".");
        System.out.println("El producto de "+a+" por "+b+" es igual a "+multi+".");
        if (b==0){
            System.out.println("ERROR: el valor de 'b' es "+b+".");
        }
        else {
            divide=a/b;
            System.out.println("El resultado de dividir "+a+" entre "+b+" es "+divide+".");
        }
    }
    
}