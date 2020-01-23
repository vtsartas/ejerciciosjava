package tema8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.io.BufferedReader;

/**
 * ficheros
 */
public class LectEscriFich {

    public static void main(String[] args) {
        String nomfichero="c:\\datos\\fichero.txt";
        escribir(nomfichero);
        leer(nomfichero);
    } // fin del main()

    private static void leer(String n) {
        FileReader archivo=null;
        BufferedReader entrada=null;
        String linea="";
        try{
            archivo=new FileReader(n);

            entrada=new BufferedReader(archivo);

            linea=entrada.readLine();
            
            while(linea!=null){
                    System.out.println(linea);
                    linea=entrada.readLine();
            }

        } // fin del try
        catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }// fin del catch  

    } // fin de leer()

    private static void escribir(String n) {
        
        FileWriter fichero=null;
        try{
            fichero = new FileWriter(n,true); // apunta al fichero
            // el 'true' indica que no se sobreescribe el el fichero si ya existe
            PrintWriter salida=null;

            salida=new PrintWriter(fichero);
           
            //fichero.write(hora()+"'\n");

            for (int i=0;i<10;i++){
                salida.println("Línea "+i);
            }

            salida.println("FIN PROCESO ESCRITURA "+hora());

            fichero.close();
        }
        catch(IOException ioe){
            System.out.println("ERROR de fichero: "+ioe.getMessage());
        }
        catch(NullPointerException p){
            System.out.println("ERROR puntero nulo: "+p.getMessage());
        }
        catch(Exception e){
            System.out.println("ERROR de excepción: "+e.getMessage());
        }
        finally{
            System.out.println("El 'finally' se ejecuta siempre.");
        }

    } // fin de escribir()

    public static String hora(){
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        String horacompleta;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        horacompleta=hora + ":" + minutos + ":" + segundos;
        return horacompleta;
    }

} // fin de la clase principal