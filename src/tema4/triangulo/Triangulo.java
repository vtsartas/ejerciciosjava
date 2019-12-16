package tema4.triangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    // método constructor de la clase 'Triangulo'

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    // getters/setters de la clase

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // ******** OTROS MÉTODOS *********

    public String getLados(){
        return "Has introducido lado1="+this.getLado1()+" lado2="+this.getLado2()+" lado3="+this.getLado3()+".";
    }

    public boolean esRectangulo(){
        double la1=this.getLado1();
        double la2=this.getLado2();
        double la3=this.getLado3();
        
        if (la1>la2 && la1>la3){
            if (la1*la1==(la2*la2)+(la3*la3)){
                return true;
            }
            else{
                return false;
            }
        }
        else if (la2>this.getLado3()){
            if (la2*la2==(la1*la1)+(la3*la3)){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            if (la3*la3==(la1*la1)+(la2*la2)){
                return true;
            }
            else{
                return false;
            }
        }
    } // fin del método 'esRectangulo()'

    public boolean esEscaleno(){
        double la1=this.getLado1();
        double la2=this.getLado2();
        double la3=this.getLado3();
        if ((la1!=la2) && (la2!=la3)){
            return true;
        }
        else {
            return false;
        }
    } // final del método escaleno

    public boolean esIsosceles(){
        double la1=this.getLado1();
        double la2=this.getLado2();
        double la3=this.getLado3();
        if ((la1==la2) || (la2==this.getLado3()) || (la1==la3)){
            return true;
        }
        else{
            return false;
        }  
    } // final de método isósceles

    public boolean esEquilatero(){

        if ((this.getLado1()==this.getLado2()) && (this.getLado2()==this.getLado3())){
            return true;
        }
        else{
            return false;
        }  
    } // final de método equilátero
    
    
}