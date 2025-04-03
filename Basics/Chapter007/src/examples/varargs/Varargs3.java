package examples.varargs;

public class Varargs3 {
    // The ... causes the parameter to be treated as an array of the specified type.
    public static void vaTest(String msg, int... numbers) {
        System.out.print(msg + numbers.length + " Contents: ");

        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
