package examples.abstractClass;

public class TestDemo1 {
    public static void userMain() {
        // ClassA obj = new ClassA(); Error cannot instantiate an abstract class
        ClassB obj = new ClassB();

        obj.callMe();
        obj.callMeToo();
    }
}

abstract class ClassA {
    public abstract void callMe();

    public void callMeToo() {
        System.out.println("This is a concrete method..");
    }
}

class ClassB extends ClassA {

    @Override
    public void callMe() {
        System.out.println("Class B implementation of callMe.");
    }
}
