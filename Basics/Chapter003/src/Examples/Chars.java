package examples;

public class Chars {

    public static void userMain() {
        {
            char ch = 'a';

            String msg = String.format("The char '%c' has the value of %d.", ch, (int) ch);
            System.out.println(msg);
        }

        System.out.println();

        {
            System.out.println("ASCII Table:");

            for (int i = 0; i < 128; i++) {
                char ch = (char) i;
                System.out.print(ch + " ");
            }
        }
    }
}
