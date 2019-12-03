package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 10 - Decir si el interesado puede acceder al ciclo formativo pro haber hecho bachillerato o la prueba de acceso.
public class Ejercicio10 {

    public static void main(String[] args) {
        // Definimos las variables de cadena de caracteres 'bachiller' y 'prueba'
        String bachiller, prueba;
        
       // Preguntamos si se ha realizado el bachillerato. Si es "sí", mostramos mensaje de que es posible realizar el ciclo
        
        Scanner entrada=new Scanner(System.in); // Creamos un objeto de la clase "Scanner" para la entrada para recibir los datos
        // También se podrían inicializar directamente las variables aquí con "int a=entrada.nextInt();"
        System.out.println("¿Has realizado el bachillerato? (sí/no)");
        bachiller=entrada.nextLine();
        
        if (bachiller.equals("si")||bachiller.equals("Si")||bachiller.equals("SI")||bachiller.equals("S�")||bachiller.equals("S�")||bachiller.equals("s�")){
            System.out.println("Puedes acceder al ciclo formativo porque has realizado el bachillerato.");
        }
        // Si no, preguntamos si se ha superado la prueba de acceso
        else {
            System.out.println("¿Has superado la prueba de acceso? (sí/no)");
            prueba=entrada.nextLine(); 
            if (prueba.equals("si")||prueba.equals("Si")||prueba.equals("SI")||prueba.equals("S�")||prueba.equals("S�")||prueba.equals("s�")){
            System.out.println("Puedes acceder al ciclo formativo porque has superado la prueba de acceso.");
            }
            else {
            System.out.println("No puedes acceder al ciclo formativo porque no tienes bachillerato ni has superado la prueba de acceso.");
            }
        }
        entrada.close();
   }
}        