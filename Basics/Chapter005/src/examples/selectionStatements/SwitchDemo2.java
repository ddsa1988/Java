package examples.selectionStatements;

public class SwitchDemo2 {
    public static void userMain() {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                case 1:
                    System.out.println("i is one.");
                case 2:
                    System.out.println("i is two.");
                case 3:
                    System.out.println("i is three");
                default:
                    System.out.println("i is greater than three.\n");
            }
        }
    }
}
