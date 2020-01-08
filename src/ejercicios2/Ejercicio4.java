package ejercicios2;

public class Ejercicio4 {

    public static void ejercicio4(){
   
        String otro4="";
        String mensaje;
        int hora=0,mins=0,segs=0;
        boolean valida;

        do{
            valida=false;
            mensaje="";
            System.out.print("Introduce una hora (hora, minutos, segundos). Se comprobará si es válida\n");
            System.out.print("Hora: ");
            hora=LeeTeclado.readInt();
            System.out.print("Minutos: ");
            mins=LeeTeclado.readInt();
            System.out.print("Segundos: ");
            segs=LeeTeclado.readInt();

            if ((hora>=0)&&(hora<24)){
                if((mins>=0)&&(mins<60)){
                    if((segs>=0)&&(segs<60)){
                        valida=true;
                    }
                }
            }
            
            if (!valida){
                mensaje=" NO";
            }

            System.out.printf("La hora indicada (%02d:%02d:%02d)%s es válida.\n",hora,mins,segs,mensaje);

            System.out.print("¿Quieres comprobar otra hora?(s/n) ");
            otro4=LeeTeclado.readStr();
        } while (otro4.equals("s"));
    } // fin del método ejercicio4()

} // fin de la clase Ejercicio5()