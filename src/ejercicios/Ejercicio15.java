package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 15 - Mostrar la media de una serie de números que dejaremos de introducir al indicar -1

public class Ejercicio15 {

    public static void main(String[] args) {
        int n,contador,suma; // // Definimos las variables que vamos a utilizar
        contador=0; // inicialicamos el contador a 0 por si lo primero introducido es -1
	suma=0; // inicializamos la suma a cero
        
        // Pedimos un primer número por pantalla
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Introduce un número o -1 si deseas terminar: ");
        n=entrada.nextInt(); // Pedimos el valor de 'n' usando el objeto creado
        
	              
        // Mientras el número introducido no sea -1 lo añadiremos a la suma y sumaremos 1 al contador
        while (n!=-1){
            suma=suma+n;
            contador=contador+1;
            System.out.println("Introduce otro número o -1 si deseas terminar: ");
            n=entrada.nextInt();
        }
        
        // Si el contador es 0 es porque directamente se ha introducido -1 y no haremos la media, sí la hacemos en caso contrario
	if (contador==0) {
		System.out.println("Has terminado directamente con -1 por lo que no se hará la media");
	}
	else {
		System.out.println("La media de los "+contador+" números que has introducido es "+(suma/contador)+".");
	}        

   }
}   