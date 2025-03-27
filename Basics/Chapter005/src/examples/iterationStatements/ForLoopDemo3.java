package examples.iterationStatements;

public class ForLoopDemo3 {
    public static void userMain() {
        final int number = 5;

        {
            boolean done = false;

            for (int i = 0; !done; i++) {
                System.out.print(i + " ");

                if (i == number) {
                    done = true;
                }
            }
        }

        System.out.println();

        {
            int i = 0;
            boolean done = false;

            for (; !done;) {
                System.out.print(i + " ");

                if (i == number) {
                    done = true;
                }

                i++;
            }
        }

        System.out.println();

        {
            int i = 0;

            for (;;) { // Infinite loop
                System.out.print(i + " ");

                if (i == number) {
                    break;
                }

                i++;
            }
        }
    }
}
