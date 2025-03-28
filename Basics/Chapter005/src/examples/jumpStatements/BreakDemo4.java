package examples.jumpStatements;

public class BreakDemo4 {
    public static void userMain() {
        final int number = 10;
        final int endLoop = 5;

        outer: {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    System.out.printf("i = %d, j = %d\n", i, j);

                    if (j == endLoop) {
                        break outer;
                    }
                }
                System.out.println("This will not print.");
            }
        }
        System.out.println("Loops complete.");
    }
}
