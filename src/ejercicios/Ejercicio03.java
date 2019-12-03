package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

/* Ejercicio 3 - Indicar cuál de los dos valores es mayor o si son iguales*/
public class Ejercicio03 {

    public static void main(String[] args) {
        // Definimos las variables enteras que vamos a usar
        int a,b;
        // Pedimos por consola el valor de 'a' y 'b'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        System.out.println("Introduce el valor de 'a': ");
        a=entrada.nextInt(); // Pedimos el valor de 'a' usando el objeto creado
        System.out.println("Introduce el valor de 'b': ");
        b=entrada.nextInt();
        // Averiguamos si el valor de 'a' es mayor que el de 'b' o no
        if (a>b){
            System.out.println("El valor de 'a'("+a+") es mayor que el de 'b'("+b+").");
        }
        // Si no, averiguamos si el valor de 'b' es mayor que el de 'a'
        else if (b>a){
            System.out.println("El valor de 'b'("+b+") es mayor que el de 'a'("+a+").");
        }
        else{
            System.out.println("El valor de 'a'("+a+") es IGUAL al de 'b'("+b+").");
        }
        entrada.close();
    }
        
}