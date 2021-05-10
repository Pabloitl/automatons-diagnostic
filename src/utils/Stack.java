package utils;

import java.util.Arrays;

public class Stack<E> {
    private static final int INITIAL_CAPACITY = 10;
    private static final float GROWTH = .25f; // 25%

    private int pointer = -1;
    private Object[] arr;

    public Stack() {
        arr = new Object[INITIAL_CAPACITY];
    }

    public Stack(int capacity) {
        arr = new Object[capacity];
    }

    public boolean empty() {
        return pointer < 0;
    }

    @SuppressWarnings("unchecked")
    public E top() {
        dieIfEmpty();
        return (E) arr[pointer];
    }

    public void pop() {
        dieIfEmpty();
        --pointer;
    }

    private void dieIfEmpty() {
        if (pointer >= 0) return;

        throw new RuntimeException("Empty stack");
    }

    public void push(E item) {
        if (pointer == arr.length - 1) grow();

        arr[++pointer] = item;
    }

    private void grow() {
        arr = Arrays.copyOf(arr, (int) Math.ceil(arr.length * (GROWTH + 1)));
    }
}
