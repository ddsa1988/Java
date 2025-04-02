package examples.staticKeyword;

public class StaticDemo1 {
    public static void userMain() {
        System.out.println(StaticAttribute.staticVariable);
        StaticAttribute.staticVariable = 200;
        System.out.println(StaticAttribute.staticVariable);

        var obj1 = new StaticAttribute(10);
        var obj2 = new StaticAttribute(20);

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}
