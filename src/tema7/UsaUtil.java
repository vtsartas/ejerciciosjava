package tema7;

public class UsaUtil{

    public static void main(String[] args) {
        int numleido;
        String otro="";
        
        LeeTeclado.iniSc(); // ** es necesario abrir una vez el Scanner, lo haremos en la clase main()

        do {
            
            Util.diasSemana();
            System.out.print("Introduce el número del día de la semana a comprobar (del 1 al 7): ");
            
            do {
                numleido=LeeTeclado.readInt();
                if (!Util.compruebaDia(numleido)){
                    System.out.printf("El número introducido (%d) es erroneo por ser menor de 1 o mayor a 7.\nIntroduce un nuevo número a comprobar: ",numleido);
                }
            } while(!Util.compruebaDia(numleido));

            System.out.printf("SWITCH: El dia indicado es el %s.\n",Util.diaSemana(numleido));
            System.out.printf("ARRAY: El dia indicado es el %s.\n",Util.diaSemArray(numleido));

            System.out.print("¿Quieres comprobar otro día?(s/n) ");
            otro=LeeTeclado.readStr();

        } while (otro.equals("s"));

        LeeTeclado.cierraSc(); // cerramos solo una vez el Scanner, lo hacemos en 'main()'

    } // fin del método main()

} // fin de la clase UsaUtil