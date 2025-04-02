package examples.overload;

public class OverloadMethods {
    public static void userMain() {
        test();
        test(10);
        test(10, 20);
        double result = test(123.25);
        System.out.printf("Result of test(%.2f): %.2f\n", 123.25, result);
    }

    private static void test() {
        System.out.println("No parameters.");
    }

    private static void test(int a) {
        System.out.println("int a: " + a);
    }

    private static void test(int a, int b) {
        System.out.println("int a: " + a + " and int b: " + b);
    }

    private static double test(double a) {
        System.out.println("double a: " + a);

        return a * a;
    }
}
