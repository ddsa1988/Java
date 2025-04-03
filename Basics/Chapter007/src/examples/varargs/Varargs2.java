package examples.varargs;

public class Varargs2 {
    // The ... causes the parameter to be treated as an array of the specified type.
    public static void vaTest(int... numbers) {
        System.out.print("Number of args: " + numbers.length + " Contents: ");

        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
