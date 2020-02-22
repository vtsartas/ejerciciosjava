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
    public static void alta(Connection con) {
        
        Contacto contacto = BDUtils.pedirContacto();

        int registro=contacto.getCodigo();

        do{
            
            if (BDUtils.existeCodigo(con, registro)){
                System.out.println("El código que has indicado("+registro+") ya está siendo utilizado. Indica otro:");
                registro=LeeTeclado.readInt();
            }
            
        } while (BDUtils.existeCodigo(con, registro));
        
                    
        String query="INSERT INTO agenda (codigo,nombre,telefono) VALUES ('"+registro+"','"+contacto.getNombre()+"','"+contacto.getTelefono()+"')";
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
            
        if (!BDUtils.existeCodigo(con, registro)){
                System.out.println("El código que has indicado("+registro+") no existe.");
        }
        else{  
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
    }

    // modificacion
    public static void modificacion(Connection con) {

        System.out.println("Indica el número del registro que quieres eliminar: ");
        int registro=LeeTeclado.readInt();

        do{
            
            if (!BDUtils.existeCodigo(con, registro)){
                System.out.println("El código que has indicado("+registro+") no existe en la base de datos:");
                escribirResultados(consulta(con));
                System.out.println("Indica otro registro del listado para modificarlo:");

                registro=LeeTeclado.readInt();
            }
            
        } while (!BDUtils.existeCodigo(con, registro));

        System.out.println("Datos actuales del registro "+registro+":");

        escribirResultados(consulta(con, registro));

        System.out.println("Ahora indica lo que quieres modificar, pulsa INTRO si no quieres cambiarlo: ");
        Contacto contacto;
        contacto=pedirContacto();

        String querysql="";
            try {
                Statement stmt = con.createStatement();
                
                if (!contacto.getNombre().isEmpty()) {
                    querysql = "UPDATE agenda SET nombre = '" + contacto.getNombre() + "' WHERE codigo = '" + registro + "'";
                    if (stmt.executeUpdate(querysql) > 0) {
                        System.out.println("Nombre modificado.");
                    }
                }
                if (!contacto.getTelefono().isEmpty()) {
                    querysql = "UPDATE agenda SET telefono = '" + contacto.getTelefono() + "' WHERE codigo = '" + registro + "'";
                    if (stmt.executeUpdate(querysql) > 0) {
                        System.out.println("Teléfono modificado");
                    }
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

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

    // consulta un registro
    public static ArrayList<Contacto> consulta(Connection con,int registro) {
        // parecido a select.java pero guardando los resultados en un ArrayList
        System.out.println("** CONSULTA **");
        ArrayList<Contacto> resultado = new ArrayList<Contacto>();
        int codigo;
        String nombre;
        String telefono;
        Contacto contacto;

        String querysql="";

        try {
            // El "TUNEL" ya lo tenemos, que es la variable "con"
            // 1. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 2. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            querysql="SELECT * FROM agenda WHERE codigo="+registro;
            ResultSet rs = stmt.executeQuery(querysql);
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
    } // fin de scribirResultados(ArrayList<Contacto> listaContactos)

	public static Contacto pedirContacto() {
        Contacto contact=new Contacto(0,"","");
        System.out.println("Introduce el código del registro: ");
        contact.setCodigo(LeeTeclado.readInt());
        System.out.println("Introduce el nombre a guardar: ");
        contact.setNombre(LeeTeclado.readStr());
        System.out.println("Introduce el teléfono: ");
        contact.setTelefono(LeeTeclado.readStr());
		return contact;
    } // fin de pedirContacto()
    
    public static boolean existeCodigo(Connection con, int codigo) {
        boolean resultado = false;
        String querysql="";
        try {

            Statement stmt = con.createStatement();

            querysql = "SELECT * FROM agenda WHERE codigo = '" + codigo + "'";
            ResultSet rs = stmt.executeQuery(querysql);

            if (rs.next()) { 
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return resultado;
    } // fin de existeCodigo()
    
} //fin de la clase BDUtils()