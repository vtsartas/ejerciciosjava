package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 21 (hoja V, 6) - Calcular recibo de operador según GB consumidos

public class Ejercicio21 {

    public static void main(String[] args) {
        
        double consumo, coste; // Definimos las variables a utilizar

        // Pedimos por pantalla el consumo en GB realizadoo
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce el consumo total del mes del cliente en GB: ");
        consumo=entrada.nextDouble();

        // Si el consumo es 4 GB o menos el importe será 45€
        if (consumo<=4){
            System.out.println("El recibo es de 45 euros.");
        }
        else if (consumo<=8){
            System.out.println("El recibo es de 85 euros.");
        }
        else {
            coste=85+((consumo-8)*(4.5));
            System.out.println("El recibo es de "+coste+" euros.");
        }
        
   }
}


