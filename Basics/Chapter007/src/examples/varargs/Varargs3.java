package examples.varargs;

public class Varargs3 {
    public static void vaTest(String msg, int... numbers) {
        System.out.print(msg + numbers.length + " Contents: ");

        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
