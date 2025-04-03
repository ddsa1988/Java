package examples.varargs;

public class Varargs1 {
    public static void vaTest(int[] arr) {
        System.out.print("Number of args: " + arr.length + " Contents: ");

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
