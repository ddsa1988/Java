package examples;

import java.util.Arrays;

public class OneDimensionalArray {
    public static void userMain() {
        String[] names = { "Diego", "Amanda", "Ameixa", "Amora" };
        int[] numbers = new int[2];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
