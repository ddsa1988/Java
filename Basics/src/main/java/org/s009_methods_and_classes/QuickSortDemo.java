package org.s009_methods_and_classes;

import java.util.Arrays;

public class QuickSortDemo {
    public static void userMain() {
        char[] chars = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};

        System.out.printf("Original array: %s\n", Arrays.toString(chars));
        qs(chars);
        System.out.printf("Sorted array: %s\n", Arrays.toString(chars));
    }

    public static void qs(char[] items) {
        quickSort(items, 0, items.length - 1);
    }

    private static void quickSort(char[] items, int left, int right) {
        if (items == null) return;

        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i > j) continue;

            y = items[i];
            items[i] = items[j];
            items[j] = y;
            i++;
            j--;

        } while (i <= j);

        if (left < j) quickSort(items, left, j);
        if (i < right) quickSort(items, i, right);
    }
}
