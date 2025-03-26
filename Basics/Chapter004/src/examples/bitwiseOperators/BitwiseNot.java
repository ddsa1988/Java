package examples.bitwiseOperators;

public class BitwiseNot {
    public static void userMain() {
        String msg = "";
        final byte a = 42;
        final byte b = ~a;

        msg = String.format("Number %d in binary is %s.", a, Integer.toBinaryString(a));
        System.out.println(msg);

        msg = String.format("Number %d in binary is %s.", b, Integer.toBinaryString(b));
        System.out.println(msg);
    }
}
