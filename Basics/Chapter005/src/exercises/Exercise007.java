package exercises;

public class Exercise007 {
    public static void userMain() {
        PrintEquation(13);
    }

    private static void PrintEquation(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Parameter must be greater than zero.");
        }

        int x = number;

        while (x > 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }

            System.out.print(x + " ");
        }
    }
}
