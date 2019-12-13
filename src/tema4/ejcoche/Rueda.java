package tema4.ejcoche;

public class Rueda {
    // atributo de la clase
    private String diametro;
    private double presion;

    // método constructor de la clase
    public Rueda(String diametro, double presion) {
        this.diametro = diametro;
        this.presion = presion;
    }

    // getter/setter de la clase
    public String getDiametro() {
        return diametro;
    }
    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public double getPresion() {
        return presion;
    }
    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    // ********** OTROS MÉTODOS ***************

    // métodos para bajar 0.1 la presión cada vez que se ejecuten
    public void subirPresion(){
        this.presion+=0.1;
    }
    public void bajarPresion(){
        this.presion-=0.1;
    }

} // final de la clase 'Rueda'