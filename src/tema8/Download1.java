package tema8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
//import java.net.URLClassLoader;
import java.net.URLConnection;

/* Descarga cualquier URL (página web, PDF, imagen) y la guarda en un fichero. */

public class Download1 {

    public static void main(String[] args) {
        // Definimos la url y el fichero donde realiza la descarga
        String url = "http://hcmaslov.d-real.sci-nnov.ru/public/mp3/A-Ha/A-Ha%20'Take%20On%20Me'.mp3";
        String fichero = "c:/pruebas/aha-takeonme.mp3";
        //
        try {
            // preparar la entrada
            System.out.println("Conectando a Internet...");
            URL direccion = new URL(url);                           // "UBICACION"
            URLConnection conexion = direccion.openConnection();    // "TUNEL"
            InputStream entrada = conexion.getInputStream();        // "VAGONES"
            // preparar la salida
            File fich = new File(fichero);
            OutputStream salida = new FileOutputStream(fich);
            // bucle lectura y escritura
            int leido;
            System.out.println("Iniciando descarga");
            do {
                leido = entrada.read();
                if (leido != -1) {
                    salida.write(leido);
                }
            } while (leido != -1);
            // el read() devuelve el valor leido de la entrada
            // y sino quedan datos devuelve -1
            salida.close();
            System.out.println("Descarga terminada");
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
    } // fin del main()

}   // fin de la clase principal