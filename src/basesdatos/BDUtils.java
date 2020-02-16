package basesdatos;

/* métodos comunes para manejo de bases de datos */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class BDUtils {

    public boolean conectado=false;

    public static Connection Conecta (BBDD bdatos){

        String urlconexion = "";
        String driver = "";
        Connection con = null;
        
        // estructura de la url de conexión: protocolo://servidor:puerto/basedatos

        if(bdatos.getType().equals("mysql")){
            driver = "com.mysql.cj.jdbc.Driver";
            urlconexion = "jdbc:mysql://"+bdatos.getDireccion()+":"+bdatos.getPuerta()+"/"+bdatos.getNombrebd()+"?serverTimezone=UTC";
            System.out.println(urlconexion);
        }
        else if(bdatos.getType().equals("oracle")){
            driver = "oracle.jdbc.driver.OracleDriver";
            urlconexion = "jdbc:oracle:thin:"+bdatos.getDireccion()+":"+bdatos.getPuerta()+":"+bdatos.getNombrebd()+"?serverTimezone=UTC";
            System.out.println(urlconexion);
        }
         
        try {
            
            System.out.println("Conectando...");

            Class.forName(driver);

            con = DriverManager.getConnection(urlconexion, bdatos.getUser(), bdatos.getContrasena());
            System.out.println("Conectado.");

        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return con;

    } // final del método Conecta(String)

    public static void desconecta(Connection con){
        try {
            if (con != null) {
                System.out.println("Desconectando...");
                con.close();
                System.out.println("Desconectado.");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    } // fin de desconecta(Connection)




    // alta
    public static void alta(Connection con, Contacto contacto) {
        
        String query="INSERT INTO agenda (codigo,nombre,telefono) VALUES ('"+contacto.getCodigo()+"','"+contacto.getNombre()+"','"+contacto.getTelefono()+"')";
        try {
            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);
            System.out.println("Insertado");
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

    }

    // baja
    public static void baja(Connection con) {

        System.out.println("Indica el número del registro que quieres eliminar: ");
        int registro=LeeTeclado.readInt();

        String query="DELETE FROM agenda WHERE codigo = '"+registro+"'";

        try {
            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate(query);
            System.out.println("Borrado el registro número "+registro);
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

    }

    // modificacion
    public static void modificacion() {

    }

    // consulta
    public static ArrayList<Contacto> consulta(Connection con) {
        // parecido a select.java pero guardando los resultados en un ArrayList
        System.out.println("** CONSULTA **");
        ArrayList<Contacto> resultado = new ArrayList<Contacto>();
        int codigo;
        String nombre;
        String telefono;
        Contacto contacto;
        try {
            // El "TUNEL" ya lo tenemos, que es la variable "con"
            // 1. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 2. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            ResultSet rs = stmt.executeQuery("SELECT * FROM agenda");
            // 3. Recuperar los resultados ("Vagones de vuelta")
            while (rs.next()) {

                codigo = rs.getInt("codigo");
                nombre = rs.getString("nombre");
                telefono = rs.getString("telefono");
                contacto = new Contacto(codigo, nombre, telefono);
 
                resultado.add(contacto);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return resultado;
    }

    public static void escribirResultados(ArrayList<Contacto> listaContactos) {
        // recorrer el ArrayList y escribirlo por pantalla
        //System.out.println("escribirResultados");
        int codigo;
        String nombre;
        String telefono;
        Contacto contacto;
        for (int i = 0; i < listaContactos.size(); i++) {
            contacto = listaContactos.get(i);
            codigo = contacto.getCodigo();
            nombre = contacto.getNombre();
            telefono = contacto.getTelefono();
            System.out.println(codigo + ": " + nombre + " --> " + telefono);
        }
    }

	public static Contacto pedirContacto() {
        Contacto contact=new Contacto(0,"","");
        System.out.println("Introduce el código del registro: ");
        contact.setCodigo(LeeTeclado.readInt());
        System.out.println("Introduce el nombre a guardar: ");
        contact.setNombre(LeeTeclado.readStr());
        System.out.println("Introduce el teléfono: ");
        contact.setTelefono(LeeTeclado.readStr());
		return contact;
	}



    
}