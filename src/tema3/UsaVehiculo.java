package tema3;

public class UsaVehiculo{
    public static void main(String[] args) {
        // Instanciamos un objeto de clase 'Vehiculo'
        Vehiculo vehiculo1=new Vehiculo("4050 ABJ","VW", "GTI","Blanco",100.0);
        System.out.println(vehiculo1);
        System.out.println(vehiculo1.getMatricula());

        if (vehiculo1.getDisponible()==true){
            System.out.println("El vehículo está disponible.");
        }
        else {
            System.out.println("El vehículo NO está disponible.");
        }
        
        vehiculo1.setDisponible(true);

        if (vehiculo1.getDisponible()==true){
            System.out.println("El vehículo está disponible.");
        }
        else {
            System.out.println("El vehículo NO está disponible.");
        }

    }
}