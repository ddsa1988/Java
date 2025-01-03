package org.s005_arrays;

import java.util.Arrays;

public class MultiDimArrayDemo {
    public static void userMain() {
        int[][] test = new int[3][2];

        int[][] arr = {
                { 100, 50 },
                { 80, 10, 300 },
                { 580 },
                { 65, 72, 85, 93, 101 }
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();
    }
}
