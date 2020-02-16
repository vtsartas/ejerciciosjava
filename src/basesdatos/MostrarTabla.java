package basesdatos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/* SQL: delete: elimina un registro en la tabla indicada de la base de datos */

public class MostrarTabla {

    public static void main(String[] args) {

        BBDD basededatos=new BBDD("mysql", "remotemysql.com", 3306, "nbgLStOY8W", "nbgLStOY8W", "DrifWtYlGz");

        Connection conexion=BDUtils.Conecta(basededatos);

        try {
            
            Statement stmt = conexion.createStatement();
            
            // con ResultSet obtenemos un bloque con el resultado de la query
            ResultSet rs = stmt.executeQuery("SELECT * FROM agenda");

            while (rs.next()) {
                // usando el indice de columna
                //System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
                
                // usando el nombre de la columna
                System.out.println(rs.getString("codigo") + " - " + rs.getString("nombre") + " - " + rs.getString("telefono"));
            }
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        BDUtils.desconecta(conexion);
    }
}