package tema8;

import java.util.ArrayList;

/**
 * Agenda
 */
public class Agenda {

    public static void main(String[] args) {
        LeeTeclado.iniSc();
        
        ArrayList<String> listaContactos = new ArrayList<String>();

        int opcion;
        String filtro;
        int numero;
        char respuesta;
        // leer los contactos del fichero contactos.txt
        AgendaLib.ReadContacts(listaContactos);
        do {
            AgendaLib.opcionesmenu();
            // pedir opción
            System.out.print("Dime opción: ");
            opcion = LeeTeclado.readInt();

            switch (opcion) {
                case 1:
                    AgendaLib.AddContact(listaContactos);
                    break;
                case 2:
                    AgendaLib.ListContacts(listaContactos);
                    break;
                case 3:
                    AgendaLib.SaveContacts(listaContactos);
                    break;
                case 4:
                    // filtro = entrada.nextLine(); // lee el intro 
                    System.out.print("Introduce un texto para buscar a un contacto: ");
                    filtro = LeeTeclado.readStr();
                    AgendaLib.SearchContacts(listaContactos, filtro);
                    break;
                case 5:
                    AgendaLib.ListContacts(listaContactos);
                    System.out.print("Introduce el número de contacto a borrar: ");
                    numero = LeeTeclado.readInt();
                    AgendaLib.RemoveContact(listaContactos, numero);
                    break;
                case 0:
                    break;

                default:
                    break;
            }

        } while (opcion != 0);
        if (AgendaLib.hayCambios) {
            // entrada.nextLine(); // lee el intro que se ha quedado en la entrada
            System.out.println("Hay cambios pendientes de guardar.");
            System.out.print("Guardar (S/N): ");

            respuesta = LeeTeclado.readChar(true);
            if (respuesta == 'S') { // comillas simples, porque es un caracter
                AgendaLib.SaveContacts(listaContactos);
            }
        }

        LeeTeclado.cierraSc();
        
    } // fin del main
    
} // fin de la clase principal