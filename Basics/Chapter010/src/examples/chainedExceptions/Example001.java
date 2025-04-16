package examples.chainedExceptions;

public class Example001 {
    public static void userMain() {
        try {
            ChainDemo.demo();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}

class ChainDemo {
    public static void demo() {
        NullPointerException e = new NullPointerException("Top layer.");

        e.initCause(new ArithmeticException("Cause."));

        throw e;
    }
}
