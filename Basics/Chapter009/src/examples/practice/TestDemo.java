package examples.practice;

import java.util.Arrays;
import java.util.List;

public class TestDemo {
    public static void userMain() {
        var stackGeneric = new Stack<Float>();
        var stackStr = new StackString(5);
        var stackInteger = new StackInteger(10);

        stackGeneric.push(18.5f);
        stackGeneric.push(71.58f);

        stackStr.push("Diego");
        stackStr.push("Amanda");

        stackInteger.push(100);
        stackInteger.push(200);

        @SuppressWarnings("rawtypes")
        List<IStack> stacks = Arrays.asList(stackGeneric, stackStr, stackInteger);

        for (@SuppressWarnings("rawtypes")
        IStack stack : stacks) {
            System.out.println(stack);
        }
    }
}
