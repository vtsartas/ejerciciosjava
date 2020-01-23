package tema8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;

/**
 * ficheros
 */
public class NumeraClientes {

    public static void main(String[] args) {
        String nomfichero="c:\\datos\\Clientes.txt";
        String nuevofichero="c:\\datos\\ClientesNumerados.txt";
        numerar(nomfichero,nuevofichero);

    } // fin del main()

    private static void numerar(String cli, String clinu) {
        FileWriter fichero=null;
        FileReader archivocli=null;
        BufferedReader entrada=null;
        String linea="";
        int contador=0;

        try{
            archivocli=new FileReader(cli);

            entrada=new BufferedReader(archivocli);

            linea=entrada.readLine();
            
            while(linea!=null){
                    
                    try{
                        fichero = new FileWriter(clinu,true); // apunta al fichero
                        // el 'true' indica que no se sobreescribe el el fichero si ya existe
                        PrintWriter salida=null;

                        salida=new PrintWriter(fichero);
                    
                            salida.println((contador+1)+".- "+linea);

                        fichero.close();
                        }

                    catch(Exception e){
                        System.out.println("ERROR de excepción: "+e.getMessage());
                    }

                    contador++;
                    linea=entrada.readLine();

            }

            System.out.println((contador>0)?"Se ha realizado la grabación":"El fichero de clientes estaba vacío.");

        } // fin del try
        catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }// fin del catch  

    } // fin de numerar()

} // fin de la clase principal