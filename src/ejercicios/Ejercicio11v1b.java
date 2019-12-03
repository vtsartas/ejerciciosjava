package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 11v1b - Indicar si un número es par o impar. Si es cero volver a pedir otro número hasta tres veces

public class Ejercicio11v1b {

    public static void main(String[] args) {
        // Definimos la variable entera 'num'
        int num,intentos;
                
        // Pedimos una primera vez el valor de 'num'
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
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
        if (num!=0){
            // Indicamos si es par o impar con el resto según el resto de su división entre 2
            if (num%2==0){
                System.out.println("El número "+num+" es PAR.");
            }
            else {
                System.out.println("El número "+num+" es IMPAR.");
            }
        }
        else {
            System.out.println("ERROR: Has introducido tres veces cero.");}
        entrada.close();
   }
}