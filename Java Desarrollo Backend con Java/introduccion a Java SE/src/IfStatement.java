public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false; // también podría ser false
        int filesSended = 3;

        if (isBluetoothEnabled) {
            filesSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("No enviado");
        }
    }
}
