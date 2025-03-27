package examples.iterationStatements;

public class WhileLoopDemo {
    public static void userMain() {
        {
            final int a = 10;
            int b = 0;

            while (b < a) {
                System.out.print(b + " ");
                b++;
            }
        }

        System.out.println();

        {
            final int a = 0;
            int b = 0;

            while (b < a) {
                System.out.print(b + " "); // This will not be displayed
                b++;
            }
        }

        System.out.println();

        {
            int a = 100;
            int b = 200;

            while (++a < --b) {
            }

            System.out.println("The midpoint is " + a + ".");
        }
    }
}
