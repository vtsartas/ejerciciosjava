package tema2;

import java.util.Scanner;

public class PerimetroCircunferencia {
    public static void main(String[] args) {
        
        final double PI=3.1415926536;
        double perimetro,radio;
        String leerotro="s";
        Scanner valor=new Scanner(System.in);

        while (leerotro.equals("s")) {
            System.out.println("Introduce el radio de la circunferencia");  
            radio=valor.nextDouble();
            perimetro=radio*PI*2;
            System.out.printf("El perímetro de la circunferencia de radio %.2f es %.4f.\n",radio,perimetro);
            
            System.out.println("¿Deseas calcular otro perímetro en base a otro radio?(s/n)");
            leerotro=valor.next();
        }
        valor.close();
    }

}