package examples.classHierarchy;

public class TestDemo {
    public static void userMain() {
        ClassC obj = new ClassC();

        System.out.println(obj);
    }
}

class ClassA {
    public ClassA() {
        System.out.println("Inside class A constructor.");
    }
}

class ClassB extends ClassA {
    public ClassB() {
        System.out.println("Inside class B constructor.");
    }
}

class ClassC extends ClassB {
    public ClassC() {
        System.out.println("Inside class C constructor.");
    }
}