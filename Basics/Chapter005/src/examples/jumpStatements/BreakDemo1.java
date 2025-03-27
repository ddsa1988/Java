package examples.jumpStatements;

public class BreakDemo1 {
    public static void userMain() {
        final int number = 10;
        final int endLoop = 5;

        for (int i = 0; i < number; i++) {
            System.out.print(i + " ");

            if (i == endLoop) {
                break;
            }
        }

        System.out.println();

        int j = 0;

        while (j < number) {
            System.out.print(j + " ");

            if (j == endLoop) {
                break;
            }

            j++;
        }
    }
}
