package tema3;

public class Sobrecarga {
    
    // Declaramos los atributos a utilizar
    int num1,num2,num3;

    // método constructor
    public Sobrecarga(int num1, int num2) {
        // 'this.num1' es el atributo 'num1' de este objeto
        // 'num1' es el parámetro que le pasamos al contructor
        this.num1 = num1;
        this.num2 = num2;
        //this.num3=0;
    } // final del método constructor inicial

    // método de sobrecarga del método 'Sobrecarga'
    public Sobrecarga(int num1, int num2, int num3) {
        // 'this.num1' es el atributo 'num1' de este objeto
        // 'num1' es el parámetro que le pasamos al contructor
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    } // final del constructor sobrecargado con 3 parámetros

    // métodos de operación
    public int sumar() {
        return num1+num2;
    } // final del sumar()
    
    // sobrecargamos el método 'sumar()' poniéndole 3 parámetros
    public int sumar(String tipo) {
        if (tipo.equals("dos")){
            return num1+num2;
        }
        else if (tipo.equals("tres")){
            return num1+num2+num3;
        }
        else {
            return 0;
        }

        // No es correcto usar "==" para comparar String ya que solo sirve para tipos primitivos
        // El siguiente código funciona por casualidad por la forma en que Java almacena las cadenas (String Pool)
        // Si en lugar de recibir 'tipo' por parámetro lo hubiésemos obtenido de un Scanner no funcionaría
        // porque estaría comparando las referencias donde apunten los dos operandos comparados.
        // Más info: https://www.arquitecturajava.com/java-string-pool-un-concepto-importante/

        /* if (tipo=="dos"){ return num1+num2; }
        else if (tipo=="tres"){ return num1+num2+num3; }
        else {return 0;}*/

    } // final del sumar(String)

        
    // sobrecargamos el método poniento un parámetro de tipo 'ini'
    public int sumar(int incremento){
        return num1+num2+num3+incremento;
    } // final del método sumar(int)

} // final de la clase 'Sobrecarga'