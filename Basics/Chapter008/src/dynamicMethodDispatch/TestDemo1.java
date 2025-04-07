package dynamicMethodDispatch;

import java.util.Arrays;
import java.util.List;

public class TestDemo1 {
    /*
     * When different types of objects are referred to, different versions of an
     * overridden method will be called. In other words, it is the type of the
     * object being referred to (not the type of the reference variable) that
     * determines which version of an overridden method will be executed. Therefore,
     * if a superclass contains a method that is overridden by a subclass, then when
     * different types of objects are referred to through a superclass reference
     * variable, different versions of the method are executed.
     */
    public static void userMain() {
        List<ClassA> objs = Arrays.asList(new ClassA(), new ClassB(), new ClassC());

        for (ClassA obj : objs) {
            obj.callMe();
        }
    }
}

class ClassA {
    public void callMe() {
        System.out.println("Inside class A callMe method.");
    }
}

class ClassB extends ClassA {
    @Override
    public void callMe() {
        System.out.println("Inside class B callMe method.");
    }
}

class ClassC extends ClassA {
    @Override
    public void callMe() {
        System.out.println("Inside class C callMe method.");
    }
}
