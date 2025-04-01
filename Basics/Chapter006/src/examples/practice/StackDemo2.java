package examples.practice;

public class StackDemo2 {
    public static void userMain() {
        var stack = new StackString2();

        System.out.println(stack);
        System.out.println(stack.size());

        try {
            stack.push("Diego");
            stack.push("Amanda");
            stack.push("Rodrigo");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(stack.size());

        System.out.println(stack);

        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(stack);
    }
}
