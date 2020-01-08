package ejercicios2;

public class Ejercicio3 {

    public static void ejercicio3(){
   
        String otro3="";
        String mensaje="";
        int num1,num2,num3;

        do{
            System.out.print("Introduce tres números enteros para saber cuál es el mayor:\n");
            System.out.print("Primero: ");
            num1=LeeTeclado.readInt();
            System.out.print("Segundo: ");
            num2=LeeTeclado.readInt();
            System.out.print("Tercero: ");
            num3=LeeTeclado.readInt();

            if ((num1>num2)&&(num1>num3)){
                    mensaje="El primer número ("+num1+") es mayor que el segundo ("+num2+") y que el tercero ("+num3+").\n";
                }
            else if (num2>num3){
                mensaje="El segundo número ("+num2+") es mayor que el primero ("+num1+") y que el tercero ("+num3+").\n";
                }
            else{
                mensaje="El tercer número ("+num3+") es mayor que el primero ("+num1+") y que el segundo ("+num2+").\n";
            }
            System.out.print(mensaje);

            System.out.print("¿Quieres comprobar el mayor de otros tres números?(s/n) ");
            otro3=LeeTeclado.readStr();
        } while (otro3.equals("s"));
    } // fin del método ejercicio3()

}