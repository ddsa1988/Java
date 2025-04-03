package examples.nestedClasses;

public class Outer {
    public int outerX = 100;

    public void test() {
        Inner inner = new Inner();
        inner.display();
    }

    public class Inner {
        public void display() {
            System.out.println("display: outerX = " + outerX);
        }
    }
}
