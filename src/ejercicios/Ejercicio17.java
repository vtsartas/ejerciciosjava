package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 17 (hoja V-2) - Calcular el capital total y el porcentaje de cada socio

public class Ejercicio17 {

    public static void main(String[] args) {
        float capitaltotal,capitalmiguel,capitaleva,capitaleduardo; // Definimos las variables que vamos a utilizar
        float porcmiguel,porceva,porceduardo; // los porcentajes deberán ser números reales que redondearemos por legibilidad
               
        // Pedimos el capital de cada socio
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce el capital aportado por Miguel: ");
        capitalmiguel=entrada.nextInt();
        System.out.println("Introduce el capital aportado por Eva: ");
        capitaleva=entrada.nextInt();
        System.out.println("Introduce el capital aportado por Eduardo: ");
        capitaleduardo=entrada.nextInt();
               
        // Calculamos y mostramos el capital total así como el porcentaje aportado por cada socio
        capitaltotal=capitalmiguel+capitaleva+capitaleduardo ;

        System.out.println("El capital total de la sociedad es de "+capitaltotal+".");
	porcmiguel=(capitalmiguel*100)/capitaltotal;
	porceva=(capitaleva*100)/capitaltotal;
	porceduardo=(capitaleduardo*100)/capitaltotal;
	System.out.println("Miguel tiene un "+porcmiguel+"% del total, Eva un "+porceva+"% y Eduardo un "+porceduardo+"%.");
        
   }
}