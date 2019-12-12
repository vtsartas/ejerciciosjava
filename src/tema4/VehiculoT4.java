package tema4;

public class VehiculoT4 {
    
    // Atributos de la clase. Son solo son accesibles en la propia clase y con los métodos públicos definidos.
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    
    // Método constructor de la clase 'VehiculoT4'
    public VehiculoT4(String matricula,String marca,String modelo,String color,double tarifa){this.matricula = matricula;this.marca = marca;
        this.modelo = modelo;this.color = color;this.tarifa = tarifa;this.disponible = false;
    } // fin del método constructor de la clase 'VehiculoT4'

    // métodos ‘get’ y ‘set’ de la clase
    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public double getTarifa() {return tarifa;}
    public void setTarifa(double tarifa) {this.tarifa = tarifa;}

    public boolean isDisponible() {return disponible;}
    public void setDisponible(boolean disponible) {this.disponible = disponible;}
    // fin de los get/set de la clase

    // método para retornar los atributos del vehículo
    public String getAtributosT4() {
        return "Matrícula: "+this.matricula+" Modelo: "+this.marca+" "+this.modelo+" Color: "+this.color+" Tarifa: "+this.tarifa+" Disponible: "+this.disponible;
    }
  
} // fin de la clase 'VehiculoT4'