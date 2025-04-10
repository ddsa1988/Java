package examples.methodOverride;

public class ClassB extends ClassA {
    public int c;

    public ClassB(int num1, int num2, int num3) {
        super(num1, num2);
        c = num3;
    }

    public void greeting(String msg) {
        System.out.println("Hello from subclass. " + msg);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("c = " + c);
    }

    @Override
    public String toString() {
        return "ClassB [a = " + a + ", b = " + b + ", c = " + c + "]";
    }
}
