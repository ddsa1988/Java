package examples.uncaughtExceptions;

public class Example002 {
    public static void userMain() {
        subroutine();
    }

    private static void subroutine() {
        int a = 42;
        int b = 0;
        int c = a / b;

        System.out.println("c = " + c);
    }
}
