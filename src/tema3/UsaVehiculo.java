package tema3;

import tema3.Vehiculo;

public class UsaVehiculo{
    
    // Creo un método estático para imprimir los atributos del objeto 'Vehiculo' que se le pase
    public static void imprVehiculo(Vehiculo vehiculoimpr) {
        System.out.print("Matrícula: "+vehiculoimpr.getMatricula()+" ");
        System.out.print("Marca: "+vehiculoimpr.getMarca()+" ");
        System.out.print("Modelo: "+vehiculoimpr.getModelo()+" ");
        System.out.print("Color: "+vehiculoimpr.getColor()+" ");
        System.out.print("Tarifa: "+vehiculoimpr.getTarifa()+" ");
        if (vehiculoimpr.getDisponible()){
            System.out.print("Vehículo DISPONIBLE\n");
        }
        else{
            System.out.print("Vehículo NO disponible\n");
        }
    }

    public static void main(String[] args) {
        // Instanciamos un objeto de clase 'Vehiculo'
        Vehiculo vehiculo1=new Vehiculo("4050 ABJ","VW", "GTI","Blanco",100.0);
        System.out.println("Datos de 'vehiculo1'");
        System.out.println("'vehiculo1' apunta a "+vehiculo1);
        imprVehiculo(vehiculo1); // imprimimos los atributos de 'vehiculo1' usando el método 'imprVehiculo' creado para ello

        // Podemos modificar y mostrar los atributos del objeto directamente...
        // ... pero lo recomentable usar métodos porque así podemos controlar que
        // los valores estén en los parámetros que exige el programa (p.ej. que el color esté entre los posibles)
        System.out.println("Modificamos su matrícula cambiando directamente el atributo.");
        vehiculo1.matricula="2646 FGX";
        imprVehiculo(vehiculo1);

        // Probamos a modificar y mostrar la tarifa mediante get/set
        System.out.println("Modificamos la tarifa mediante 'vehiculo1.setTarifa(90.0)'.");
        vehiculo1.setTarifa(90.0);
        imprVehiculo(vehiculo1);
        

        // Probramos a modificar la disponibilidad

        System.out.println("Modificamos la disponibilidad mediante 'vehiculo1.setDisponible(true)''.");
        vehiculo1.setDisponible(true); // modificamos mediate setDisponible
        
        // En la condicional no es necesario poner ""==true" si la función devuelve valores booleanos
        if (vehiculo1.getDisponible()){
            System.out.println("El vehículo está disponible.");
        }
        else {
            System.out.println("El vehículo NO está disponible.");
        }


        // Pruebas con 'null'. Declaramos un objeto sin instanciarlo (lo inicializamos a 'null').
        Vehiculo vehiculo2=null;
        System.out.println("\nInicialmente, 'vehiculo2' apunta a "+vehiculo2);

        if (vehiculo2==null){
            System.out.println("El objeto 'vehículo2' NO está instanciado (null).");
            // Lo instanciamos usando el constructor
            // Es diferente a la declaración de objeto + instanciación
            // No lleva el tipo "Variable" delante porque eso sería una declaración de objeto
            vehiculo2=new Vehiculo("1234 KPL","PEUGEOT", "COUPE","Rojo",120.0);
        }
        // Nos da un 'warning' por 'Dead code' (código muerto) si añadimos el 'else'
        // ya que al detectar por el valor ya asignado 'null' que nunca se va a ejecutar
        // este 'else', pero si procesar consumiendo procesador

        /* else {
            System.out.println("El objeto 'vehículo2' está instanciado.");
        } */

        // Comprobamos que, en efecto, ya no es 'null'
        System.out.println("Ahora, 'vehiculo2' apunta a "+vehiculo2);
        imprVehiculo(vehiculo2);

        // Probamos las referencias compartidas/alias
        Vehiculo vehiculo3=null; // Declaramos el objeto, que tiene valor 'null'
        System.out.println("\nInicialmente, 'vehiculo3' apunta a "+vehiculo2);
        vehiculo3=vehiculo2; // apuntamos 'vehiculo3' al objeto 'vehiculo2'
        System.out.println("Al hacer 'vehiculo3=vehiculo2;', 'vehiculo3' apunta a "+vehiculo3);
        // imprimimos parte del contenido de 'vehiculo3' para verificar que, en efecto, apunta al mismo objeto
        System.out.println("Datos de 'vehiculo3' una vez apunta a 'vehiculo2':");
        imprVehiculo(vehiculo3);

        // Usamos el método 'getAtributos()' definido en la clase 'Vehiculo'
        System.out.println("Atributos de ''vehiculo3' usando el método 'getAtributos':"+vehiculo3.getAtributos());

        



    } // final del método 'main'
} // final de la clase 'usaVehiculo'