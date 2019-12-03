package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 11 - Indicar si un número es par o impar. Si es cero volver a pedir otro número hasta que no lo sea

public class Ejercicio11 {

    public static void main(String[] args) {
        // Definimos la variable entera 'num'
        int num;
        // Pedimos una primera vez el valor de 'num'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce un valor: ");
        num=entrada.nextInt(); // Pedimos el valor de 'num' usando el objeto creado
        
        // Mientras nos den cero volvemos a pedir otro valor
        while (num==0){
            System.out.println("Has introducido cero. Indica otro valor para saber si es ni par ni impar");
            num=entrada.nextInt();
        }
        
        // Cuando el valor no sea cero, indicamos si es par o impar con el resto según el resto de su división entre 2
        if (num%2==0){
            System.out.println("El número "+num+" es PAR.");
        }
        else {
            System.out.println("El número "+num+" es IMPAR.");
        }
        entrada.close();
   }
}        