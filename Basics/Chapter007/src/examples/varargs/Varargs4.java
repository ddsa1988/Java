package examples.varargs;

public class Varargs4 {
    // The ... causes the parameter to be treated as an array of the specified type.
    public static void vaTest(int... values) {
        System.out.print("VaTest(int...): " + "Number of args: " + values.length + " Contents: ");

        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void vaTest(boolean... values) {
        System.out.print("VaTest(boolean...): " + "Number of args: " + values.length + " Contents: ");

        for (boolean value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void vaTest(String msg, int... values) {
        System.out.print("VaTest(String msg, int...): " + msg + values.length + " Contents: ");

        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
