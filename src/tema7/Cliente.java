package tema7;

public class Cliente{
    String nif;
    String nombre;
    String apellidos;
    int edad;

    // método constructor
    public Cliente(String nif, String nombre, String apellidos, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad=edad;
    }

    public String getNif() {return nif;}
    public void setNif(String nif) {this.nif = nif;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    
} // fin de la clase Cliente{}