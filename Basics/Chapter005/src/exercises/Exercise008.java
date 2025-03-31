package exercises;

public class Exercise008 {
    public static void userMain() {
        PrintTable(5);
    }

    private static void PrintTable(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Parameter must be greater than zero.");
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
