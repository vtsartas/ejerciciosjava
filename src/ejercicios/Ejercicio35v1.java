package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 35 - Hoja VIII (1)v1 - Coste cantidad de lápices según tarifa dada

public class Ejercicio35v1 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int unidades,unidsup;
    float coste,costesup;
	String otrocalculo="s";
        
        Scanner valor=new Scanner(System.in);
        
        System.out.println("Introduce el coste inicial de los lápices:");
	coste=valor.nextFloat();
	System.out.println("Indica a partir de qué cantidad de de lápices se reduce el coste:");
	unidsup=valor.nextInt();
	System.out.printf("Indica el nuevo coste reducido a partir de %d lápices:\n",unidsup);
	costesup=valor.nextFloat();
        
        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
                            
                System.out.printf("A partir de %d lápices, el coste es %.2f euros. Si es menor es %.2f euros.\n",unidsup,costesup,coste);

                System.out.println("Introduce el número de de lápices:");
		unidades=valor.nextInt();

		// Según las unidades compradas, indicaremos el coste
		if (unidades>=unidsup){
			System.out.printf("El coste de %d lápices es de %.2f euros",unidades,costesup);
		}
		else {
			System.out.printf("El coste de %d lápices es de %.2f euros",unidades,coste);
		}
		
                System.out.println("\n¿Deseas ver el coste de otra venta (s/n)?");
                Scanner texto=new Scanner(System.in);
                otrocalculo=texto.next();
        } // fin del while
        valor.close();
	texto.close();
   }
}