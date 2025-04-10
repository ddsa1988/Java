package examples.finalKeyword;

public class TestDemo2 {
    // To disallow a class to be inherited, specify final as a modifier at
    // the start of its declaration.
    public static void userMain() {
        ClassA obj = new ClassA();

        System.out.println(obj);
    }
}

final class ClassA {
    public void callMe() {
        System.out.println("Method callMe.");
    }
}

/*
 * class ClassB extends ClassA {
 * 
 * }
 */
