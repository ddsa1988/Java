package examples.argumentPassing;

public class TestDemo1 {
    /*
     * When you pass a primitive type to a method, it is passed by value. Thus, a
     * copy of the argument is made, and what occurs to the parameter that receives
     * the argument has no effect outside the method.
     */
    public static void userMain() {
        Test test = new Test();
        int a = 15;
        int b = 20;

        System.out.printf("Before the method call a = %d and b = %d\n", a, b);
        test.meth(a, b);
        System.out.printf("After the method call a = %d and b = %d\n", a, b);
    }

    private static class Test {
        public void meth(int a, int b) {
            a *= 2;
            b /= 2;
        }

    }
}
