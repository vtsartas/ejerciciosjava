package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 27 - Hoja VI (4) - Averiguar el mayor, el menor y la media de una serie de números dados

public class Ejercicio27 {

    public static void main(String[] args) {
        
        // Definimos la variable a utilizar
        int  maximo,minimo,num,contador,suma;
        float media;

        // inicializamos las variables menos 'minimo', que tomará el valor del primer número
        maximo=0;
        suma=0;
	contador=0;

	// Leemos por 1a vez un número sin entrar al bucle. Necesario por si es 0 y para inicializar 'minimo' (de inicio no puede ser 0)
	System.out.println("Introduce un número. Si introduces 0 se indicará cuál es el mayor y menor número introducido, así como su media aritmética: ");
        Scanner valor=new Scanner(System.in);
        num=valor.nextInt();
        
	minimo=num;
        
        // Mientras digamos que sí seguirá comprobando años
        while (num!=0) {
		suma=suma+num;
		contador++;
		if (num>maximo) {
			maximo=num;
                }
		if (num<minimo) {
			minimo=num;
		}
		System.out.println("Introduce un número (ya has introducido "+contador+") o 0 para terminar: ");
		num=valor.nextInt();
        } // fin del while

	if (contador==0) {
		System.out.println("Has indicado directamente cero");
	}
	else {
		media=suma/contador; // media=(float)(suma)/(float)(contador);
		System.out.println("Has introducido "+contador+" números que suman "+suma+". Su media aritmética es "+media+". El mayor ha sido "+maximo+" y el menor "+minimo+".");
	}
            
            
   }
}