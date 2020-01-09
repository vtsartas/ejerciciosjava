/* Programa que pida que se introduzcan dos números enteros por teclado
y muestre los números enteros desde el menor hasta el mayor de los números
introducidos. Los dos números introducidos deben ser distintos.
Si son iguales se mostrará un mensaje indicandolo y se vuelven a introducir. */

package ejercicios2;

public class Ejercicio6 {

    public static void ejercicio6(){
   
        String otro6="";
        int num1,num2,comodin,contador;

        do{
            
            do{
                System.out.print("Introduce los dos números enteros entre los que quieres mostrar los que hay:\n");
                System.out.print("Primero: ");
                num1=LeeTeclado.readInt();
                System.out.print("Segundo: ");
                num2=LeeTeclado.readInt();

                if (num1==num2){
                        System.out.print("ERROR: los dos números introducidos son iguales. Vuelve a intentarlo.\n");
                }

            }while(num1==num2);
            
            if (num2<num1){
                comodin=num1;
                num1=num2;
                num2=comodin;
            }

            for (contador=num1;contador<=num2;contador++){
                System.out.print(contador+" ");
            }
            
            System.out.print("\n¿Quieres mostrar otra serie en base a dos números (s/n)? ");
            otro6=LeeTeclado.readStr();
        } while (otro6.equals("s"));
    } // fin del método ejercicio6()

}