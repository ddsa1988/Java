package examples.practice;

import java.util.EmptyStackException;

public class StackInteger implements IStack<Integer> {
    private static int defaultCapacity = 5;
    private int capacity;
    private int counter;
    private Integer[] stack;

    public StackInteger() {
        this(defaultCapacity);
    }

    public StackInteger(int capacity) {
        setCapacity(capacity);
        stack = new Integer[this.capacity];
    }

    @Override
    public void push(Integer item) {
        if (isFull()) {
            setCapacity(capacity * 2);

            Integer[] temp = stack;
            stack = new Integer[capacity];

            int length = temp.length;

            for (int i = 0; i < length; i++) {
                stack[i] = temp[i];
            }
        }

        stack[counter++] = item;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int lastIndex = --counter;

        Integer item = stack[lastIndex];
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
