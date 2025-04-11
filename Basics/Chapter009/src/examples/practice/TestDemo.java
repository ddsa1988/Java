package examples.practice;

import java.util.Arrays;
import java.util.List;

public class TestDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void userMain() {
        var stackGeneric = new Stack<Float>();
        var stackStr = new StackString(5);
        var stackInteger = new StackInteger(10);

        IStack stackRef = stackGeneric;

        stackRef.push(18.5f);
        stackRef.push(71.58f);

        stackRef = stackStr;

        stackRef.push("Diego");
        stackRef.push("Amanda");

        stackRef = stackInteger;

        stackRef.push(100);
        stackRef.push(200);

        List<IStack> stacks = Arrays.asList(stackGeneric, stackStr, stackInteger);

        for (IStack stack : stacks) {
            System.out.println(stack);
        }
    }
}
