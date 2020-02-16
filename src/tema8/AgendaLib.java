package tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/* librería con utilidades para Agenda.java */
public class AgendaLib {

    private static final String NOMBRE_FICHERO = "c:/contactos.txt";
    // Declaramos una variable "chivato" para controlar cuando hay cambios
    // Se inicializa a false y se pondría true cuando añadimos o borramos
    // Se pone otra vez a false cuando guardemos
    // La utilizamos para avisar si ha habido cambios cuando salimos
    public static boolean hayCambios = false;

    public static void opcionesmenu(){
        
        ArrayList<String> opciones=new ArrayList<String>();

        System.out.println("\n=========== AGENDA ===========");

        opciones.add("1. Añadir una persona.");
        opciones.add("2. Listado completo.");
        opciones.add(hayCambios?"3. Guardar datos.*":"3. Guardar datos.");
        opciones.add("4. Buscar en la agenda.");
        opciones.add("5. Borrar una persona de la agenda.");
        opciones.add("0. Salir del programa.");

        for (int i=0;i<opciones.size();i++){
            System.out.println(opciones.get(i));
        }


    } // fin de opcionesmenu()


    public static void AddContact(ArrayList<String> listaContactos) {
        String nombre="";
        String telefono="";
        // pedir todos los datos
        System.out.println("=== AÑADIR CONTACTO ===");
        System.out.print("Nombre: ");
        nombre = LeeTeclado.readStr();
        System.out.print("Teléfono: ");
        telefono = LeeTeclado.readStr();
        
        // Añadir contacto a la lista
        listaContactos.add(nombre + ": " + telefono);
        hayCambios = true;
    } // fin de AddContact()

    public static void ListContacts(ArrayList<String> listaContactos) {
        System.out.println("=== LISTADO DE CONTACTOS ===");
        for (int i = 0; i < listaContactos.size(); i++) {
            // recuperar nombre y teléfono de la lista de contactos
            System.out.println( (i+1) + ".- " + listaContactos.get(i));
        }
    } // fin de ListContacts

    public static void SaveContacts(ArrayList<String> listaContactos) {
        FileWriter fichero = null;
        PrintWriter salida = null;
        System.out.println("Guardando contactos...");
        try {
            // crear el fichero
            fichero = new FileWriter(NOMBRE_FICHERO, false);
            // abrir un canal de salida al fichero
            salida = new PrintWriter(fichero);

            // volcamos el contenido del array de contactos en el fichero
            for (int i = 0; i < listaContactos.size(); i++) {
                salida.println(listaContactos.get(i));
            }
        }
        catch (Exception e) {System.out.println("ERROR: " + e.getMessage());}

        // cerrar fichero
        try{fichero.close();}
        catch (Exception e) {System.out.println("ERROR: " + e.getMessage());}

        System.out.println("Contactos guardados");

        // reseteamos la variable que nos avisa de los cambios
        hayCambios = false;

    } // final de SaveContacts()

    public static void ReadContacts(ArrayList<String> listaContactos) {
        FileReader fichero = null;
        BufferedReader entrada = null;
        String linea;
        try {
            // abrir el fichero para lectura
            fichero = new FileReader(NOMBRE_FICHERO);
            // abrir un canal de lectura para el fichero
            entrada = new BufferedReader(fichero);
            // leer lineas del canal entrada
            System.out.println("Cargando contactos...");
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    // System.out.println(linea);
                    // Fichero --> ArrayList
                    listaContactos.add(linea);
                }
            } while (linea != null);
            fichero.close();
            System.out.println("Contactos cargados");
        } catch (Exception e) { // Exception es la más general de las excepciones
                                // Aqui salta cuando se produce cualquier excepción
            System.out.println("ERROR: " + e.getMessage());
        } // fin del try
    } // fin de ReadContacts

    public static void SearchContacts(ArrayList<String> listaContactos, String filtro) {
        String contacto;
        boolean encontrado = false; // presuponemos que no lo ha encontrado
        
        for (int i = 0; i < listaContactos.size(); i++) {
            // mostrar solamente los que cumplan con el filtro
            contacto = listaContactos.get(i);
            if (contacto.toUpperCase().contains(filtro.toUpperCase())) {
                // si contacto contiene la cadena filtro
                // antes pasamos contacto y filtro a mayúsculas
                // para evitar que sea sensible a mayúsculas/minúsculas
                System.out.println(contacto);
                encontrado = true; // lo ha encontrado
            } 
        }

        System.out.println("Contacto para el filtro '"+filtro+"'"+(encontrado?" ":" no ")+"encontrado.");

    } // fin de SearchContacts

    public static void RemoveContact(ArrayList<String> listaContactos, int numero) {
        listaContactos.remove(numero-1);
        System.out.println("Contacto número " + numero + " borrado.");
        hayCambios = true;
    } // fin de removeContact

    
} // fin de la clase principal