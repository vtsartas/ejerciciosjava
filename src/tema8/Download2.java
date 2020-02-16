package tema8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/*  Descarga cualquier URL (página web, PDF, imagen) y la guarda en un fichero.
    Esta versión utiliza un 'buffer' para leer los datos en bloque  */
public class Download2 {

    public static void main(String[] args) {
        // Definimos la url y el fichero donde realiza la descarga

        String url = "http://hcmaslov.d-real.sci-nnov.ru/public/mp3/Jean-Michel%20Jarre/Jean-Michel%20Jarre%20'Equinoxe05'.mp3";
        String fichero = "c:/pruebas/jarre-equinoxe5.mp3";
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
            int numBytes;
            byte[] buffer = new byte[4096];
            System.out.println("Iniciando descarga");
            do {
                numBytes = entrada.read(buffer);
                if (numBytes != -1) {
                    salida.write(buffer,0,numBytes);
                    System.out.print(".");
                }
            } while (numBytes != -1);
            // En este caso el read no devuelve el dato,
            // lo que devuelve es el número de bytes leidos
            // (También devuelve -1 si no hay datos que leer)
            // y los datos se devuelven en la variable buffer,
            // que es un array de bytes
            // En write pasamos como parámetro el buffer de datos,
            // la posición incial del buffer y el número bytes leidos
            // No siempre lee el tamaño del buffer !!!
            salida.close();
            System.out.println();
            System.out.println("Descarga terminada.");
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    
    } // fin del main()

} // fin de la clase principal