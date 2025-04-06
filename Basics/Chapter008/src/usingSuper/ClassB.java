package usingSuper;

public class ClassB extends ClassA {
    public int a;

    public ClassB(int num1, int num2) {
        super.a = num1;
        a = num2;
    }

    public void show() {
        System.out.println("'a' in the superclass: " + super.a);
        System.out.println("'a' in the subclass: " + a);
    }
}
