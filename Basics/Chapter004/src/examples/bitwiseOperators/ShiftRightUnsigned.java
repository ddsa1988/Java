package examples.bitwiseOperators;

public class ShiftRightUnsigned {
    public static void userMain() {

        int a = -1;
        System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

        a >>>= 12;
        System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

        a >>>= 12;
        System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

    }
}
