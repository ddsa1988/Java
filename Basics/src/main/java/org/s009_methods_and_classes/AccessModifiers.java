package org.s009_methods_and_classes;

public class AccessModifiers {
    public static void userMain() {
        Test t = new Test();

        // System.out.println(t.n1); Compile error: n1 is not visible outside the class
        System.out.println(t.n2);
        System.out.println(t.n3);
        System.out.println(t);
    }

    private static class Test {
        private int n1 = 10; // Visible only inside the class
        protected int n2 = 100; // Visible in the same package and subclasses
        public int n3 = 1000; // Visible for all classes

        @Override
        public String toString() {
            return "n1: " + n1 + " n2: " + n2 + " n3: " + n3;
        }
    }
}


