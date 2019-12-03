package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 23 (hoja V, 8) - Pedir un número del 1 al 100 y decir cuántos dígitos tiene (versión Elena)

public class Ejercicio23Elena {

    public static void main(String[] args) {
        
        int num,cifras,divisor,temporal; // Definimos las variables a utilizar
        
        // Pedimos por pantalla el número a verificar
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce un número del 1 al 100: ");
        num=entrada.nextInt();
        cifras=0;
	divisor=10;
	temporal=num;

        // Si el número está entre 1 y 100 indicamos cuántos dígitos tiene. Para ello comprobamos el valor de sus centenas y decenas
        if (num>0 & num<101){
            do {
                temporal=(num/divisor)-((num%divisor)/divisor); // Para truncar restamos la parte decimal al número
		cifras=cifras+1;
		divisor=divisor*10;
            } while(temporal>0);
            System.out.println("El número "+num+" tiene "+cifras+" dígitos.");
        }
        else {
                System.out.println("ERROR.");

        }
        
        
   }
}