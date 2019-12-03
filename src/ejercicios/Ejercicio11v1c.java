package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola
import java.util.Random; // Clase necesario para obtener números aleatorios

// Ejercicio 11v1a - Indicar si un número es par o impar. Si es cero volver a pedir otro número hasta tres veces,
// en cuyo caso avisaremos del fallo y mostraremos si un número aleatorio es par o impar

public class Ejercicio11v1c {

    public static void main(String[] args) {
        // Definimos la variable entera 'num'
        int num,intentos;
                
        // Pedimos una primera vez el valor de 'num'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto 'entrada' de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce un valor: ");
        num=entrada.nextInt(); // Pedimos el valor de 'num' usando el objeto creado
        
        intentos=1; // inicializamos intentos a uno porque ya hemos leído una vez
        
        // Si el número es cero y no llevamos tres intentos pedimos otro
        while ((num==0) && (intentos<3)){
            System.out.println("Has introducido cero. Indica otro valor para saber si es ni par ni impar");
            intentos=intentos+1; // incrementamos el número de intentos en 1
            num=entrada.nextInt(); // pedimos otro número
        }
        
        // Del anterior bucle salimos si 'num' es distinto de cero o si se ha introducido 0 tres veces
	// por lo que conprobando si el número es cero ya sabemos si debemos averiguar si es par o no
        
         // Si el número es 0 indicaremos el fallo y modificaremos el valor para que diga si un aleatorio es par o impar
        if (num==0){
            System.out.println("ERROR: Has introducido tres veces cero. Vamos a averiguar si un número aleatorio "+num+" es par o impar.");
            Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"
            num = aleatorio.nextInt(1000)+1; // Pedimos un nuevo valor mediante el objeto
        }
        // Indicamos si es par o impar con el resto según el resto de su división entre 2
        if (num%2==0){
            System.out.println("El número "+num+" es PAR.");
            }
        else {
            System.out.println("El número "+num+" es IMPAR.");
            }
    }         
}