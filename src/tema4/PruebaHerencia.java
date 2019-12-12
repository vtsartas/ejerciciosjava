package tema4;

public class PruebaHerencia {

    // creación de instancias de la superclase Vehiculot4 y de las subclases TurismoT4, DeportivoT4 y FurgonetaT4

    VehiculoT4 miVehiculo = new VehiculoT4("4050 ABJ","VW", "GTI","Blanco",100.0);
    TurismoT4 miTurismo = new TurismoT4("4060 TUR","Skoda", "Fabia","Blanco",90.0,2,false);
    DeportivoT4 miDeportivo = new DeportivoT4("4070 DEP","Ford","Mustang","Rojo",150.0,2000);
    FurgonetaT4 miFurgoneta = new FurgonetaT4("4080 FUR","Fiat", "Ducato","Azul",80.0,1200,8);

    // invocación del método getAtributos() de cada objeto

    System.out.println(miVehiculo.getAtributos());
    System.out.println("Vehículo : " + miVehiculo.getAtributosT4());

    // miVehiculo es una instancia de la clase VehiculoT4, se
    // invoca el método getAtributos() de VehiculoT4

    System.out.println("Turismo " + miTurismo.getAtributosT4());

    // miTurismo es una instancia de la clase Turismo, se
    // invoca el método getAtributos() de Turismo

    System.out.println("Deportivo " +miDeportivo.getAtributosT4());

    // miDeportivo es una instancia de la clase Deportivo,
    // se invoca el método getAtributos() de Deportivo

    System.out.println("Furgoneta " +miFurgoneta.getAtributosT4());

    // miFurgoneta es una instancia de la clase Furgoneta,
    // se invoca el método getAtributos() de Furgoneta


    // el objeto 'miTurismo' pertenece a la subclase 'TurismoT4', es un vehículo y puede invocar a los métodos de la
    // superclase Vehiculo: getMatricula(), getMarca() y getModelo()

    System.out.println("Turismo : " +miTurismo.getMatricula()+" "+miTurismo.getMarca()+" "+miTurismo.getModelo());

}