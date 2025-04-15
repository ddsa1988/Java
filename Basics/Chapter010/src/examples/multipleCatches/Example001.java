package examples.multipleCatches;

public class Example001 {
    public static void userMain() {
        test(null, 10);
        System.out.println();

        test("hello", 20);
        System.out.println();

        test("hello", 1);
    }

    private static void test(String msg, int charIndex) {
        try {
            System.out.println("msg length = " + msg.length());
            System.out.printf("Char at position %d = %s\n", charIndex, msg.charAt(charIndex));
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of range: " + e);
        } catch (Exception e) {
            System.out.println("General exception: " + e);
        }
        System.out.println("After try-catch blocks.");
    }
}
