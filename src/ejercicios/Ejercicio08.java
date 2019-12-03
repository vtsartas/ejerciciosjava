package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 8 - Aplicar descuento del 15% si el mes actual es octubre
public class Ejercicio08 {

    public static void main(String[] args) {
        // Definimos la variables enteras 'precio','importe' y la cadena de caracteres 'mes_actual'
        int precio,importe;
        String mes_actual;
        // Pedimos por consola el precio del artículo y el mes actual
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("Indica el mes actual (en minúsculas): ");
        mes_actual=entrada.nextLine();
        System.out.println("Indica el precio del artículo: ");
        precio=entrada.nextInt();

        // Si el mes_actual es octubre aplicamos el descuento al importe, si no lo dejamos igual
        importe=precio;
        if (mes_actual.equals("octubre")){
            importe=precio*(100-15)/100;
        }
        System.out.println("El precio final es "+importe+" por estar en "+mes_actual+".");
    }        
}