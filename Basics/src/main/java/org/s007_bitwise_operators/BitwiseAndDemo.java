package org.s007_bitwise_operators;

public class BitwiseAndDemo {
    public static void userMain() {
        byte p, q;

        System.out.println("p\tp\tp & q\tp | q\tp ^ q\t~p");

        p = q = 0;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (~p) + "\n");

        p = 0;
        q = 1;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (~p) + "\n");

        p = 1;
        q = 0;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (~p) + "\n");

        p = q = 1;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (~p) + "\n");
    }
}
