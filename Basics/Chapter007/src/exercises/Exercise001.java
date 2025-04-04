package exercises;

public class Exercise001 {
    // Write a method called swap( ) that exchanges the contents of the objects
    // referred to by two Test object references.
    public static void userMain() {
        Test obj1 = new Test(10);
        Test obj2 = new Test(20);

        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        System.out.println();

        obj1.swap(obj2);
        System.out.println("After swap:\n");
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
    }
}

final class Test {
    public int a;

    public Test(int a) {
        this.a = a;
    }

    public boolean swap(Test obj) {
        if (obj == null) {
            return false;
        }

        a = a + obj.a;
        obj.a = a - obj.a;
        a = a - obj.a;

        return true;
    }

    @Override
    public String toString() {
        return "Test [a = " + a + "]";
    }
}
