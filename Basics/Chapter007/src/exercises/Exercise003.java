package exercises;

public class Exercise003 {
    // Create a varargs method called sum( ) that sums the int values passed to it.
    // Have it return the result.
    public static void userMain() {
        System.out.println(sum(null));
        System.out.println(sum());
        System.out.println(sum(10, 20));
        System.out.println(sum(5, 10, 15, 20, 25, 30));
    }

    private static int sum(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
