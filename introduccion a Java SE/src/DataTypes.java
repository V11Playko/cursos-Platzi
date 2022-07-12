public class DataTypes {

    public static void main(String[] args) {
        // Numero entero (max. 10 numeros)
        int n = 1234567890;

        //Para diferenciarlo de Int colocar una L al final
        long nL = 12345678901L;

        //Numero grande en decimales
        double nD = 123.456;

        //Para diferenciarlo de Double colocar una F al final
        float nF = 123.456F;

        var salary = 1000; // INT
        var pension = salary * 0.03; // DOUBLE
        var totalSalary = salary - pension; // DOUBLE


        System.out.println(totalSalary);
    }
}
