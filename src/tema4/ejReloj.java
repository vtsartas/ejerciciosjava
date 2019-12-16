package tema4;

import java.util.Calendar;

public class ejReloj {
    public static void main(String[] args) {

        //int h,m,s;
        Calendar calendario = Calendar.getInstance();

        Reloj reloj1=new Reloj(calendario.get(Calendar.HOUR_OF_DAY),calendario.get(Calendar.MINUTE),calendario.get(Calendar.SECOND),0,0,false,false);

        System.out.println("RELOJ 1 (hora del sistema)");

        System.out.println(reloj1.mostrarHORA());

        System.out.println("RELOJ 2 (arbitraria)");

        Reloj reloj2=new Reloj(15,10,0,0,0,true,true);

        System.out.println(reloj2.mostrarHORA());



    }
    
}