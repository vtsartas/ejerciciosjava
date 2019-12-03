package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 31 - Hoja VII (2) - Calcular precio de venta de una pieza para obtener un porcentaje dado de ganancia

public class Ejercicio31 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        float precio,porcganancia,importe;
	String otrocalculo="s";
        
        System.out.println("Recuerda usar la coma ',' para los decimales.");
        
        Scanner valor=new Scanner(System.in);
        
        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
            
                System.out.println("Introduce el precio de coste de la pieza: ");
		precio=valor.nextFloat();
		System.out.println("Introduce el porcentaje de ganancia que deseas obtener: ");
		porcganancia=valor.nextFloat();

		// calculamos el importe
		importe=precio*((100+porcganancia)/100);
                System.out.printf("Para obtener un %.2f%% en la pieza (coste %.2f) deberás venderla a %.2f.",porcganancia,precio,importe);
		
                System.out.println("\n¿Quieres introducir los datos de una nueva pieza (s/n)?");
                otrocalculo=valor.next();
        } // fin del while
        valor.close();
   }
}