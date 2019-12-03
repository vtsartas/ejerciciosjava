package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 28 - Hoja VI (5) - Indicar la nota ponderada según el criterio dado (parte teórica 60%, práctica 40%) de cada uno de un número determinado de alumnos

public class Ejercicio28 {

    public static void main(String[] args) {
        
    // Definimos la variable a utilizar
	int numalumnos,contador;
	float teorica,practica,nota;

	// Leemos por 1a vez un número sin entrar al bucle. Necesario por si es 0 y para inicializar 'minimo' (de inicio no puede ser 0)
	System.out.println("Introduce el número total de alumnos: ");
        Scanner valor=new Scanner(System.in);
        numalumnos=valor.nextInt();
        
        contador=1;
        
        // Mientras digamos que sí seguirá comprobando años
        while (contador<=numalumnos) {
            System.out.println("Introduce la nota de la parte teórica del alumno número "+contador+" (de "+numalumnos+").");
            teorica=valor.nextInt();
            System.out.println("Introduce la nota de la parte práctica del alumno número "+contador+" (de "+numalumnos+").");
            practica=valor.nextInt();
            nota=(teorica*60/100)+(practica*40/100);
            System.out.println("La nota final del alumno número "+contador+" es "+nota+".\n");
            contador++;
        } // fin del while

	System.out.println("Ya se han calculado todas las notas.");
            
   }
}
