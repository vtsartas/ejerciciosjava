package tema8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ficheros
 */
public class RWfiles {

    public static void main(String[] args) throws IOException  {
        String rutafichero="c:\\fichero.txt";
        
        escribir(rutafichero);
        leer();
    }

    private static void leer() {
    }

    private static void escribir(String fich) {
        FileWriter fichero = new FileWriter(fich);

        BufferedWriter bw;

        fichero.

        if(fichero.exists()){
            bw = new BufferedWriter(new FileWriter(fichero));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(fichero));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();

        fichero.close();

    } // fin del método estribir()

} // fin de la clase RWfiles{}