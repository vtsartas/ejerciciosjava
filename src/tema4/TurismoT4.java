package tema4;

// creamos la clase extendida 'TurismoT4' que usa la superclase 'VehiculoT4'
public class TurismoT4 extends VehiculoT4{
    
    // estos son atributos extendidos que no estaban en la clase inicial
    private int puertas;
    private boolean marchaAutomatica;

    // método constructor de la clase 'TurismoT4'
    public TurismoT4(String matricula,String marca,String modelo,String color,double tarifa,int puertas,boolean marchaAutomatica) {
        // 'super()' llama al constructor de la clase padre
        super(matricula, marca, modelo, color, tarifa);

        // construimos los astributos que hemos añadido para completar el constructor
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    // métodos ‘get’ de la subclase 'TurismoT4', se añaden a los que ya teníamos de 'VehiculoT4'
    public int getPuertas() {
        return this.puertas;
    }
    public boolean getMarchaAutomatica() {
        return this.marchaAutomatica;
    }
    
    // creamos un método para obtener todos los atributos del turismo, cuando se llame con la clase sobreescribe el de 'VehiculoT4'
    // es un POLIMORFISMO
    public String getAtributosT4() {
        return super.getAtributosT4() +" Puertas: " + this.puertas +" Marcha automática: " + this.marchaAutomatica;
    }

} // final de la clase extendida 'TurismoT4'