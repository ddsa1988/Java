package examples.throwKeyword;

public class Example001 {
    public static void userMain() {
        try {
            test();
        } catch (NullPointerException e) {
            System.out.println("Re-caught: " + e);
        }
    }

    private static void test() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught inside test().");
            throw e;
        }
    }
}
