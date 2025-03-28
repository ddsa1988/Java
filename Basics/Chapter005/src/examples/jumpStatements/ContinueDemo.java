package examples.jumpStatements;

public class ContinueDemo {
    public static void userMain() {
        for (int i = 0; i < 10; i++) {
            if (i > 5 && i < 9) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
