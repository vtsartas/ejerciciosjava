package tema4.triangulo;

import java.util.Scanner;

public class ejTriangulo {
    public static void main(String[] args) {
        String otrotri;
        Scanner valor=new Scanner(System.in);

        do {
            System.out.println("Introduce los tres lados del triángulo a comprobar: ");
            Triangulo tri1=new Triangulo (valor.nextDouble(),valor.nextDouble(),valor.nextDouble());

            System.out.println(tri1.getLados());
            
            
            if (tri1.esEquilatero()){
                System.out.println("El triángulo indicado es equilátero");
            }
            else if (tri1.esIsosceles()){
                System.out.println("El triángulo indicado es isósceles");
            }
            else if (tri1.esEscaleno()){
                System.out.println("El triángulo indicado es escaleno");
            }

            if (tri1.esRectangulo()){
                System.out.println("El triángulo indicado es rectángulo");
            }

            System.out.println("¿Quieres comprobar otro triángulo? (s/n)");
            otrotri=valor.next();

        } while (otrotri.equals("s"));
        
        valor.close();

    }
    
}