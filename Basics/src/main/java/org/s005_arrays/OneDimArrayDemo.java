package org.s005_arrays;

import java.util.Arrays;

public class OneDimArrayDemo {
    public static void userMain() {
        String[] names = new String[5];
        names[0] = "Diego";
        names[1] = "Amanda";
        names[2] = "Amora";
        names[3] = "Ameixa";

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(Arrays.toString(names));

        printNumbers(numbers);

        System.out.println();
    }

    public static void printNumbers(int[]  arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[ ");

            int lastIndex = arr.length - 1;

            for (int i = 0; i < lastIndex; i++) {
                System.out.print(arr[i] + ", ");
            }

            System.out.print(arr[lastIndex] + " ]");
        }
    }
}
