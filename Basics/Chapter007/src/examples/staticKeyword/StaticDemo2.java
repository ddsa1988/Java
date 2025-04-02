package examples.staticKeyword;

public class StaticDemo2 {
    public static void userMain() {
        System.out.println(StaticBlock.staticVariable);
        StaticBlock.staticVariable = 200;
        System.out.println(StaticBlock.staticVariable);

        var obj1 = new StaticBlock(10);
        var obj2 = new StaticBlock(20);

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}
