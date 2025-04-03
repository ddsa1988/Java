package examples.practice;

public class QueueString {
    private final static int defaultCapacity = 5;
    private String[] queue;
    private int capacity;
    private int counter;

    public QueueString() {
        this(defaultCapacity);
    }

    public QueueString(int capacity) {
        setCapacity(capacity);
        queue = new String[this.capacity];
        counter = 0;
    }

    public boolean push(String value) {
        if (isFull()) {
            return false;
        }

        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Argument must not be null or empty.");
        }

        queue[counter++] = value;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }

        String value = queue[0];
        int size = counter - 1;

        for (int i = 0; i < size; i++) {
            queue[i] = queue[i + 1];
        }

        queue[--counter] = null;

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

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }

        this.capacity = capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        var sb = new StringBuilder("[ ");
        int size = size();

        for (int i = 0; i < size - 1; i++) {
            sb.append(queue[i] + ", ");
        }

        sb.append(queue[size - 1] + " ]");

        return sb.toString();
    }
}
