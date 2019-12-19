package tema6;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        // EJERCICIO: Programa que nos pida un número
        // y escriba la tabla de multiplicar de ese número

        // pedir el número
        Scanner entrada = new Scanner(System.in);
        
        String otro;
        int numero;
        
        do {
            System.out.print("Dime un número: ");
            numero=entrada.nextInt();

            // 1.for 
            System.out.println("\nTabla de multiplicar del " + numero);
            System.out.println("- FOR -");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero*i) );
            }

            // 2.while        
            System.out.println("\nTabla de multiplicar del " + numero);
            System.out.println("- WHILE -");
            int n=0;
            while (n<11) {
                System.out.println(numero + " x " + n + " = " + (numero*n) );
                n++;
            }


            // 3.do-while
            System.out.println("\nTabla de multiplicar del " + numero);
            System.out.println("- DO-WHILE -");
            n=0;
            do {
                System.out.println(numero + " x " + n + " = " + (numero*n) );
                n++;
            } while (n<11);
        
            System.out.println("¿Quieres calcular las tablas para otro número?(s/n)");
            otro=entrada.next();
        }while (otro.equals("s"));
        
        entrada.close();

        
    }
}