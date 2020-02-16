package basesdatos;

import java.sql.Connection;
import java.sql.Statement;

/* SQL: delete: elimina un registro en la tabla indicada de la base de datos */

public class Actualizar {

    public static void main(String[] args) {

        BBDD basededatos=new BBDD("mysql", "remotemysql.com", 3306, "nbgLStOY8W", "nbgLStOY8W", "DrifWtYlGz");

        Connection conexion=BDUtils.Conecta(basededatos);

        try {
            
            Statement stmt = conexion.createStatement();
            
            stmt.executeUpdate("UPDATE agenda SET telefono = '987000456' WHERE codigo = '2'");
            System.out.println("Registro modificado");
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        BDUtils.desconecta(conexion);
    }
}