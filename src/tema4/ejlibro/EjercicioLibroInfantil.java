package tema4.ejlibro;

import java.util.Scanner;


public class EjercicioLibroInfantil {
    public static void main(String[] args) {
        LibroInfantil libroinfantil1=new LibroInfantil("El principito", "0123455667", false, 180, 0, 18);
        int edad;
        String compruebaEdad;

        System.out.println(libroinfantil1.getAtributosLibro());

        System.out.println("Abrimos el libro con 'abrir()'.");
        libroinfantil1.abrir();

        System.out.println(libroinfantil1.getAtributosLibro());

        System.out.println("Cerramos el libro con cerrar()'.");
        libroinfantil1.cerrar();
        System.out.println(libroinfantil1.getAtributosLibro());

        // vemos qué ocurre si usamos la función para comprobar si el libro es recomendable

        Scanner valor=new Scanner(System.in);
        do {
            System.out.println("Introduce la edad del lector para saber si es recomendable: ");
            edad=valor.nextInt();
            if (libroinfantil1.esRecomendable(edad)){
                System.out.println("El libro es recomendable para la edad indicada.");
            }
            else{
                System.out.println("El libro no es recomendable para la edad indicada.");
            }

            System.out.println("¿Quieres comprobar si es recomendable para otro lector?(s/n)");
            compruebaEdad=valor.next();
        } while (compruebaEdad.equals("s"));
        valor.close();

    } // fin del 'main()''
    
} // fin de la clase' EjercicioLibroInfantil'