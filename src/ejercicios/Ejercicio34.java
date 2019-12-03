package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 34 - Hoja VII (5) - Indicar si un número de 3 cifras dado es capicúa

public class Ejercicio34 {
    
    static int truncar(float temp) {
        float truncado;
        truncado=temp-((temp%1000000000)/1000000000);
        return (int)truncado;
        }
    

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int num,unidades,centenas;
	String otrocalculo="s";
        
        Scanner valor=new Scanner(System.in);   
        
        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
                            
                System.out.println("Introduce el número de 3 cifras del\nque quieres saber si es o no capicúa: ");
		num=valor.nextInt();

		// el número tentrá 3 cifras si es mayor que 99 y menor que 1000
		if (num>99 && num<1000) {
			// calculamos las unidades y las centenas, no hace falta mirar las decenas
			unidades=num%10;
			centenas=truncar(num/100);

			// si unidades y centenas son iguales el número de 3 cifras será capicúa
			if (unidades==centenas) {
				System.out.printf("El número %d es capicúa",num);
			}
			else {
				System.out.printf("El número %d no es capicúa",num);
			}
		}
		else {
			System.out.println("ERROR: el número indicado es incorrecto.");
		}
               
		
                System.out.println("\n¿Deseas comprobar si otro número es capicúa (s/n)?");
                otrocalculo=valor.next();
		} // fin del while
		valor.close();
   }
}