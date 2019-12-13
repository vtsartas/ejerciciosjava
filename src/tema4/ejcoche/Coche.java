package tema4.ejcoche;

public class Coche {
    // atributos de la clase...
    private String marca;
    private String modelo;
    private String color;
    // ... que terminamos pro COMPOSICIÓN con los de las otras clases definidas
    private Motor motorizacion; // objeto de la clase 'Motor'
    private Puerta puerta; // objeto de la clase Puerta
    private Rueda rueda; // objeto de la clase Rueda

    // método constructor de la clase
    public Coche(String marca, String modelo, String color, Motor motorizacion, Puerta puerta, Rueda rueda) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motorizacion = motorizacion;
        this.puerta = puerta;
        this.rueda = rueda;
    }

    // getters/setters de la clase compuesta 'Coche'
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotorizacion() {
        return motorizacion;
    }
    public void setMotorizacion(Motor motorizacion) {
        this.motorizacion = motorizacion;
    }

    public Puerta getPuerta() {
        return puerta;
    }
    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Rueda getRueda() {
        return rueda;
    }
    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }
    
    // *********** OTROS MÉTODOS *********************

    // obtener una cadena de caracteres con todos los atributos del coche
    public String getAtributosCoche() {
        return "Marca: " + this.marca +
        " Modelo: " + this.modelo +
        " Color: " + this.color +
        " \nMotor: Combustible:" + this.motorizacion.getCombustible() +
        " Cilindrada: " + this.motorizacion.getCilindrada()+
        " Potencia: "+this.motorizacion.getPotencia()+
        " Puerta: Elevalunas: "+this.puerta.isElevalunasElectrico()+
        " Rueda: Diámetro: "+this.rueda.getDiametro()+
        " Presión por defecto: "+this.rueda.getPresion();

    }

}