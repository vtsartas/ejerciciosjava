package tema3;

public class VariableLocal {

     // También podemos definir variables locales.
     // Pierden su valor dentro de los métodos si se definen variables con ese nombre
    static String texto="texto global";

    public static String saludo(String nombre){
        System.out.println("Variable global 'texto' en el método 'saludo()' antes de definir la local: "+texto);
        String texto="Buenos días ";
        System.out.println("Variable local 'texto' en el método 'saludo()': "+texto);
        String temp="variable local 'temp'";
        System.out.println(temp);
        return texto+nombre;    // El valor local de 'texto' solo tienen vigencia mientras está en el método
    } // fin del método 'saludo)'

    public static void main(String[] args) {
        
        System.out.println("Variable global 'texto' en el método 'main()' antes de definir la local: "+texto);
        
        String name="Isidoro";
        String texto="Prueba"; // comprobamos que aunque tiene el mismo nombre no afecta a la variable local del método 'saludo()'

        System.out.println(saludo(name));
        System.out.println("Variable local 'texto' en el método 'main()': "+texto);

        // System.out.println(temp);
        // No nos deja compilar si intentaemos usar la variable local 'temp' del método 'saludo()'
        // aquí mostrando el error "temp cannot be resolved to a variable"
    
    } // fin del 'main()'
    
} // fin de la clase 'VariableLocal'