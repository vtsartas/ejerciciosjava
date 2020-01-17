package tema7;

import java.util.ArrayList;

public class ArrayListEJ{

    public static void main(String[] args) {

        ArrayList<String> coches=new ArrayList<String>();

        int i;

        coches.add(new String("Seat")); // una forma de añadir elementos al arraylist
        coches.add("Ford"); // otra forma
        coches.add("Renault");
        coches.add("Ferrari");
        coches.add("Seat");

        // podemos mostrar los valroes de uno en uno
        for (i=0;i<coches.size();i++){
            System.out.println(coches.get(i));
        }
        
        // las posiciones empiezan, como en los arrays, en '0'
        // con .add(int posición,valor) INSERTAMOS (no sustituimos) desplazando el de la posición y posteriores
        coches.add(3,"Porsche");

        // También se puede mostrar el objeto completo
        System.out.println(coches);

        // MODIFICAMOS un valor con .set(int posición,valor)
        coches.set(2,"Jaguar");

        System.out.println("set 2");
        System.out.println(coches);

        // ELIMINAMOS un valor en cualquier posición con .remove(int posición)
        coches.remove(1); // elimina el "Ford" y recompone la lista sin él

        System.out.println("remove 1");
        System.out.println(coches);

        // podemos borrar si encontramos un primer valor con .remove(valor) (SOLO BORRA EL PRIMERO QUE ENCUENTRE)
        if (coches.remove("Seat")){
            System.out.println("Borrado el Seat");
            System.out.println(coches);
        }

        // .clear() VACIAMOS por completo la lista
        coches.clear(); //

        System.out.println("clear");
        System.out.println(coches);



    }
}