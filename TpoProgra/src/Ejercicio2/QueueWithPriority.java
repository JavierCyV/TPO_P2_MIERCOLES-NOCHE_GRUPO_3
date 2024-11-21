package Ejercicio2;

import java.util.PriorityQueue;

public class QueueWithPriority<T extends Comparable<T>> {
    private PriorityQueue<T> queue;

    public QueueWithPriority() {
        this.queue = new PriorityQueue<>();
    }

    public void enqueue(T value) {
        queue.add(value);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
