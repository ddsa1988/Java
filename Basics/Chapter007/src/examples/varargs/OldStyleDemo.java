package examples.varargs;

public class OldStyleDemo {
    public static void userMain() {
        int[] n1 = { 10 };
        int[] n2 = { 100, 200, 300 };
        int[] n3 = {};

        OldStyle.vaTest(n1);
        OldStyle.vaTest(n2);
        OldStyle.vaTest(n3);
    }
}
