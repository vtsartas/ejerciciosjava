package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 7 - Calcular los porcentajes de niños y niñas
public class Ejercicio07 {

    public static void main(String[] args) {
        // Definimos la variables enteras 'num_ninos','num_ninas' y las reales 'porc_ninos' y 'porc_ninas'
        int num_ninos,num_ninas;
        double porc_ninos,porc_ninas;
        // Pedimos por consola el cuántos niños y niñas hay
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Indica el número de NIÑOS: ");
        num_ninos=entrada.nextInt(); // Pedimos el valor de 'num_ninos' usando el objeto creado
        System.out.println("Indica el número de NIÑAS: ");
        num_ninas=entrada.nextInt(); // Pedimos el valor de 'num_ninos' usando el objeto creado
        // Si el valor de 'a' es negativo o cero mostramos un error
        porc_ninos=(100*num_ninos)/(num_ninos+num_ninas);
        porc_ninas=100-porc_ninos;
        System.out.println("El porcentaje de niños es "+porc_ninos+"% y el de niñas un "+porc_ninas+"%.");
    }        
}