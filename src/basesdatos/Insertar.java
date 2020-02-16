package basesdatos;

import java.sql.Connection;
import java.sql.Statement;

/* SQL: insert: inserta un registro en la tabla indicada de la base de datos  */

public class Insertar {

    public static void main(String[] args) {
        
        BBDD basededatos=new BBDD("mysql", "remotemysql.com", 3306, "nbgLStOY8W", "nbgLStOY8W", "DrifWtYlGz");

        // conectamos usando el método en BDUtils que crea un objeto de tipo 'Connection'
        Connection conexion=BDUtils.Conecta(basededatos);

        // intentamos insertar la fila en la tabla
        try {
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate("INSERT INTO agenda (codigo,nombre,telefono) VALUES ('2','Luis Martínez','333440555')");
            System.out.println("Insertado");
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        BDUtils.desconecta(conexion);

    }
}