package tema7;

/* Programa para controlar lista de clientes, con opciones para
        Añadir (pedir posición y nombre), Borrar (pedir posición)
        Listar clientes, Modificar (pedir pos.), Salir... (añado buscar)

    el cliente será un objeto con argumentos NIF, nombre, apellido
 */

import java.util.ArrayList;

public class ListaClientes {

    public static void main(String[] args) {

        LeeTeclado.iniSc();

        int opcion=0;

        ArrayList<Cliente> listado=new ArrayList<Cliente>();

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
                    if(listado.size()>0){
                        borraCliente(listado);
                    }
                    else{
                        System.out.print("No hay ningún cliente en la lista.");
                    }
                    
                    break;
                case 4:
                    if(listado.size()>0){
                        listaCliente(listado);
                    }
                    else{
                        System.out.print("La lista está vacía.");
                    }
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

        System.out.println("\nGESTIÓN DE CLIENTES");

        opciones.add("1. Añadir un cliente.");
        opciones.add("2. Modificar un cliente.");
        opciones.add("3. Borrar un cliente.");
        opciones.add("4. Listar los clientes.");
        opciones.add("5. Buscar un cliente.");
        opciones.add("6. Salir del programa.");

        for (int i=0;i<opciones.size();i++){
            System.out.println(opciones.get(i));
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

            

            do{

                Cliente clientemod=new Cliente("", "", "");
                
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
                clientemod.setNif(LeeTeclado.readStr());
                System.out.print("Introduce el nuevo nombre del nuevo cliente: ");
                clientemod.setNombre(LeeTeclado.readStr());
                System.out.print("Introduce los nuevos apellidos del nuevo cliente: ");
                clientemod.setApellidos(LeeTeclado.readStr());

                System.out.print("\nHas introducido estos nuevos datos:\n");
                System.out.print("Posición: "+pos+" NIF: "+clientemod.getNif()+" Nombre: "+clientemod.getNombre()+" Apellidos: "+clientemod.getApellidos()+".\n");

                System.out.print("Si los datos son correctos se grabarán de forma definitiva sustituyendo los anteriores.\n¿SON CORRECTOS (s/n)?");
                correcto=LeeTeclado.readStr();

                if (!(correcto.equals("s")||correcto.equals("S"))){
                    System.out.print("\nVuelve a introducir los datos.\n");
                }
                else{
                    System.out.print("\nModificación guardada correctamente.\n");
                    lista.set(pos,clientemod);
                }

            }while(!(correcto.equals("s")||correcto.equals("S")));
            
            System.out.print("¿Quieres modificar los datos de otro cliente (s/n)? ");
            otromod=LeeTeclado.readStr();

        }while (otromod.equals("s")||otromod.equals("S"));

    } // fin de modificaCliente(ArrayList<Cliente> lista)

    public static void borraCliente(ArrayList<Cliente> lista){
        int pos;
        String correcto="";
        String otromod="";
        
        do {

            listaCliente(lista);

            do{
                System.out.print("\n¿Qué cliente quieres eliminar (indica su número)?");
                pos=LeeTeclado.readInt();

                if(pos>=lista.size()){
                    System.out.print("ERROR: La posición indicada es incorrecta. Introduce una entre 0 y "+(lista.size()-1));  
                }
            }while(pos>=lista.size());

            System.out.println("Has solicitado la eliminación de este cliente: ");
            listaCliente(lista,pos);

            System.out.print("\n");

            System.out.print("¿Está seguro de eliminarlo (s/n)?");
            correcto=LeeTeclado.readStr();

            if (correcto.equals("s")||correcto.equals("S")){
                System.out.println("Cliente nº "+pos+" eliminado de forma correcta.");
                lista.remove(pos);
            }
            else{

            }
            
            System.out.println("¿Quieres eliminar los datos de otro cliente (s/n)? ");
            otromod=LeeTeclado.readStr();

        }while (otromod.equals("s")||otromod.equals("S"));

    } // fin de borraCliente(ArrayList<Cliente> lista)

    
} // fin de la clase principal