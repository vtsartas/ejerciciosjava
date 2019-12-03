package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 26 - Hoja VI (3) - Verificar si el año dado es bisiesto según las indicaciones dadas

public class Ejercicio26 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int year;
        String leerotro;
        leerotro="s";
        
        // Mientras digamos que sí seguirá comprobando años
        while (leerotro.equals("s")) {
            System.out.println("Introduce el año del que deseas comprobar si es o no bisiesto: ");
            Scanner valor=new Scanner(System.in);
            year=valor.nextInt();
                                
            // Comprobamos según las indicaciones dadas si es o no bisiesto
            if ((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)) {
		System.out.println("El año "+year+" es bisiesto.");
            }
            else {
		System.out.println("El año "+year+" NO es bisiesto.");
            }
            System.out.println("\n¿Deseas comprobar otro año (s/n)?");
            Scanner texto=new Scanner(System.in);
            leerotro=texto.next();
        } // fin del while
        valor.close();
        texto.close();
   }
}


