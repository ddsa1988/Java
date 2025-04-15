package examples.finallyKeyword;

public class Example001 {
    public static void userMain() {
        test(null);
        System.out.println();

        test("hello");
    }

    private static void test(String msg) {
        try {
            System.out.printf("The msg '%s' has %d characters.\n", msg, msg.length());

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e);
            return;
        } catch (Exception e) {
            System.out.println("General exception.");
            return;
        } finally {
            System.out.println("Finally block is always executed.");
        }

        System.out.println("After try-catch block.");
    }
}
