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
                    if(listado.size()>0){
                        modificaCliente(listado);
                    }
                    else{
                        System.out.print("No es posible modificar ya que el listado no tiene ninguna entrada.");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    listaCliente(listado);
                    break;
                case 5:
                    break;    
                case 6:
                    System.out.print("Saliendo del programa...");    
                    break;
                default:
                    System.out.print("La opción introducida no es válida");
            }            

        }while(opcion!=6);

        LeeTeclado.cierraSc();
        
    } // fin  del main

    public static void opcionesmenu(){
        
        ArrayList<String> opciones=new ArrayList<String>();

        System.out.print("¿Qué quieres hacer?\n");

        opciones.add("1. Añadir un cliente.\n");
        opciones.add("2. Modificar un cliente.\n");
        opciones.add("3. Borrar un cliente.\n");
        opciones.add("4. Listar los clientes.\n");
        opciones.add("5. Buscar un cliente.\n");
        opciones.add("6. Salir del programa.\n");

        for (int i=0;i<opciones.size();i++){
            System.out.print(opciones.get(i));
        }


    } // fin de opcionesmenu()

    public static void listaCliente(ArrayList<Cliente> lista){

        String salida="";

        System.out.print("\nHay "+lista.size()+" clientes listados.\n");
        for (int i=0;i<lista.size();i++){
            salida="Cliente nº"+i+" NIF: "+lista.get(i).getNif()+" Nombre: "+lista.get(i).getNombre()+" ";
            salida+="Apellidos: "+lista.get(i).getApellidos()+"";
            System.out.print(salida);
            System.out.print("\n");

        }

    } // fin de listaCliente()

    // sobrecarganmos el método listaCliente para mostrar un cliente concreto a partir de su posición
    public static void listaCliente(ArrayList<Cliente> lista,int posicion){

        String salida="";

        salida="Cliente nº"+posicion+" NIF: "+lista.get(posicion).getNif()+" Nombre: "+lista.get(posicion).getNombre()+" ";
        salida+="Apellidos: "+lista.get(posicion).getApellidos()+"\n";
        System.out.print(salida);

    } // fin de listaCliente()

    public static void insertaCliente(ArrayList<Cliente> lista){
        int pos;
        String correcto="";
        String otroins="";

        
        
        do {

            Cliente clienteins=new Cliente("", "", "");

            do{
                
                listaCliente(lista);

                if (lista.size()>0){
                    System.out.print("\n¿En qué posición quieres añadir el nuevo cliente?");
                    pos=LeeTeclado.readInt();
                    if (pos>=lista.size()){
                        System.out.print("\nEsa posición está vacía. El cliente se añadirá a continuación del último.");
                        pos=lista.size();
                    }
                }
                else{
                    System.out.print("El listado está vacío. Este será el primer cliente.\n");
                    pos=0;
                }
                System.out.print("\n");
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

                if (!(correcto.equals("s")||correcto.equals("S"))){
                    System.out.print("\nVuelve a introducir los datos.\n");
                }

            }while(!(correcto.equals("s")||correcto.equals("S")));

            if (pos>=lista.size()){
                lista.add(clienteins);
            }
            else{
                lista.add(pos,clienteins);
            }
            
            System.out.print("¿Quieres introducir otro cliente nuevo (s/n)?");
            otroins=LeeTeclado.readStr();

        }while (otroins.equals("s")||otroins.equals("S"));

    } // fin de insertaCliente(ArrayList<Cliente> lista)


    public static void modificaCliente(ArrayList<Cliente> lista){
        int pos;
        String correcto="";
        String otromod="";
        
        do {

            Cliente clienteins=new Cliente("", "", "");

            do{
                
                listaCliente(lista);

                do{
                    System.out.print("\n¿Qué cliente quieres modificar (indica su número)?");
                    pos=LeeTeclado.readInt();

                    if((pos+1)>lista.size()){
                        System.out.print("ERROR: La posición indicada es incorrecta. Introduce una entre 0 y "+(lista.size()-1));  
                    }
                }while((pos+1)>lista.size());

                listaCliente(lista,pos);

                System.out.print("\n");
                System.out.print("Introduce el nuevo NIF del nuevo cliente: ");
                clienteins.setNif(LeeTeclado.readStr());
                System.out.print("Introduce el nuevo nombre del nuevo cliente: ");
                clienteins.setNombre(LeeTeclado.readStr());
                System.out.print("Introduce los nuevos apellidos del nuevo cliente: ");
                clienteins.setApellidos(LeeTeclado.readStr());

                System.out.print("\nHas introducido estos nuevos datos:\n");
                System.out.print("Posición: "+pos+" NIF: "+clienteins.getNif()+" Nombre: "+clienteins.getNombre()+" Apellidos: "+clienteins.getApellidos()+".\n");

                System.out.print("Si los datos son correctos se grabarán de forma definitiva sustituyendo los anteriores.\n¿SON CORRECTOS (s/n)");
                correcto=LeeTeclado.readStr();

                if (!(correcto.equals("s")||correcto.equals("S"))){
                    System.out.print("\nVuelve a introducir los datos.\n");
                }

            }while(!(correcto.equals("s")||correcto.equals("S")));

            lista.set(pos,clienteins);
            
            System.out.print("¿Quieres modificar los datos de otro cliente (s/n)? ");
            otromod=LeeTeclado.readStr();

        }while (otromod.equals("s")||otromod.equals("S"));

    } // fin de modificaCliente(ArrayList<Cliente> lista)

    
} // fin de la clase principal