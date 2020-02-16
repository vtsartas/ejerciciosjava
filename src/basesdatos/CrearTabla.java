package basesdatos;

import java.sql.Connection;
import java.sql.Statement;

/* SQL: CREATE TABLE: agrega una nueva tabla con las características indicadas a la bases de datos  */

public class CrearTabla {

    public static void main(String[] args) {

        BBDD basededatos=new BBDD("mysql", "remotemysql.com", 3306, "nbgLStOY8W", "nbgLStOY8W", "DrifWtYlGz");
 
        // conectamos usando el método en BDUtils que crea un objeto de tipo 'Connection'
        Connection conexion=BDUtils.Conecta(basededatos);

        // intentamos insertar la fila en la tabla
        try {
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate("CREATE TABLE agenda (codigo int,nombre char(50),telefono char(9))");
            System.out.println("Tabla 'agenda' creada.");
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        BDUtils.desconecta(conexion);

    }
}