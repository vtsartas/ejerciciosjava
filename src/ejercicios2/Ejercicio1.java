package ejercicios2;

// decir si un número dado es par o impar
public class Ejercicio1 {
    
    public static void ejercicio1(){    
        String otro1="";
        String mensajeparimp="";
        int num;

        do{
            System.out.print("Introduce un número entero para comprobar si es par o impar: ");
            num=LeeTeclado.readInt();
            if (parimpar(num)){
                mensajeparimp="El número indicado ("+num+") es PAR.\n";
            }
            else{
                mensajeparimp="El número indicado ("+num+") es IMPAR.\n";
            }
            System.out.print(mensajeparimp);

            System.out.print("¿Quieres comprobar si otro número es par o impar?(s/n) ");
            otro1=LeeTeclado.readStr();
        } while (otro1.equals("s"));
    } // fin del método ejercicio1()

    // creamos un método para comprobar si el número es par o impar
    public static boolean parimpar(int numero){
        if (numero%2==0){
            return true;
        }
        else{
            return false;
        }
    } // fin del método parimpar()

} // fin de la clase Ejercicio1