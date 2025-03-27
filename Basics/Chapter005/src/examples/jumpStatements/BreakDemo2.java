package examples.jumpStatements;

public class BreakDemo2 {
    public static void userMain() {
        final int number = 3;
        final int endLoop = 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("i = %d, j = %d\n", i, j);

                if (j == endLoop) {
                    break;
                }
            }
        }
    }
}
