package tema4;

public class PruebaHerencia {
public static void main(String[] args) {
    

    // creación de instancias de la superclase Vehiculot4 y de las subclases TurismoT4, DeportivoT4 y FurgonetaT4

    VehiculoT4 miVehiculo = new VehiculoT4("4050 ABJ","VW","GTI","Blanco",100);
    TurismoT4 miTurismo = new TurismoT4("4060 TUR","Skoda","Fabia","Blanco",90,2,false);
    DeportivoT4 miDeportivo = new DeportivoT4("4070 DEP","Ford","Mustang","Rojo",150,2000);
    FurgonetaT4 miFurgoneta = new FurgonetaT4("4080 FUR","Fiat", "Ducato","Azul",80,1200,8);

    // invocación del método getAtributosT4() de cada objeto

    System.out.println("Vehículo : "+miVehiculo.getAtributosT4());

    // miVehiculo es una instancia de la clase VehiculoT4, se
    // invoca el método getAtributosT4() de VehiculoT4 (Polimofrismo)

    System.out.println("Turismo " + miTurismo.getAtributosT4());

    // miTurismo es una instancia de la clase Turismo, se
    // invoca el método getAtributosT4() de TurismoT4 (Polimofrismo)

    System.out.println("Deportivo " +miDeportivo.getAtributosT4());

    // miDeportivo es una instancia de la clase Deportivo,
    // se invoca el método getAtributosT4() de DeportivoT4 (Polimofrismo)

    System.out.println("Furgoneta " +miFurgoneta.getAtributosT4());

    // miFurgoneta es una instancia de la clase Furgoneta,
    // se invoca el método getAtributosT4() de FurgonetaT4 (Polimofrismo)


    // el objeto 'miTurismo' pertenece a la subclase 'TurismoT4', es un vehículo y puede invocar a los métodos de la
    // superclase VehiculoT4: getMatricula(), getMarca() y getModelo()

    System.out.println("Turismo : " +miTurismo.getMatricula()+" "+miTurismo.getMarca()+" "+miTurismo.getModelo());

    
    // COMPATIBILIDAD DE TIPOS
    
    // Ascendente ('upcasting'). Podemos convertir un objeto de la clase padre en uno de la clase hija

    VehiculoT4 miVehiculo2=new VehiculoT4("4090 TUR","Skoda", "Fabia","Negro",90.0);
    System.out.println("Clase inicial del objeto: "+miVehiculo2.getClass()+" Apunta a "+miVehiculo2);
    miVehiculo2 = new TurismoT4("4090 TUR","Skoda", "Fabia","Negro",90.0,2,true);
    // usa el getAtributos de la clase hija (en este caso de 'TurismoT4')
    System.out.println("Vehículo " +miVehiculo2.getAtributosT4()+"\nClase del objeto: "+miVehiculo2.getClass()+" Apunta a "+miVehiculo2);
    
    VehiculoT4 miVehiculo3 = miTurismo;
    System.out.println("Vehículo " +miVehiculo3.getAtributosT4()+"\nClase del objeto: "+miVehiculo3.getClass()+" Apunta a "+miVehiculo3);

    // Descendente ('downcasting'). Si quisieramos asignar uno de estos objetos miVehiculo transformados en TurismoT4
    // a un objeto de la clase turismo habría que hacer una conversión a este tipo porque no lo toma de forma directa.
    // Al parecer, esto no es del todo correcto y puede provocar fallos de compilación y errores en el programa

    VehiculoT4 miVehiculo4=new VehiculoT4("1234 VEH","Chevrolet", "Camaro","Negro",100.0);
    System.out.println("Vehículo " +miVehiculo4.getAtributosT4()+"\nClase del objeto: "+miVehiculo4.getClass()+" Apunta a "+miVehiculo4);
    
    TurismoT4 miTurismo4;

    // Esto NO FUNCIONA porque no permite asignar tipos diferentes, hace falta conversión de tipos
    // miTurismo4=miVehiculo4;
    
    // El siguiente código da error de excepción al ejecutarlo aunque el IDE nos permita compilarlo sin mostrar ni siquiera 'warning':
    // "Exception in thread "main" java.lang.ClassCastException: tema4.VehiculoT4 cannot
    // be cast to tema4.TurismoT4 at tema4.PruebaHerencia.main(PruebaHerencia.java:69)"

    // miTurismo4=(TurismoT4)miVehiculo4; 

    // La única forma de que funcione bein es igualarlo a un objeto de clase 'TurismoT4'
    miTurismo4=miTurismo;
    System.out.println("Turismo " +miTurismo4.getAtributosT4()+"\nClase del objeto: "+miTurismo4.getClass()+" Apunta a "+miTurismo4);

    
    }
}