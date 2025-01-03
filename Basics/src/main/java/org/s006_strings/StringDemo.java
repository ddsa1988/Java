package org.s006_strings;

public class StringDemo {
    public static void userMain() {
        String str1 = "Diego";
        String str2 = "Diego";
        String str3 = new String("Diego");

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println();

        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);
    }
}
