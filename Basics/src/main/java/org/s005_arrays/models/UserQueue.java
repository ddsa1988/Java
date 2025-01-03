package org.s005_arrays.models;

import java.util.NoSuchElementException;

public class UserQueue {
    private static final int defaultCapacity = 5;
    private final int capacity;
    private final String[] arr;
    private int count;

    public UserQueue() {
        this(defaultCapacity);
    }

    public UserQueue(int capacity) {
        this.capacity = capacity;
        arr = new String[this.capacity];
        count = 0;
    }

    public boolean add(String obj) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }

        if (obj == null) {
            throw new IllegalArgumentException("Argument can't be null.");
        }

        arr[count++] = obj;

        return true;
    }

    public String remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        String head = arr[0];
        int tailIndex = --count;

        for (int i = 0; i < tailIndex; i++) {
            arr[i] = arr[i + 1];
        }

        arr[tailIndex] = null;

        return head;
    }

    public String peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        return arr[0];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        int tailIndex = size() - 1;

        StringBuilder sb = new StringBuilder();

        sb.append('[');

        for (int i = 0; i < tailIndex; i++) {
            sb.append(arr[i]).append(", ");
        }

        sb.append(arr[tailIndex]).append(']');

        return sb.toString();
    }
}
