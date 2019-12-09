package tema3;

public class Circulo{

    // Le añadimos el alcance "public" para que los atributos sean alcanzables desde otros paquetes
    public int posx;
    public int posy;
    public int radio;

    public static final double PI = 3.1415926536;
    /*private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }*/
    
    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }
    
    public double calcularArea() {
        return PI * this.radio * this.radio;
    }

}
