package tema4.ejcoche;

public class Motor {

    // Definimos los atributos de la clase 'Motor'
    private int cilindrada;
    private int potencia;
    private String combustible;

    // Método constructor de la clase 'Motor'
    public Motor(int cilindrada, int potencia, String combustible) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.combustible = combustible;
    }


    // getters/setters
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }   


} // fin de la clase 'Motor'