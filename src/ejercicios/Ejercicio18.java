package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 18 (V-3) - Calcular el reparto de ganancias en proporción al número de acciones sobre el total

public class Ejercicio18 {

    public static void main(String[] args) {
        // Definimos las variables a utilizar, serán de tipo real para que se puedan realizar los cálculos sin problema
        float totalacciones,acciones1,acciones2,acciones3,ganancias,ganancias1,ganancias2,ganancias3;
        
        // Pedimos el monto de las ganancias y el número de acciones de cada socio
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce el montante de las ganancias obtenidas: ");
        ganancias=entrada.nextInt();
        System.out.println("Introduce el número de acciones del PRIMER socio: ");
        acciones1=entrada.nextInt();
        System.out.println("Introduce el número de acciones del SEGUNDO socio: ");
        acciones2=entrada.nextInt();
        System.out.println("Introduce el número de acciones del TERCER socio: ");
        acciones3=entrada.nextInt();
               
        // Calculamos el total de acciones y de la proporción sacamos las ganancias de cada socio
	totalacciones=acciones1+acciones2+acciones3;
	ganancias1=ganancias*(acciones1/totalacciones);
	ganancias2=ganancias*(acciones2/totalacciones);
	ganancias3=ganancias*(acciones3/totalacciones);
	System.out.println("El 1er socio obtiene "+ganancias1+" ganancias, el 2o "+ganancias2+" y el 3o "+ganancias3+".");
    entrada.close(); 
   }
}