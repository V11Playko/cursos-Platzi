public class Ejercicio_2 {

    public static void main(String[] args) {
        char c = 'z';
        int i = 250;
        double d = 301.067;
        int f = 100;
        int g = 737;
        double h = 298.638;

        int c1 = c ;
        System.out.println(c1);

        long i1 = i;
        short i2 = (short) i1;
        System.out.println(i2);

        long d1 = (long) d ;
        System.out.println(d1);

        double f1 = f + 5000.66;
        float f2 = (float) f1;
        System.out.println(f2);

        int g1 = g * 100;
        byte g2 = (byte) g1;
        System.out.println(g2);

        double h1 = h / 25;
        long h2 = (long) h1;
        System.out.println(h2);
    }
}
