package examples.varargs;

public class Varargs2 {
    public static void vaTest(int... numbers) {
        System.out.print("Number of args: " + numbers.length + " Contents: ");

        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
