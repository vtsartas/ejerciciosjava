package tema4;

public class MisVehiculosT4 {
    public static void main(String[] args) {
        // se crean dos instancias de la clase Vehiculo
        VehiculoT4 vehiculo1 = new VehiculoT4("4050 ABJ","VW","GTI","Blanco",100.0);
        VehiculoT4 vehiculo2 = new VehiculoT4("2345 JVM","SEAT","León","Negro",80.0);
    
        // se crea una instancia de la clase Cliente
        ClienteT4 cliente1 = new ClienteT4("30435624X", "Juan", "Pérez");
        
        // se crea una instancia de la clase VehiculoAlquiladoT4 que
        // relaciona al cliente1 con el vehiculo1, el vehículo se
        // alquila con fecha 11/11/2011 durante 2 días
        VehiculoAlquiladoT4 alquiler1 = new VehiculoAlquiladoT4(cliente1,vehiculo1,11,11,2011,2);

        
        // pruebas
        // primero accedemos al nivel del objeto y luego descendemos al del atributo
        System.out.println(vehiculo2);
        System.out.println(alquiler1);
        System.out.println(alquiler1.getVehiculoT4().getMarca());
        System.out.println(alquiler1.getTotalDiasAlquiler());
        System.out.println(alquiler1.getClienteT4().getApellidos());
        System.out.println(alquiler1.getAnyoAlquiler());
        alquiler1.getClienteT4().setNombre("Luis");
        System.out.println(alquiler1.getClienteT4().getNombre());

        // prueba del libro
        System.out.println("\nVehículo alquilado");
        System.out.println("Cliente : "+alquiler1.getClienteT4().getNif()+" "+alquiler1.getClienteT4().getNombre()+" "+alquiler1.getClienteT4().getApellidos());
        System.out.println("Vehículo: "+alquiler1.getVehiculoT4().getMatricula());

        // de otra forma
        System.out.println("\nVehículo alquilado (otra forma)");
        // obtenemos primero la parte de las clases 'ClienteT4' y 'VehiculoT4'
        // ya creados enlazando a la parte correspondiente del objeto ya creado
        ClienteT4 clienteAux=alquiler1.getClienteT4();
        System.out.println("Cliente : "+clienteAux.getNif()+" "+clienteAux.getNombre()+" "+clienteAux.getApellidos());
        VehiculoT4 vehiculoeAux=alquiler1.getVehiculoT4();
        System.out.println("Vehículo: "+vehiculoeAux.getMatricula());
        //VehiculoAlquiladoT4 alquiler2


    
    } // fin del 'main()'
    
} // fin de la clase 'MisVehiculosT4'