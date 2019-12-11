package tema3;

public class Matematicas {
    int num1;
    int num2;
    
    // PI sería un atributo de clase (común a todos los objetos)
    static double PI=3.1416;

    // Método constructor de la clase 'Matematicas'
    public Matematicas(int valor1,int valor2){
        this.num1=valor1;
        this.num2=valor1;
    }

    /* ***** MÉTODOS NO ESTÁTICOS ***** */

    // Método de operación no estático (suma)
    public int sumar(){
        return num1+num2;
    }

    // Método de operación no estático (resta)
    public int restar(){
        return num1-num2;
    }

    // Método de operación no estático (multiplicación)
    public int multiplicar(){
        return num1*num2;
    }

    // Método de operación no estático (división)
    public int dividir(){
        if (num2!=0){
            return num1/num2;
        }
        else{
            return 0;
        }
    }

    // ******* MÉTODOS ESTÁTICOS ********

    // Método de operación ESTÁTICO (suma)
    public static int sumarEstatico(int op1,int op2){
        // return num1+num2; no se puede usar así porque el método es estático y 'num1' y 'num2' porque son dinámicos
        int suma;
        suma=op1+op2;
        return suma;
    }
    // Método de operación ESTÁTICO (resta)
    public static int restarEstatico(int op1,int op2){
        return op1-op2;
    }    
    // Método de operación ESTÁTICO (multiplicación)
    public static int multiEstatico(int op1,int op2){
        return op1*op2;
    }
    // Método de operación ESTÁTICO (división)
    public static int diviEstatico(int op1,int op2){
        if (op2!=0){
            return op1/op2;
        }
        else{
            return 0;
        }
    }                
}