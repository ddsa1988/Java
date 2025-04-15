package examples.usingTryCatch;

public class Example001 {
    public static void userMain() {
        int a = 42;
        int b = 0;

        try {
            int c = a / b;

            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("After catch statement.");
    }
}
