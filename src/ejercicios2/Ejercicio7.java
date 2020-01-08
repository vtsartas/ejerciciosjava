/*  Programa que lea números enteros por teclado y para cada número introducido
indique si es positivo o negativo y si es par o impar.
Se deben realizar tres versiones del programa:
a) En la primera versión se utilizará un bucle while.
    La lectura de números finalizará cuando se introduzca un cero.
b) En la segunda versión se utilizará un bucle do .. while.
    La lectura de números en esta versión también finaliza cuando se introduzca un cero.
c) En la tercera versión también se utilizará un bucle do .. while pero en este caso la
    lectura de números finaliza cuando se responda ‘N’ ó ‘n’ a la pregunta “Desea introducir más números? (S/N):
*/

package ejercicios2;

public class Ejercicio7 {

    public static void ejercicio7(){
   
        String otro7="";
        String version="";
        boolean versionok;

        do{
            
            do{
                versionok=false;
                System.out.print("Introduce la versión del ejecicio que quieres utilizar:\n");
                System.out.print("a) Bucle 'while', termina al introducir '0'\n");
                System.out.print("b) Bucle 'do ... while', termina al introducir '0'\n");
                System.out.print("c) Bucle 'while', pero termina al introducir 'n' o 'N'\n");
                
                version=LeeTeclado.readStr();

                if ((version.equals("a"))||(version.equals("b"))||(version.equals("c"))){
                        versionok=true;
                }
                else{
                    System.out.print("ERROR: la opción introducida no es válida.\n");
                }
            }while(!versionok);
            
            switch (version) {
                case "a":
                    ejercicio7a();
                    break;
                case "b":
                    ejercicio7b();
                    break;
                case "c":
                    ejercicio7c();
                    break;
                default:
                    break;
            }
            
            System.out.print("¿Quieres reealizar de nuevo el ejercicio 7? (s/n) ");
            otro7=LeeTeclado.readStr();
        } while (otro7.equals("s"));
    } // fin del método ejercicio7()

    public static void ejercicio7a(){
        int numero;
        boolean otro7a=true;
        while (otro7a){
            System.out.print("a) Introduce un número para saber si es positivo o negativo y si es par o impar ('0' para terminar): ");
            numero=LeeTeclado.readInt();
            if(numero!=0){
                System.out.print("El número "+numero+" es "+posneg(numero)+" y "+parimpartxt(numero)+".\n");
            }
            else{
                otro7a=false;
            }
        } // fin del while
    } // fin del método ejercicio7a()

    public static void ejercicio7b(){
        int numero;
        boolean otro7b=true;
        do {
            System.out.print("b) Introduce un número para saber si es positivo o negativo y si es par o impar ('0' para terminar): ");
            numero=LeeTeclado.readInt();
            if(numero!=0){
                System.out.print("El número "+numero+" es "+posneg(numero)+" y "+parimpartxt(numero)+".\n");
            }
            else{
                otro7b=false;
            }
        } while(otro7b);
    } // fin del método ejercicio7b()

    public static void ejercicio7c(){
        String numero;
        int num;
        boolean otro7c=true;
        do {
            System.out.print("c) Introduce un número para saber si es positivo o negativo y si es par o impar ('n' o 'N' para terminar): ");
            numero=LeeTeclado.readStr();
            if((numero.equals("n"))||(numero.equals("N"))){
                otro7c=false;
            }
            else{
                num=Integer.parseInt(numero);
                System.out.print("El número "+numero+" es "+posneg(num)+" "+parimpartxt(num)+".\n");
            }
        } while(otro7c);
    } // fin del método ejercicio7c()



    public static String posneg (int n){
        return (n>0?"positivo":"negativo");
    }

    public static String parimpartxt (int n){
        return (Ejercicio1.parimpar(n)?"y par":"e impar");
    }

}