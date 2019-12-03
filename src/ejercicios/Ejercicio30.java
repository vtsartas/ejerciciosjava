package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 30 - Hoja VII (1) - Indicar el coste del agua de una piscina

public class Ejercicio30 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        float ancho,largo,profundidad,volumen,precio,importe;
	String otrocalculo="s";

	System.out.println("Introduce el precio por metro cúbico: ");
        Scanner valor=new Scanner(System.in);
        precio=valor.nextInt();
        
        // Mientras digamos que sí seguirá comprobando años
        while (otrocalculo.equals("s")) {
            
            	// Pedimos las dimensiones
		System.out.println("Introduce (en metros) el ancho de la piscina: ");
		ancho=valor.nextInt();
		System.out.println("Introduce (en metros) el largo de la piscina: ");
		largo=valor.nextInt();
		System.out.println("Introduce (en metros) la profundidad del agua en la piscina: ");
		profundidad=valor.nextInt();
		// calculamos el volumen de agua
		volumen=ancho*largo*profundidad;
		System.out.println("\nLa piscina tiene "+volumen+" metros cúbicos de agua.");
		// calculamos e indicamos el importe a pagar
		importe=precio*volumen;
		System.out.println("\nEl importe para esta piscina es de "+importe+".");

                System.out.println("\n¿Quieres introducir los datos de una nueva piscina (s/n)?");
                Scanner texto=new Scanner(System.in);
                otrocalculo=texto.next();
        } // fin del while
   }
}




