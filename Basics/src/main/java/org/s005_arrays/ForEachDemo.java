package org.s005_arrays;

public class ForEachDemo {
    public static void userMain() {
        String[] names = { "Diego", "Amanda", "Amora", "Ameixa" };

        int[][] numbers = {
                { 0, 1, 2 },
                { 100, 101, 102 },
                { 200, 201, 202 }
        };

        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();

        for (int[] arr : numbers) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
    }
}
