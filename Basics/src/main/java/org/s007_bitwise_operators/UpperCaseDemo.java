package org.s007_bitwise_operators;

public class UpperCaseDemo {
    public static void userMain() {
        char ch = 'a';
        int mask = ~32;

        for (int i = 0; i < 10; i++) {
            char upperCase = (char) ((int) ch & mask);

            System.out.printf("%s%s ", ch, upperCase);
            ch++;
        }
    }
}
