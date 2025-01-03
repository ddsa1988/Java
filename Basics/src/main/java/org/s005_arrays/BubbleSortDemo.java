package org.s005_arrays;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void userMain() {
        int[] numbers = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

        BubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void BubbleSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        int lastIndex = arr.length - 1;

        for (int i = 0; i < lastIndex; i++) {
            for (int j = i + 1; j <= lastIndex; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
