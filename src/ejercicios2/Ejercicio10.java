/* Programa que guarda en un array 10 números enteros que se
leen por teclado. A continuación se recorre el array y calcula
cuántos números son positivos, cuántos negativos y cuántos ceros. */

package ejercicios2;

public class Ejercicio10 {

    public static void ejercicio10(){
        int contador;
        int[] numeros=new int[10];
        String otro10="";
        Sumas resultado=new Sumas(0,0,0,0,0);

        do {

            contador=0;
            System.out.print("Introduce 10 números enteros para cuántos negativos, positivos y ceros hay:\n");
            do{
            
                System.out.print("Introduce el "+Ejercicio8.ordinales1a10(contador)+" valor: ");
                numeros[contador]=LeeTeclado.readInt();
                contador++;

            }while(contador<10);

            resultado=Ejercicio8.sumar(numeros);

            System.out.printf("Has introducido %d números positivos, %d negativos y %d ceros.\n",resultado.getContarpos(),resultado.getContarneg(),resultado.getContarceros());

            System.out.print("¿Quieres comprobar otro listado de 10 números enteros? (s/n)\n");
            otro10=LeeTeclado.readStr();

        }while(otro10.equals("s"));

    }
}