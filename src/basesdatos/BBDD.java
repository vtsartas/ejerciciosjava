package basesdatos;

public class BBDD {

    private String type;
    private String direccion;
    private int puerta;
    private String nombrebd;
    private String user;
    private String contrasena;


    public BBDD(String type, String direccion, int puerta, String nombrebd, String user, String contrasena) {
        this.type = type;
        this.direccion = direccion;
        this.puerta = puerta;
        this.nombrebd = nombrebd;
        this.user = user;
        this.contrasena = contrasena;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public String getNombrebd() {
        return nombrebd;
    }

    public void setNombrebd(String nombrebd) {
        this.nombrebd = nombrebd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
}