package tema8;

import java.io.File;

/* crea una estructura fija de directorios */
public class CrearDirectorio1 {

    public static void main(String[] args) {
        final String CARPETA_DATOS = "C:\\pruebas";
        File carpeta = null;
        LeeTeclado.iniSc();
        String anyo;

        System.out.print("Dime año: ");
        anyo = Integer.toString(LeeTeclado.readInt());

        System.out.println("Creando carpetas ...");
        // crear carpeta para el año
        try{
            carpeta = new File(CARPETA_DATOS + "\\" + anyo);
            System.out.println("Directorio '"+carpeta.getAbsolutePath()+"'"+((carpeta.mkdir())?" ":" no ")+"creado.");

            carpeta = new File(CARPETA_DATOS + "\\" + anyo + "\\clientes");
            System.out.println("Directorio '"+carpeta.getAbsolutePath()+"'"+((carpeta.mkdir())?" ":" no ")+"creado.");
            carpeta = new File(CARPETA_DATOS + "\\" + anyo + "\\proveedores");
            System.out.println("Directorio '"+carpeta.getAbsolutePath()+"'"+((carpeta.mkdir())?" ":" no ")+"creado.");
            carpeta = new File(CARPETA_DATOS + "\\" + anyo + "\\albaranes");
            System.out.println("Directorio '"+carpeta.getAbsolutePath()+"'"+((carpeta.mkdir())?" ":" no ")+"creado.");
            carpeta = new File(CARPETA_DATOS + "\\" + anyo + "\\facturas");
            System.out.println("Directorio '"+carpeta.getAbsolutePath()+"'"+((carpeta.mkdir())?" ":" no ")+"creado.");
            //
            System.out.println("Carpetas creadas.");
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        LeeTeclado.cierraSc();
    }
}