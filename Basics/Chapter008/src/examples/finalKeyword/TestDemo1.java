package examples.finalKeyword;

public class TestDemo1 {
    // To disallow a method from being overridden, specify final as a modifier at
    // the start of its declaration.
    public static void userMain() {
        ClassB obj = new ClassB();

        System.out.println(obj);
    }
}

class ClassA {
    public final void callMe() {
        System.out.println("Method callMe.");
    }
}

class ClassB extends ClassA {
    /*
     * @Override
     * public final void callMe() {
     * System.out.println("Method callMe.");
     * }
     */
}
