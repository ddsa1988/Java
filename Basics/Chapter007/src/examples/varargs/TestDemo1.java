package examples.varargs;

public class TestDemo1 {
    public static void userMain() {
        int[] n1 = { 10 };
        int[] n2 = { 100, 200, 300 };
        int[] n3 = {};

        Varargs1.vaTest(n1);
        Varargs1.vaTest(n2);
        Varargs1.vaTest(n3);
    }
}
