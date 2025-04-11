package examples.practice;

import java.util.ArrayList;

public class Stack<T> implements IStack<T> {
    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<T>();
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        int lastIndex = stack.size() - 1;
        T item = stack.remove(lastIndex);

        return item;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        if (isEmpty()) {
            return "[ ]";
        }

        sb.append("[ ");

        int lastIndex = stack.size() - 1;

        for (int i = 0; i < lastIndex; i++) {
            sb.append(stack.get(i) + ", ");
        }

        sb.append(stack.get(lastIndex) + " ]");

        return sb.toString();
    }
}
