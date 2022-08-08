import service.MessageService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        do {
            System.out.println("----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. editar mensaje");
            System.out.println(" 4. eliminar mensaje");
            System.out.println(" 5. Salir");

            //leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.deleteMessage();
                    break;
                case 4:
                    MessageService.updateMessage();
                    break;
                default:
                    break;
            }

        } while (opcion !=5);
    }
}