package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 19 (V-4) - Calcular los sueldos básico, bruto y neto según plantea el ejercicio sobre unos datos dados

public class Ejercicio19 {

    public static void main(String[] args) {
        // Definimos las variables a utilizar, serán reales para que los cálculos se realicen correctamente
        float horas,tarifa,sueldobasico,sueldobruto,sueldoneto;

        // Pedimos por pantalla el total de horas trabajadas este mes y la tarifa a aplicar
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce el número de horas trabajadas: ");
        horas=entrada.nextInt();
        System.out.println("Introduce la tarifa por hora a aplicar para calcular el sueldo: ");
        tarifa=entrada.nextInt();

               
        // Calculamos el importe de cada tipo de sueldo
        sueldobasico=horas*tarifa;
	sueldobruto=sueldobasico*(100+18)/100;
	sueldoneto=sueldobruto*(100-12)/100;

	System.out.println("El salario básico que le corresponde a este trabajador por realizar "+horas+" horas a "+tarifa+" de coste/hora es de "+sueldobasico+".");
        System.out.println("Su salario bruto será de "+sueldobruto+" y su sueldo neto de "+sueldoneto+".");
        entrada.close();   
   }
}