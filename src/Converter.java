public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        int expected = 2;

        boolean testEuro = expected == euro;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("Test euro: " + testEuro + "\n");

        boolean testDollar = expected == dollar;
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("Test dollar: " + testDollar);
    }
}
