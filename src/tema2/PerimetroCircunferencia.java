package tema2;

import java.util.Scanner;

public class PerimetroCircunferencia {
    public static void main(String[] args) {
        final double PI=3.1415926536;
        double perimetro,radio;
        System.out.println("Introduce el radio de la circunferencia");
        Scanner valor=new Scanner(System.in);
        radio=valor.nextDouble();
        perimetro=radio*PI*2;
        System.out.printf("El perímetro de la circunferencia de radio %.2f es %.4f.",radio,perimetro);
        valor.close();
    }

}