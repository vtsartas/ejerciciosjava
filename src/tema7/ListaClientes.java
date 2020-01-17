package tema7;

/* Programa para controlar lista de clientes, con opciones para
    1. Añadir (pedir posición y nombre)
    2. Borrar (pedir posición)
    3. Listar clientes
    4. Modificar (pedir pos.)
    5. Salir

    el cliente será un objeto con argumentos NIF, nombre, apellido
 */

import java.util.ArrayList;

public class ListaClientes {

    public static void main(String[] args) {

        LeeTeclado.iniSc();

        int opcion=0;

        ArrayList<Cliente> listado=new ArrayList<Cliente>();

        System.out.print("PROGRAMA DE GESTIÓN DE CLIENTES\n");

        do {

            opcionesmenu(); // mostramos el menú de opciones

            opcion=LeeTeclado.readInt(); // leemos que opción queremos usar

            switch (opcion){
                case 1:
                    insertaCliente(listado);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    listaCliente(listado);
                    break;
                case 5:
                    System.out.print("Saliendo del programa...");    
                    break;
                default:
                    System.out.print("La opción introducida no es válida");
            }            

        }while(opcion!=5);

        LeeTeclado.cierraSc();
        
    } // fin  del main

    public static void opcionesmenu(){
        
        ArrayList<String> opciones=new ArrayList<String>();

        System.out.print("¿Qué quieres hacer?\n");

        opciones.add("1. Añadir un cliente.\n");
        opciones.add("2. Modificar un cliente.\n");
        opciones.add("3. Borrar un cliente.\n");
        opciones.add("4. Listar los clientes.\n");
        opciones.add("5. Salir del programa.\n");

        for (int i=0;i<opciones.size();i++){
            System.out.print(opciones.get(i));
        }


    } // fin de opcionesmenu()

    public static void listaCliente(ArrayList<Cliente> lista){

        String salida="";

        System.out.print("\nHay "+lista.size()+" clientes listados.\n\n");
        for (int i=0;i<lista.size();i++){
            salida="Cliente nº"+i+" NIF: "+lista.get(i).getNif()+" Nombre: "+lista.get(i).getNombre()+" ";
            salida+="Apellidos: "+lista.get(i).getApellidos()+"\n";
            System.out.print(salida);
        }

    } // fin de listaCliente()

    public static void insertaCliente(ArrayList<Cliente> lista){
        int pos;
        String correcto="";
        String otroins="";

        boolean salir,salirins;

        Cliente clienteins=new Cliente("", "", "");
        
        do {

            salirins=false;

            do{
                
                salir=false;
                
                listaCliente(lista);

                if (lista.size()>0){
                    System.out.print("\n¿En qué posición quieres añadir el nuevo cliente?");
                    pos=LeeTeclado.readInt();
                }
                else{
                    pos=0;
                }
                System.out.print("Introduce el NIF del nuevo cliente: ");
                clienteins.setNif(LeeTeclado.readStr());
                System.out.print("Introduce el nombre del nuevo cliente: ");
                clienteins.setNombre(LeeTeclado.readStr());
                System.out.print("Introduce los apellidos del nuevo cliente: ");
                clienteins.setApellidos(LeeTeclado.readStr());

                System.out.print("\nHas introducido estos datos para el nuevo cliente:\n");
                System.out.print("Posición: "+pos+" NIF: "+clienteins.getNif()+" Nombre: "+clienteins.getNombre()+" Apellidos: "+clienteins.getApellidos()+".\n");

                System.out.print("Si los datos son correctos se grabarán de forma definitiva.\n¿SON CORRECTOS (s/n)");
                correcto=LeeTeclado.readStr();

                if (correcto.equals("s")||correcto.equals("S")){
                    salir=true;
                }
                else{
                    System.out.print("Vuelve a introducir los datos.\n");
                }

            }while(!salir);

            lista.add(pos,clienteins);
            
            System.out.print("¿Quieres introducir otro nuevo cliente (s/n)? ");
            otroins=LeeTeclado.readStr();

            if (otroins.equals("s")||otroins.equals("S")){
                salirins=true;
            }

        }while (!salirins);

    }

    
} // fin de la clase principal