package examples.practice;

public class StackDemo {
    public static void userMain() {
        var stack = new StackString1();

        System.out.println(stack);
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.push("Diego"));
        System.out.println(stack.push("Amanda"));
        System.out.println(stack.push("Rodrigo"));

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
