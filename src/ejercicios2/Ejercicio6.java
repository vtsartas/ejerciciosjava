/* Programa que pida que se introduzcan dos números enteros por teclado
y muestre los números desde el menor hasta el mayor de los números
introducidos. Los dos números introducidos deben ser distintos.
Si son iguales se mostrará un mensaje indicandolo y se vuelven a introducir. */

package ejercicios2;

public class Ejercicio6 {

    public static void ejercicio6(){
   
        String otro6="";
        String mensaje="";
        int num1,num2,comodin;
        boolean numsok;

        do{
            numsok=false;
            
            do{
                System.out.print("Introduce los dos números enteros que quieres ordenar:\n");
                System.out.print("Primero: ");
                num1=LeeTeclado.readInt();
                System.out.print("Segundo: ");
                num2=LeeTeclado.readInt();

                if (num1==num2){
                        System.out.print("ERROR: los dos números introducidos son iguales. Vuelve a intentarlo.\n");
                }
                else{
                    numsok=true;
                }
            }while(!numsok);
            
            if (num2>num1){
                comodin=num1;
                num1=num2;
                num2=comodin;
                mensaje="Los números ordenados de mayor a menor quedan así: "+num1+", "+num2+".\n";
            }
            else{
                mensaje="Los números ordenados de mayor a menor quedan así: "+num1+", "+num2+".\n";
            }
            
            System.out.print(mensaje);
            
            System.out.print("¿Quieres ordenar otros dos números?(s/n) ");
            otro6=LeeTeclado.readStr();
        } while (otro6.equals("s"));
    } // fin del método ejercicio6()

}