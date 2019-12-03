package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 5 - Si 'a' es negativo hacer el producto de a*b*c, si no hacer la suma
public class Ejercicio05 {

    public static void main(String[] args) {
        // Definimos las variables enteras que vamos a usar
        int a,b,c,suma,producto;
        // Pedimos por consola el valor de 'a','b' y 'c'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        System.out.println("Introduce el valor de 'b': ");
        b=entrada.nextInt();
        System.out.println("Introduce el valor de 'c': ");
        c=entrada.nextInt();
        // Si el valor de 'a' es negativo mostramos la suma de las tres variables
        if (a<0){
            producto=a*b*c;
            System.out.println("El producto de "+a+"x"+b+"x"+c+" es "+producto+".");
        }
        // Si no, mostramos su producto
        else{
            suma=a+b+c;
            System.out.println("La suma de "+a+"+"+b+"+"+c+" es "+suma+".");
        }
    }
        
}