package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 32 - Hoja VII (3) - Calcular importe según descuento que dependerá de las unidades

public class Ejercicio32 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int descunid,unidades;
        float descuento1,descuento2,precio,importe;
	String otrocalculo="s";
        
        System.out.println("Recuerda usar la coma ',' para los decimales.");
        
        Scanner valor=new Scanner(System.in);
        
        System.out.println("Introduce el precio de venta habitual: ");
	precio=valor.nextFloat();
	System.out.println("Indica el descuento inicial: ");
	descuento1=valor.nextFloat();
	System.out.println("Introduce a partir de cuántas unidades habrá un descuento superior: ");
	descunid=valor.nextInt();
	System.out.printf("Indica el descuento a aplicar si se compran más de %d unidades:",descunid);
	descuento2=valor.nextFloat();        
        
        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
            
                System.out.println("Unidades vendidas: ");
		unidades=valor.nextInt();
		
		// calculamos el importe
		if (unidades<descunid) {
			importe=unidades*(precio*((100-descuento1)/100));
			System.out.printf("La compra tendrá un %.2f%% de descuento.",descuento1);
		}
		else {
			importe=unidades*(precio*((100-descuento2)/100));
			System.out.printf("La compra tendrá un %.2f%% de descuento.",descuento2);
		}

		System.out.printf("Importe= %.2f.",importe);
		
                System.out.println("\n¿Quieres ver el importe de una nueva compra del mismo artículo (s/n)?");
                Scanner texto=new Scanner(System.in);
                otrocalculo=texto.next();
        } // fin del while
   }
}