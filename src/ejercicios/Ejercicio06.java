package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 6 - Si 'a' es negativo o cero mostrar un error, si no mostrar su cuadrado y su raiz
public class Ejercicio06 {

    public static void main(String[] args) {
        // Definimos la variables entera 'a' y las reales 'cuadrado' y 'raiz' (necesario para la usar Math.
        int a;
        double cuadrado,raiz;
        // Pedimos por consola el valor de 'a'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        // Si el valor de 'a' es negativo o cero mostramos un error
        if ((a<0) || (a==0)){
            System.out.println("ERROR: el valor de 'a' es cero o negativo.");
        }
        // Si no, mostramos su cuadrado y su raiz cuadrada
        else{
            cuadrado=Math.pow(a,2) ;
            raiz=Math.sqrt(a);
            System.out.println("El cuadrado de "+a+" es "+cuadrado+" y su raiz cuadrada "+raiz+".");
        }
        entrada.close();
    }        
}