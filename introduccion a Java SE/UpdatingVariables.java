public class UpdatingVariables {

    public static void main(String[] args) {
        // Actualizar datos numéricos:
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary); // 1200

        salary += 300;
        System.out.println(salary); // 1500

        // Actualizar variables de tipo String:
        String employeeName = "Heinner ";
        employeeName = employeeName + "Gonzalo ";
        System.out.println(employeeName); // Anahí Salgado

        employeeName += "Vega Garcia ";
        System.out.println(employeeName); // Anahí Salgado Díaz de la Vega

        employeeName = "KING " + employeeName;
        System.out.println(employeeName); // Irene Anahí Salgado Díaz de la Vega
    }
}
