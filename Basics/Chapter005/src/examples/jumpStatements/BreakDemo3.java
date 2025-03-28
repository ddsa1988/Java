package examples.jumpStatements;

public class BreakDemo3 {
    public static void userMain() {
        boolean end = true;

        first: {
            second: {
                third: {
                    System.out.println("Before break.");

                    if (end) {
                        break second;
                    }
                    System.out.println("This won't execute.");
                    break third;
                }
                System.out.println("This won't execute.");
            }
            System.out.println("This is after the second block.");
            break first;
        }
        System.out.println("This is outside all blocks.");
    }
}
