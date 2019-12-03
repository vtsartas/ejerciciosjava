package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 25 - Hoja VI (2) - Verificar si se introduce una contraseña de forma correcta con 3 intentos

public class Ejercicio25 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int intentos;
	String password;
        
        intentos=0;
        
        System.out.println("Introduce la contraseña. Tienes 3 intentos: ");
        
        // Mientras llevemos menos de tres intentos podremos intentarlo de nuevo
            while (intentos<3) {
                intentos++;	
		Scanner texto=new Scanner(System.in);
                password=texto.next();
                                
                // Si acertamos salimos del Mientras evitando que salga ningún mensaje aparte de este
		if (password.equals("eureka")) {
			System.out.println("La contraseña que has introducido es CORRECTA");
			break; // terminamos el 'while'
                }
			// Si hemos fallado en los dos primeros intentos mostraremos este mensaje
                else if (intentos<3) {
			System.out.println("La contraseña introducida es INCORRECTA. Prueba de nuevo, te quedan "+(3-intentos)+" intentos: ");
                }
                else {
                    System.out.println("ERROR: Has introducido mal la contraseña 3 veces y el programa ha terminado.");
                }      
            } // fin del while
   }
}





		

