package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 23 (hoja V, 8) - Pedir un número del 1 al 100 y decir cuántos dígitos tiene

public class Ejercicio23 {

    public static void main(String[] args) {
        
        int num,unidades,decenas,centenas; // Definimos las variables a utilizar
        
        // Pedimos por pantalla el número a verificar

        // Pedimos por pantalla el número a verificar
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce un número del 1 al 100: ");
        num=entrada.nextInt();

        // Si el número está entre 1 y 100 indicamos cuántos dígitos tiene. Para ello comprobamos el valor de sus centenas y decenas
        if (num<100){
            // las unidades serán el resto de dividir el número entre 10
            unidades=num%10;
            // las decenas serán el resto de dividir el número menos las unidades entre 100 entre 10
            decenas=((num-unidades)%100)/10;
            // las centenas serán el resto de dividir el número menos las unidades y las decenas entre 100 entre 100
            centenas=(((num-unidades)-(decenas*10))%1000)/100;
            
            // Según el valor de centenas y decenas y podremos decir si tiene 3, 2 o 1 dígito
            if (centenas>0) {
			System.out.println("El número "+num+" tiene tres dígitos");
		}
		else if (decenas>0){
			System.out.println("El número "+num+" tiene dos dígitos");
		}
		else{
			System.out.println("El número "+num+" tiene un dígito");
		}
        }
        else {
            // si el número no está entre 1 y 100 o tiene más de 3 dígitos lo indicamos
            if (num<1000){
                System.out.println("Número incorrecto: aunque tiene 3 dígitos es mayor a 100.");
            }
            else {
                System.out.println("Número incorrecto: tiene cuatro dígitos o más.");
            }
        }
        entrada.close();
        
   }
}