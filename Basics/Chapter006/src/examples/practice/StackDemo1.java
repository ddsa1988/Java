package examples.practice;

public class StackDemo1 {
    public static void userMain() {
        var stack = new StackString1();

        System.out.println(stack);
        System.out.println(stack.size());

        stack.push("Diego");
        stack.push("Amanda");
        stack.push("Rodrigo");
        System.out.println(stack.size());

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
