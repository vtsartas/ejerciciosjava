package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 33 - Hoja VII (4) - Calcular el tiempo que tardará una bicicleta
// en realizar un trayecto suponiendo que su velocidad sea constante

public class Ejercicio33 {
    
    static int truncar(float temp) {
        float truncado;
        truncado=temp-((temp%1000000000)/1000000000);
        return (int)truncado;
        }
    

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int horas,minutos,segundos;
        float velocidad,espacio,tiempo;
	String otrocalculo="s";
        
        System.out.println("Recuerda usar la coma ',' para los decimales.");
        
        Scanner valor=new Scanner(System.in);   
        
        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
            
                System.out.printf("Indica (en kph) la velocidad media de la bicicleta:\n");
		velocidad=valor.nextFloat();
		System.out.printf("Indica (en kilómetros) la distancia entre las dos ciudades:\n");
		espacio=valor.nextFloat();

		// calculamos lo que tarda
		tiempo=espacio/velocidad;

		// calculamos las horas/minutos/segundos que representa ese tiempo
		horas=truncar(tiempo);
		minutos=truncar((tiempo-truncar(tiempo))*60);
		segundos=truncar((((tiempo-truncar(tiempo))*60)-truncar((tiempo-truncar(tiempo))*60))*60);

		System.out.printf("La bicicleta tardará %d horas, %d minutos y %d segundos en realizar el trayecto de %.2f km a %.2f kph.",horas,minutos,segundos,espacio,velocidad);
		
                System.out.println("\n\n¿Quieres calcular otro trayecto (s/n)?");
                otrocalculo=valor.next();
        } // fin del while
        valor.close();
   }
}