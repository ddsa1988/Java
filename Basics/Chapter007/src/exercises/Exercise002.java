package exercises;

public class Exercise002 {
    // Write a recursive method that displays the contents of a string backwards.
    public static void userMain() {
        System.out.println(reverseString("diego"));
        System.out.println(reverseString("amanda"));
    }

    private static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
