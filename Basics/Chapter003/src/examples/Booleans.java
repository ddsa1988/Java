package examples;

public class Booleans {
    public static void userMain() {
        final int a = 10;
        final int b = 20;
        boolean result = a > b;

        String msg = String.format("The value %d is greater than the value %d: %b.", a, b, result);
        System.out.println(msg);
    }
}
