package methodOverride;

public class ClassA {
    public int a;
    public int b;

    public ClassA(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public void greeting() {
        System.out.println("Hello from superclass.");
    }

    public void show() {
        System.out.printf("a = %d, b: %d\n", a, b);
    }

    @Override
    public String toString() {
        return "ClassA [a = " + a + ", b = " + b + "]";
    }
}
