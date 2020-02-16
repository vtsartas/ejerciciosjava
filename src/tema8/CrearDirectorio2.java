package tema8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*  crear estructura de carpetas variable
    que leeremos de un fichero estructura.txt
    Comprobaremos si existe el fichero o no */

public class CrearDirectorio2 {

    public static void main(String[] args) {
        
        // cada línea leída del fichero creará una carpeta si todo es correcto

        final String CARPETA_DATOS = "c:\\pruebas";
        final String FICHERO_CONFIGURACION = CARPETA_DATOS + "\\estructura.txt";
        
        LeeTeclado.iniSc();
        
        FileReader fichero = null;
        BufferedReader entrada = null;
        File carpeta=null;

        String linea;
        String anno;
        try {
            fichero = new FileReader(FICHERO_CONFIGURACION);
            entrada = new BufferedReader(fichero);
            System.out.print("Dime año: ");
            anno = Integer.toString(LeeTeclado.readInt());
            // crear carpeta del año
            carpeta = new File(CARPETA_DATOS + "\\" + anno);
            carpeta.mkdir();         
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    System.out.print("Creando carpeta " + linea);
                    // crear una carpeta por cada linea (2º paso)
                    carpeta = new File(CARPETA_DATOS + "\\" + anno + "\\" + linea);
                    // comprobando si la carpeta se crea correctamente
                    // daría error si el camino no es correcto o ya exista
                    System.out.println("Directorio '"+carpeta.getAbsolutePath()+"'"+((carpeta.mkdir())?" ":" no ")+"creado.");
                }
            } while (linea != null);
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        LeeTeclado.cierraSc();

    } // fin del main()

} // fin de la clase principal