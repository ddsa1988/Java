package examples.iterationStatements;

public class ForLoopDemo2 {
    public static void userMain() {
        {
            for (int i = 0, j = 10; i < j; i++, j--) {
                System.out.printf("i = %d, j = %d\n", i, j);
            }
        }

        System.out.println();

        {
            int i, j;

            for (i = 0, j = 10; i < j; i++, j--) {
                System.out.printf("i = %d, j = %d\n", i, j);
            }
        }
    }
}
