package basesdatos;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.SQLException;

/* Pasos para lograr la conexión a una BB.DD */

public class Conexion {

    public static void main(String[] args) {
        
        // primero necesitamos saber qué conector se usa y dónde conecta
        // puede ser de varios tipos como p.ej. MySQL u ORACLE

        // JDBC es el Java DataBase Connector, lo deberemos tener instalado.
        // Se puede descargar desde aquí: https://dev.mysql.com/downloads/connector/j/

        // String driver = "oracle.jdbc.driver.OracleDriver" // ORACLE
        String driver = "com.mysql.cj.jdbc.Driver"; // MySQL
        
        // estructura de la url de conexión: protocolo://servidor:puerto/basedatos
        
        // String url = "jdbc:oracle:thin:@localhost:1521:xe"; // ORACLE
        String url = "jdbc:mysql://remotemysql.com:3306/nbgLStOY8W?serverTimezone=UTC"; // MySQL
        
        String usuario = "nbgLStOY8W";
        String password = "DrifWtYlGz";

        try {
            // 1. Registrar el Driver JDBC
            // (lo carga en tiempo real en la memoria)
            Class.forName(driver);

            // 2. Obtener una conexión
            // Necesitamos url (protocolo,servidor,puerto,base de datos),
            // usuario y contraseña
            Connection con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");
            // 3. Cerrar la conexión
            con.close();
            System.out.println("Desconectado");
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    
    } // fin del main()

} // fin de la clase principal