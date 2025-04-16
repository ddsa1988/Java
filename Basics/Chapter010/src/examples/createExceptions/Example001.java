package examples.createExceptions;

public class Example001 {
    public static void userMain() {
        try {
            ExceptionDemo.compute(1);
            ExceptionDemo.compute(20);
        } catch (MyException e) {
            System.out.println("Caught: " + e);
        }
    }
}

class ExceptionDemo {
    public static void compute(int a) throws MyException {
        if (a <= 10) {
            System.out.println("Normal exit.");
            return;
        }

        throw new MyException(a);
    }
}

class MyException extends Exception {
    private final int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException { " + "detail = " + detail + " }";
    }
}
