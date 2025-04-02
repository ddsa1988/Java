package examples.argumentPassing;

public class TestDemo2 {
    /*
     * When an object reference is passed to a method, the reference itself is
     * passed by use of call-by-value. However, since the value being passed refers
     * to an object, the copy of that value will still refer to the same object that
     * its corresponding argument does.
     */
    public static void userMain() {
        Test test = new Test(15, 20);

        System.out.printf("Before the method call a = %d and b = %d\n", test.a, test.b);
        test.meth(test);
        System.out.printf("After the method call a = %d and b = %d\n", test.a, test.b);
    }

    private static class Test {
        public int a;
        public int b;

        public Test(int num1, int num2) {
            a = num1;
            b = num2;
        }

        public void meth(Test obj) {
            obj.a *= 2;
            obj.b /= 2;
        }
    }
}
