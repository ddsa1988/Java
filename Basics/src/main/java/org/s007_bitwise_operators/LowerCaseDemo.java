package org.s007_bitwise_operators;

public class LowerCaseDemo {
    public static void userMain() {
        char ch = 'A';
        int mask = 32;

        for (int i = 0; i < 10; i++) {
            char lowerCase = (char) ((int) ch | mask);

            System.out.printf("%s%s ", ch, lowerCase);
            ch++;
        }
    }
}
