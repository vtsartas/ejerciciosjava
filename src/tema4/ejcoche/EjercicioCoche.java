package tema4.ejcoche;

import java.util.Scanner;

public class EjercicioCoche {

    public static void main(String[] args) {
        String presionOp, presionAccion;
        
        Motor motor1=new Motor(1600,110,"diesel");
        Puerta puerta1=new Puerta(true);
        Rueda rueda1=new Rueda("16",2.3);
        Coche coche1=new Coche("SEAT","León","rojo",motor1,puerta1,rueda1);
        
        System.out.println(coche1.getAtributosCoche());

        Scanner valor=new Scanner(System.in);

        do {
            System.out.print("¿Quieres subir o bajar la presión de las ruedas en 0.1? (s/b)");
            presionAccion=valor.next();
            if (presionAccion.equals("s")){
                coche1.getRueda().subirPresion();
            }
            else if (presionAccion.equals("b")){
                coche1.getRueda().bajarPresion();
            }

            System.out.println(coche1.getAtributosCoche());
            
            System.out.print("¿Quieres operar de nuevo con la presión de las ruedas? (s/n)");
            presionOp=valor.next();
        } while (presionOp.equals("s"));
        valor.close();
    }
}