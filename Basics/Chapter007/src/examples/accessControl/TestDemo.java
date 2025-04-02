package examples.accessControl;

public class TestDemo {
    public static void userMain() {
        Test obj = new Test();
        System.out.println(obj);
    }

    private static class Test {
        int a; // Visible only within the package
        private int b; // Visible within the class only
        protected int c; // Visible within the package or all subclasses
        public int d; // Visible everywhere

        @Override
        public String toString() {
            return "Test [a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + "]";
        }
    }
}
