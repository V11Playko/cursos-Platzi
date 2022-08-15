package service;

import DAO.MessageDAO;
import Model.Message;

import java.util.Scanner;

public class MessageService {
    public static void createMessage() {
    Scanner sc= new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String message = sc.nextLine();

        System.out.println("Tu nombre");
        String name = sc.nextLine();

        Message registro = new Message();
        registro.setMensaje(message);
        registro.setAutor_mensaje(name);

        MessageDAO.createMessageDB(registro);
    }

    public static void listMessage() {

    }

    public static void deleteMessage() {

    }

    public static void updateMessage() {

    }

}
