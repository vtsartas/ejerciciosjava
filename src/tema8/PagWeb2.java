package tema8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

/*  Lee una página web y la guarda en un fichero
    Reduce las instrucciones de lectura */

/* ES EL MISMO CÓDIGO DE PagWeb.java ¿??¿?¿?¿?¿? */

public class PagWeb2 {

    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter salida = null;
        String linea="";
        String ficheroweb="C:/pruebas/paginaweb.html";
        String urlweb="https://quemalpuedehacer.es/blog/";

        try {
            /******* PREPARAR LECTURA PAGINA WEB ****************/

            // definir la URL a leer ("UBICACIÓN")
            URL direccion = new URL(urlweb);
            
            // abrir un canal de entrada para esa conexión ("TUNEL")
            // en este punto se conecta a internet y fallaria si
            // la dirección es incorrecta o no tenemos internet
            System.out.println("Conectando a Internet...");
            InputStream canalEntrada = direccion.openStream();

            // crear lector del canal de entrada ("VIA")
            InputStreamReader lector = new InputStreamReader(canalEntrada);

            // crear el buffer para esa entrada ("VAGONES")
            BufferedReader entrada = new BufferedReader(lector);

            /****** FICHERO DONDE ESCRIBIMOS LA PAGINA WEB *********/

            // abrir fichero para escritura
            fichero = new FileWriter(ficheroweb);
            
            // abrir canal de escritura en el fichero
            salida = new PrintWriter(fichero);

            System.out.println("Iniciando lectura");
            // leer la página web
            do {
                linea = entrada.readLine(); // "VIAJEROS"
                if (linea != null) {
                    salida.println(linea);  // "TRANSBORDO"
                }
            } while (linea != null);
            salida.close();
            System.out.println("Lectura terminada");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

    } // fin del main

} // fin de la clase principal