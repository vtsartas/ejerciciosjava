package tema4;

public class ClienteT4 {
   
    // atributos privados de la clase solo accesibles mediante métodos públicos
    private String nif;
    private String nombre;
    private String apellidos;


    // Método constructor de la clase 'ClienteT4'
    public ClienteT4(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    } // final del método constructor de la clase 'ClienteT4'

    
    // métodos get/set de la clase
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    } 
    // final de los métodos get/set de la clase
    

}