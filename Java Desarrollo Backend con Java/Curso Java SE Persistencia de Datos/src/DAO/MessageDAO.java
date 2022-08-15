package DAO;

import database.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {

    public static void createMessageDB(Model.Message message){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try{
                String query="insert into mensajes(id_usuario,mensaje,fecha) values (?,?,CURRENT_TIMESTAMP)";
                ps= conexion.prepareStatement(query);
                ps.setString(1, message.getMensaje());
                ps.setString(2, message.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado");
            } catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void readMessageDB(){

    }

    public static void deleteMessageDB(int id_mensaje){

    }

    public static void uploadMessageDB(Model.Message message){}
}
