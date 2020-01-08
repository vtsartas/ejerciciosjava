/* Programa que lea por teclado 10 números enteros y los guarde en un array.
A continuación calcula y muestra por separado la media de los valores positivos
y la de los valores negativos. */

package ejercicios2;

public class Ejercicio8 {

    public static void ejercicio8(){
   
        int contador;
        int [] numeros=new int[10];
        double mediapos,medianeg;
        Sumas sumados=new Sumas(0,0,0,0);
        String otro8="";

        do{
            contador=0;
            System.out.print("Introduce 10 números enteros para saber la media y suma de los negativos y positivos:\n");
            do{
            
                System.out.print("Introduce el "+ordinales1a10(contador)+" valor: ");
                numeros[contador]=LeeTeclado.readInt();
                contador++;

            }while(contador<10);

            sumados=sumar(numeros);
            mediapos=(double)sumados.getSumapositivos()/(double)sumados.getContarpos();
            System.out.printf("Has introducido %d números positivos y su media es %.2f\n",sumados.getContarpos(),mediapos);
            medianeg=(double)sumados.getSumanegativos()/(double)sumados.getContarneg();
            System.out.printf("Has introducido %d números negativos y su media es %.2f\n",sumados.getContarneg(),medianeg);
        

            System.out.print("¿Quieres introducir otra serie de 10 números? (s/n) ");
            otro8=LeeTeclado.readStr();
        } while (otro8.equals("s"));
    } // fin del método ejercicio8()

    public static String ordinales1a10(int n){
        String[] ordinales={"primer","segundo","tercer","cuarto","quinto","sexto","séptimo","octavo","noveno","décimo"};
        return ordinales[n];
    }

    public static Sumas sumar(int[] numeros){
        Sumas retorno=new Sumas(0,0,0,0);
        int i;
        int sumapos=0,sumaneg=0,contapos=0,contaneg=0;
        for (i=0;i<numeros.length;i++){
            if (numeros[i]>0){
                sumapos+=numeros[i];
                contapos++;
            }
            else if (numeros[i]<0){
                sumaneg+=numeros[i];
                contaneg++;
            }
            
        }
        retorno.setContarneg(contaneg);
        retorno.setContarpos(contapos);
        retorno.setSumanegativos(sumaneg);
        retorno.setSumapositivos(sumapos);
        return retorno;

    }

} //fin de la clase Ejercicio8{}