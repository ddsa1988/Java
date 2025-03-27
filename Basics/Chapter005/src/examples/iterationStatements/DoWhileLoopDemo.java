package examples.iterationStatements;

public class DoWhileLoopDemo {
    public static void userMain() {
        {
            final int a = 10;
            int b = 0;

            do {
                System.out.print(b + " ");
                b++;
            } while (b < a);
        }

        System.out.println();

        {
            final int a = 0;
            int b = 0;

            do {
                System.out.print(b + " ");
                b++;
            } while (b < a);
        }
    }
}
