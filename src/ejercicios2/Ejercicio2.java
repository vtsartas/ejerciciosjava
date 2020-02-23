package ejercicios2;

public class Ejercicio2 {

    public static void ejercicio2(){
   
        String otro2="";
        String mensaje="";
        String caracter;
        char car;

        do{
            System.out.print("Introduce un caracter para comprobar si está en mayúscula o minúsculas: ");
            caracter=LeeTeclado.readStr();
            if (caracter.length()==1){
                car=caracter.charAt(0);
                
                // Se puede hacer con el método .isUpperCase() de la clase Character
                /* if (Character.isUpperCase(car)){
                    mensaje="El carácter indicado ("+caracter+") está en MAYÚSCULAS.\n";
                }
                else{
                    mensaje="El carácter indicado ("+caracter+") está en minúsculas.\n";
                } */

                // también se puede hacer viendo si est� en el rango de caracteres pertiente
                if (((car>='A')&&(car<='Z'))||(car=='�')){
                    mensaje="El carácter indicado ("+caracter+") está en MAYÚSCULAS.\n";
                }
                else{
                    mensaje="El carácter indicado ("+caracter+") está en minúsculas.\n";
                }
 
            }
            else{
                mensaje="ERROR: Debes introducir SOLO 1 caracter.\n";
            }
            System.out.print(mensaje);

            System.out.print("¿Quieres comprobar si otro caracter?(s/n) ");
            otro2=LeeTeclado.readStr();
        } while (otro2.equals("s"));
    } // fin del método ejercicio2()

}