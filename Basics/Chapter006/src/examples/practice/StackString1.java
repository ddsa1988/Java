package examples.practice;

public class StackString1 {
    private final static int defaultCapacity = 5;
    private String[] stack;
    private int capacity;
    private int counter;

    public StackString1() {
        this(defaultCapacity);
    }

    public StackString1(int capacity) {
        setCapacity(capacity);
        stack = new String[this.capacity];
        counter = 0;
    }

    public boolean push(String value) {
        if (isFull()) {
            return false;
        }

        stack[counter++] = value;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }

        String value = stack[--counter];
        stack[counter] = null;

        return value;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    private void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }

        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        var sb = new StringBuilder("[ ");
        int size = size();

        for (int i = 0; i < size - 1; i++) {
            sb.append(stack[i] + ", ");
        }

        sb.append(stack[size - 1] + " ]");

        return sb.toString();
    }
}
