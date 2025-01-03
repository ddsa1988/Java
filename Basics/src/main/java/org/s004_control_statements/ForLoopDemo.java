package org.s004_control_statements;

public class ForLoopDemo {
    public static void userMain() {
        basicForLoop1();
        System.out.println();

        basicForLoop2();
        System.out.println();

        basicForLoop3();
        System.out.println();

        basicForLoop4();
        System.out.println();

        basicForLoop5();
    }

    public static void basicForLoop1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void basicForLoop2() {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.printf("i and j = %d %d", i, j);
            System.out.println();
        }
    }

    public static void basicForLoop3() {
        for (int i = 0; i < 5; ) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void basicForLoop4() {
        int i = 0;
        for (; i < 5; ) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void basicForLoop5() {
        int sum = 0;

        for (int i = 0; i < 5; sum += i++) {
        }

        System.out.println("Sum = " + sum);
    }
}
