package org.s009_methods_and_classes;

public class PrimitiveTypesCallByValue {
    public static void userMain() {
        int x = 10;
        int y = 20;

        System.out.println("Main method before swap: ");
        System.out.printf("x => %d, y => %d\n", x, y);

        System.out.println();
        swap(x, y);

        System.out.println("\nMain method after swap: ");
        System.out.printf("x => %d, y => %d\n", x, y);

    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Inside swap method: ");
        System.out.printf("x => %d, y => %d\n", x, y);
    }
}
