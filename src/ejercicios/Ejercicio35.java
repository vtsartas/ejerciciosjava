package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 35 - Hoja VIII (1) - Coste cantidad de lápices según tarifa dada

public class Ejercicio35 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int unidades;
	String otrocalculo="s";
        
        Scanner valor=new Scanner(System.in);   
        
        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
                            
                System.out.println("A partir de 1.000 lápices, el coste es 90 euros. Si es menor es 85 euros.\n\n");

                System.out.println("Introduce el número de de lápices:\n");
		unidades=valor.nextInt();

		// Si la compra es de 1.000 o más lápices el coste será de 85€, si no será de 90€
		if (unidades>=1000){
			System.out.printf("El coste de %d lápices es de 85 euros",unidades);
		}
		else {
			System.out.printf("El coste de %d lápices es de 90 euros",unidades);
		}
		
                System.out.println("\n¿Deseas ver el coste de otra venta (s/n)?");
                otrocalculo=valor.next();
        } // fin del while
        valor.close();
   }
}