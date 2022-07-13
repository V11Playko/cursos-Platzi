public class Functions {

    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        double quality = 500;

        //Area de un circulo
        //pi * r
        System.out.println("Area Circulo");
        System.out.println(area);

        //Area de una esfera
        //4*PI*r2
        double areaSphere = sphereArea(y);
        System.out.println("Area Sphere");
        System.out.println(areaSphere);

        //Volumen de una esfera
        //(4/3)*pi * r3
        double volumenSphere = sphereVolumen(y);
        System.out.println("Volumen sphere");
        System.out.println(volumenSphere);

        System.out.println("PESOS A DOLARES " + convertToDollar(quality, "MXN") + " MXN");
        System.out.println("PESOS A DOLARES " + convertToDollar(quality, "COP") + " COP");
    }

    public static double circleArea(double y) {
        return Math.PI * Math.pow(y,2);
    }

    public static double sphereArea (double y)
    {
        return Math.PI * 4 * Math.pow(y,2);
    }
    public static double sphereVolumen (double y)
    {
        return   Math.PI * (4/3) * Math.pow(y,3);
    }

    //Funciones B
    public static double convertToDollar (double quantity, String currency)
    {
        //MXN COP
        switch (currency) {
            case "MXN" -> quantity = quantity * 0.052;
            case "COP" -> quantity = quantity * 0.00031;
        }
        return quantity;
    }




}
