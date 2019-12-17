package tema5;

public class ClasesAsociadas {

    public static void saludo(String nom){
        System.out.println("Hola "+nom+".");
    }

    public static void suma(int n1,int n2){
        System.out.println(n1+n2);
    }
    public static void main(String[] args) {
        
        saludo("Isidoro");
        
        // los tipos primitivos tienen clases asociadas que nos permiten realizar métodos de forma directa
        // como puede ser la conversión de un objeto de esa clase con los métodos ya incluidos
        Character letra=new Character('i');
        saludo(letra.toString());

        char letra2='A';
        // saludo(letra2); // no funciona porque no es String y no es un objeto con funcionalidad directa de conversión con .toString()
        String cadena = Character.toString(letra2); // así lo podríamos convertir a String y usarlo luego con nuestro método 'saludo()''
        saludo(cadena);

        // probamos ahora la clase asociada a 'int', 'Integer'
        
        Integer numero=new Integer("100"); // definimos objeto 'numero' de clase 'Integer' con valor String "100" que se convierte directamente en 'int'

        saludo(numero.toString()); // al ser objeto, podemos usarlo en nuestro método 'saludo()' transformándolo con .toString()

        int numero2=100; // definimos para las pruebas otro entero

        suma(numero,numero2); // usamos el método creado para imprimir su suma

        // podemos usar "==" para comparación cuando sean tipos primitivos
        if (numero==numero2){
            System.out.println("Los dos números son iguales");
        }
        else {
            System.out.println("Los dos números no son iguales");
        }

        // pero cuando se trata de una clase asociada o un tipo complejo como String hay que usar el método .equals()
        // al usar "==" se comparan los objetos, no su valor y por eso dice que son DISTINTOS
        Integer numero3=new Integer("100");
        if (numero==numero3){
            System.out.println("Los dos números son iguales");
        }
        else {
            System.out.println("Los dos números no son iguales");
        }


        // con '.equals()'' lo que comparamos es el contenido de esos objetos
        if (numero.equals(numero3)){
            System.out.println("Los dos números son iguales");
        }
        else {
            System.out.println("Los dos números no son iguales");
        }

    } // final del 'main()'
    
} // final de la clase 'ClasesAsociadas'