package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 16 (V-1) - Calcular el perímetro de un terreno

public class Ejercicio16 {

    public static void main(String[] args) {
        int lado,lados,sumalados; // Definimos las variables que vamos a utilizar
        lados=0; // inicialicamos el contador a 0
	sumalados=0; // inicializamos la suma a cero
        
        // Pedimos el valor del primer lado
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce la longitud del primer lado del terreno (mínimo 3 lados): ");
        lado=entrada.nextInt(); // Pedimos el valor del primer lado usando el objeto creado
               
        // Mientras el valor del lado no sea -1 y a la vez tengamos 3 lados o más, seguiremos pidiendo ladoso
        while (lados<3){
            
            // Solo sumaremos el valor del lado si no es -1, en cuyo caso indicaremos el error
            if (lado!=-1){
                sumalados=sumalados+lado;
                lados=lados+1;
                System.out.println("Introduce otro lado (llevas "+lados+") o -1 si deseas terminar: ");
            }
            else {
                System.out.println("\nHas introducido -1 pero aún no has indicado 3 lados ("+lados+"). Introduce otro lado: ");
            }
            
            lado=entrada.nextInt(); // Pedimos otro lado
        }
        
        // En este bucle se sumarán lados más allá del mínimo de tres o hasta que se entre -1
        while (lado!=-1){
            sumalados=sumalados+lado;
            lados=lados+1;
            System.out.println("\nIntroduce otro lado o -1 si deseas terminar: ");
            lado=entrada.nextInt(); // Pedimos otro lado
        }

        // Mostramos por pantalla el número total de lados introducido y su suma (el perímetro)
	System.out.println("Has introducido datos de un terreno de "+lados+" lados cuyo perímetro es de "+sumalados+".");
    entrada.close();
 
   }
}
