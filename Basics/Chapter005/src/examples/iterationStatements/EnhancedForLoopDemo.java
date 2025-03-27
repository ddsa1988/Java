package examples.iterationStatements;

public class EnhancedForLoopDemo {
    public static void userMain() {

        String[] names = { "Diego", "Amanda", "Amora", "Ameixa" };

        for (String name : names) {
            System.err.print(name + " ");
        }

        System.out.println();

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
