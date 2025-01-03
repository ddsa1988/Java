package org.s006_strings;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void userMain() {
        String[] names = { "Rodrigo", "Diego", "Tainara", "Amanda", "Mirelli", "Ivanice" };

        System.out.printf("Names unsorted: %s\n", Arrays.toString(names));
        BubbleSort(names);
        System.out.printf("Names sorted: %s\n", Arrays.toString(names));
    }

    private static void BubbleSort(String[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int lastIndex = arr.length - 1;

        for (int i = 0; i < lastIndex; i++) {
            for (int j = i + 1; j <= lastIndex; j++) {
                int result = arr[i].compareTo(arr[j]);

                if (result > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
