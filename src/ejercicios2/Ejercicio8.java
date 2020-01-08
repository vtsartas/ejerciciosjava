/* Programa que lea por teclado 10 números enteros y los guarde en un array.
A continuación calcula y muestra por separado la media de los valores positivos y la de los valores negativos. */

package ejercicios2;

public class Ejercicio8 {

    public static void ejercicio8(){
   
        int contador;
        int [] numeros={};
        Sumas sumas;
        String otro8="";

        do{
            contador=0;
            System.out.print("Introduce 10 números enteros para saber la media y suma de los negativos y positivos:\n");
            do{
            
                System.out.print("Introduce el "+ordinales1a10(contador)+" valor: ");
                numeros[contador]=LeeTeclado.readInt();
                contador++;

            }while(contador<10);

        

            System.out.print("¿Quieres introducir otra serie de 10 números? (s/n) ");
            otro8=LeeTeclado.readStr();
        } while (otro8.equals("s"));
    } // fin del método ejercicio8()

    public static String ordinales1a10(int n){
        String [] ordinales={"primer","segundo","tercer","cuarto","quinto","sexto","séptimo","octavo","noveno","décimo"};
        return ordinales[n-1];
    }

    public class Sumas{
        private int sumapositivos;
        private int contarpos;
        private int sumanegativos;
        private int contarneg;

        public Sumas(int sumapositivos, int sumanegativos,int contarpos, int contarneg) {
            this.sumapositivos = sumapositivos;
            this.sumanegativos = sumanegativos;
            this.contarpos = contarpos;
            this.contarneg = contarneg;
        }

        public int getSumapositivos() {
            return sumapositivos;
        }

        public void setSumapositivos(int sumapositivos) {
            this.sumapositivos = sumapositivos;
        }

        public int getSumanegativos() {
            return sumanegativos;
        }

        public void setSumanegativos(int sumanegativos) {
            this.sumanegativos = sumanegativos;
        }

        public int getContarpos() {
            return contarpos;
        }

        public void setContarpos(int contarpos) {
            this.contarpos = contarpos;
        }

        public int getContarneg() {
            return contarneg;
        }

        public void setContarneg(int contarneg) {
            this.contarneg = contarneg;
        }

    } // fin de la clase Sumas{}

    public static Sumas sumar(int[] numeros){
        Sumas retorno=new Sumas(0,0,0,0);
        int i;
        int sumapos=0,sumaneg=0,contapos=0,contaneg=0;
        for (i=0;i<numeros.length;i++){
            if (numeros[i]>=0){
                sumapos+=numeros[i];
                contapos++;
            }
            else{
                sumaneg+=numeros[i];
                contaneg++;
            }
        }
        retorno.setContarneg(contaneg);
        retorno.setContarpos(contapos);
        retorno.setSumanegativos(sumaneg);
        retorno.setSumapositivos(contaneg);
        return retorno;

    }

} //fin de la clase Ejercicio8{}