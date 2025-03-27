package examples.iterationStatements;

public class ForLoopDemo1 {
    public static void userMain() {
        {
            final int a = 10;
            int b;

            for (b = 0; b < a; b++) {
                System.out.print(b + " ");
            }
        }

        System.out.println();

        {
            final int a = 10;

            for (int b = 20; b > a; b--) {
                System.out.print(b + " ");
            }
        }

        System.out.println();

        {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
