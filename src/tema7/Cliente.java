package tema7;

public class Cliente{
    String nif;
    String nombre;
    String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNif() {return nif;}
    public void setNif(String nif) {this.nif = nif;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    
} // fin de la clase Cliente{}