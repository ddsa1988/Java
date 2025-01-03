package org.s009_methods_and_classes;

public class RecursionDemo {
    public static void userMain() {
        String word = "diego";

        System.out.println(reverseString(word));
    }

    private static String reverseString(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
