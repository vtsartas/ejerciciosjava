package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 14 - Mostrar la suma de los primeros 'n' números pares

public class Ejercicio14 {

    public static void main(String[] args) {
        int n,contador,suma,num; // // Definimos las variables que vamos a utilizar
        // Pedimos por pantalla cuántos de los primeros números pares sumaremos
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce un número. Se calculará la suma de primeros n números pares: ");
        n=entrada.nextInt(); // Pedimos el valor de 'n' usando el objeto creado
        
	contador=0; // Inicialicamos el contador a 1. Será la variable que cuente cuántos pares hemos encontrado
	num=1; // inicializamos el valor donde estarán las cifras a comprobar si son par o impar
	suma=0; // inicializamos la suma a cero
               
        // mientras n sea menor o igual que el contador añadiremos el valor de contador a la suma siempre que sea par
        while (contador<n){
            // comprobamos si el número a comprobar es par
            if (num%2==0) {
                suma=suma+num; // al ser par sumamos el valor de 'num' a la suma
                contador=contador+1; // al haber obtenido un número par incrementamos su contador en 1
            }
            num=num+1; // añadimos 1 a 'num' para analizar si el siguiente número es par o impar
        }
        
        // Mostramos el resultado
        System.out.println("La suma de los primeros "+n+" números pares es "+suma+".");
        entrada.close();
   }
}   