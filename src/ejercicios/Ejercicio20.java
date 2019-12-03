package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 20 (V-5) - Decir si un alumno está o no aprobado según unas condiciones dadas

public class Ejercicio20 {

    public static void main(String[] args) {
        
        float nota; // Definimos la variable a utilizar, será real para poder poner decimales

        // Pedimos por pantalla la nota del alumno
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce la nota del alumno (usa la coma para los decimales): ");
        nota=entrada.nextFloat();

        // Si la nota es inferior a 12.50 está desaprobado
        if (nota<12.50){
            System.out.println("El alumno está desaprobado.");
        }
        else if (nota<20){
            System.out.println("El alumno está aprobado.");
        }
        else {
            System.out.println("Error, la nota es superior a 20");
        }
        
   }
}