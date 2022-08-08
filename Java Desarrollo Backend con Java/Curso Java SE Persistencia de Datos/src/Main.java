import ui.Conexion;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        try (Connection conn = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}