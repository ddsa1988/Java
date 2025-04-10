package examples.practice;

public class StackString implements IStack<String> {

    @Override
    public void push(String item) {
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public String pop() {
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }
}
