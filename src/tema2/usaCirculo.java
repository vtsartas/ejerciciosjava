package tema2;

import tema3.Circulo; // importamos la clase del paquete 'tema3'

public class UsaCirculo{
    public static void main(String[] args) {
        Circulo circulo1=new Circulo();
        Circulo circulo2=new Circulo();
        Circulo circuloCopia; // Será la auxiliar para conservar objetos
        
        // Al imprimir el objeto creado nos devuelve la clase y la dirección de memoria reservada para su contenido
        System.out.println("circulo1: "+circulo1);
        System.out.println("circulo2: "+circulo2);
        
        // Damos valores a los dos objetos
        circulo1.posx=0;
        circulo1.posy=0;
        circulo1.radio=10;
        
        circulo2.posx=0;
        circulo2.posy=0;
        circulo2.radio=10;

        // comprobar si el objeto 'circulo1' es igual a 'circulo2'
        if (circulo1==circulo2){
            System.out.println("circulo1 y circulo2 son iguales");
        }
        else {
            System.out.println("circulo1 y circulo2 son distintos");
        }

        // comparamos uno de los atributos de ambos círculos
        if (circulo1.posx==circulo2.posx){
            System.out.println("Los valores de circulo1.posx y circulo2.posx son iguales");
        }
        else {
            System.out.println("Los valores de circulo1.posx y circulo2.posx son distintos");
        }

        // Para conservar 'circulo1' usamos un objeto auxiliar

        circuloCopia=circulo1;
        
        // ¿Cómo hacemos que el objeto 'circulo1' sea igual a 'circulo2'? Les damos la misma referencia

        circulo1=circulo2;

        // Mostramos las nuevas referencias y comparamos
        System.out.println("circulo1: "+circulo1);
        System.out.println("circulo2: "+circulo2);
        System.out.println("circuloCopia: "+circuloCopia);

        if (circulo1==circulo2){
            System.out.println("circulo1 y circulo2 son iguales");
        }
        else {
            System.out.println("circulo1 y circulo2 son distintos");
        }

        // Al ser el mismo objeto (aunque con dos nombres), si modificamos los atributos con un nombre lo hacemos en los dos
        circulo1.posx=10;
        circulo2.posy=15;
        System.out.println("Al asignar el valor 10 a circulo1.posx= "+circulo1.posx+" cambia también el de circulo2.posx= "+circulo2.posx);
        System.out.println("Al asignar el valor 15 a circulo2.posy= "+circulo2.posy+" cambia también el de circulo1.posy= "+circulo1.posy);
        System.out.println("Sin embargo, 'circuloCopia' sí mantiene los valores iniciales de 'circulo1' al apuntar a donde antes estaba.\ncirculoCopia.posx= "+circuloCopia.posx+" circuloCopia.posy= "+circuloCopia.posy);

        
    } // Fin del 'main'

} // fin de la clase usaCirculo