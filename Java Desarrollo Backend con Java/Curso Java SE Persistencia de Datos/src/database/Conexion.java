package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() {
        Connection connection = null;
        final String DATABASE = "mensajes_app?serverTimezone=UTC";
        final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
        final String USER = "root";
        final String PASSWORD = "";
        try {
            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch(SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}
