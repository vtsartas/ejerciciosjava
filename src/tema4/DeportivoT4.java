package tema4;

public class DeportivoT4 extends VehiculoT4 {
    
    private int cilindrada;
    
    public DeportivoT4(String matricula,String marca,String modelo,String color,double tarifa,int cilindrada) {
        // recogemos los atributos del padre con el constructor de la clase 'VehiculoT4'
        super(matricula, marca, modelo, color, tarifa);
        
        // añadimos el constructor del nuevo atributo añadido en 'DeportivoT4'
        this.cilindrada = cilindrada;
    }
    
    // métodos ‘get’ de la subclase Deportivo
    public int getCilindrada() {
        return this. cilindrada;
    }

    // método para obtener los atributos del 'DeportivoT4', usa los de 'VehiculoT4' mediante 'super.getAtributosT4()'
    // se trata de un POLIMORFISMO con distinta funcionalidad que el original en la clase padre
    public String getAtributosT4() {
        return super.getAtributosT4()+" Cilindrada (cm3): "+this.cilindrada;
    }
}