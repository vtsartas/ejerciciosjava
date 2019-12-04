package tema2;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        int temperatura;
        double centigrados,farenheit;
        Scanner valor=new Scanner(System.in);
        String leerotro="s";
        
        // Mientras lo deseemos, el programa seguirá pidiendo temperaturas a convertir
        while (leerotro.equals("s")){

            System.out.print("Introduce la temperatura Fahrenheit que quieras convertir a grados C:\n");
            farenheit=valor.nextDouble();

            // Hacemos la conversión de grados F a C, lo mostramos usando los Double limitando los decimales
            centigrados=((farenheit-32.0)*5.0)/9.0;
            System.out.printf("%.2f grados F son %.2f grados C.\n",farenheit,centigrados);

            // Convertimos el resultado a un valor entero y mostramos el resultado con el entero obtenido
            temperatura=(int) centigrados;
            System.out.printf("%.2f grados F son %d grados C.\n",farenheit,temperatura);

            // Preguntamos si se desea convertir una nueva temperatura
            System.out.printf("¿Deseas convertir otra temperatura de C a F?(s/n)\n");
            leerotro=valor.next();
        }
        valor.close();
    }
}