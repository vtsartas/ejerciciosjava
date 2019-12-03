package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 22 (hoja V, 7) - Pedir un número de tres cifras y si lo es invertir el orden de estas

public class Ejercicio22 {

    public static void main(String[] args) {
        
        int num,unidades,decenas,centenas,numfinal; // Definimos las variables a utilizar

        // Pedimos por pantalla el número a verificar
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int num=entrada.nextInt();"
        System.out.println("Introduce un número de tres cifras (100 a 999): ");
        num=entrada.nextInt();

        // Si el número está entre 100 y 999 tendrá 3 cifras y lo pondremos al revés
        if (num>99 && num<1000){
            // las unidades serán el resto de dividir el número entre 10
            unidades=num%10;
            // las decenas serán el resto de dividir el número menos las unidades entre 100 entre 10
            decenas=((num-unidades)%100)/10;
            // las centenas serán el resto de dividir el número menos las unidades y las decenas entre 100 entre 100
            centenas=(((num-unidades)-(decenas*10))%1000)/100;
            
            // el número al revés se obtendra convirtiendo las unidades en centenas, las decenas tal cual y las centenas se dejan como unidades
            numfinal=(unidades*100)+(decenas*10)+centenas;
            // mostramos el resultado

        System.out.println("El numero original ("+num+") al revés es "+numfinal+".");
        }
        else {
        // si el número no tiene 3 cifras lo indicamos
        System.out.println("Número incorrecto: tiene más o menos de tres cifras");
        }
        
   }
}

    	
    
