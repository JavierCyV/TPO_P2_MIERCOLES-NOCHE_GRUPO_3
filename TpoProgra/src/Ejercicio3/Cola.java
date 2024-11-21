package Ejercicio3;

import java.util.LinkedList;

public class Cola<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        return elements.isEmpty() ? null : elements.removeFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public LinkedList<T> getElements() {
        return elements;
    }

    public int size() {
        return elements.size();
    }

}
