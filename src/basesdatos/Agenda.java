package basesdatos;

import java.sql.Connection;
import java.util.ArrayList;

/* Agenda: gestión de una agenda de contactos, alta, baja, modificación y consulta.
    - Hace uso de la libreria bdutil.java
    - Vamos a separar la presentación de datos de la lógica del programa
    - Aprovechamos la POO para encapsular los datos y pasarlos como parámetros
    - Creamos una clase llamada Contacto
    - No implementamos el tema de internacionalización (i18n) */

public class Agenda {

    public static void main(String[] args) {
        LeeTeclado.iniSc();

        int opcion;

        // abrir conexión a la base de datos
        
        BBDD basededatos=new BBDD("mysql", "remotemysql.com", 3306, "nbgLStOY8W", "nbgLStOY8W", "DrifWtYlGz");

        Connection conexion=BDUtils.Conecta(basededatos);

        if (conexion != null) {
            
            do {
                opcionesmenu();
                System.out.print("Indica la opción que deseas usar: ");
                opcion = LeeTeclado.readInt();
                //
                switch (opcion) {
                    case 1:
                        BDUtils.alta(conexion);   
                        break;
                    case 2:
                        BDUtils.baja(conexion);
                        break;
                    case 3:
                        BDUtils.modificacion(conexion);
                        break;
                    case 4:
                        BDUtils.escribirResultados(BDUtils.consulta(conexion));
                        break;
                    case 0:
                        break;
                    default:
                        break;
                }
    
            } while (opcion != 0);

        } else {
            System.out.println("Error al conectar a la base de datos");
        }
        
        BDUtils.desconecta(conexion);
    
    } // fin del main()

    public static void opcionesmenu(){
        
        ArrayList<String> opciones=new ArrayList<String>();

        System.out.println("\n=========== AGENDA ===========");

        opciones.add("1. Alta.");
        opciones.add("2. Baja.");
        opciones.add("3. Modificación.");
        opciones.add("4. Consulta.");
        opciones.add("0. Salir del programa.");

        for (int i=0;i<opciones.size();i++){
            System.out.println(opciones.get(i));
        }
    } // fin de opcionesmenu()

} // fin de la clase principal 'Agenda'