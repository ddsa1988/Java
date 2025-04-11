package examples.practice;

import java.util.EmptyStackException;

public class StackString implements IStack<String> {
    private static int defaultCapacity = 5;
    private int capacity;
    private int counter;
    private String[] stack;

    public StackString() {
        this(defaultCapacity);
    }

    public StackString(int capacity) {
        setCapacity(capacity);
        stack = new String[this.capacity];
    }

    @Override
    public void push(String item) {
        if (isFull()) {
            setCapacity(capacity * 2);

            String[] temp = stack;
            stack = new String[capacity];

            int length = temp.length;

            for (int i = 0; i < length; i++) {
                stack[i] = temp[i];
            }
        }

        stack[counter++] = item;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int lastIndex = --counter;

        String item = stack[lastIndex];
        stack[lastIndex] = null;

        return item;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    private boolean isFull() {
        return counter == capacity;
    }

    public int size() {
        return counter;
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity > 0 ? capacity : defaultCapacity;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        if (isEmpty()) {
            return "[ ]";
        }

        sb.append("[ ");

        int lastIndex = counter - 1;

        for (int i = 0; i < lastIndex; i++) {
            sb.append(stack[i] + ", ");
        }

        sb.append(stack[lastIndex] + " ]");

        return sb.toString();
    }
}
