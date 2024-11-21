package Ejercicio3;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


public class QueueOfQueue<T> {
    private List<Cola<T>> queueList = new ArrayList<>();  // Lista para almacenar colas

    public void addQueue(Cola<T> queue) {
        queueList.add(queue);
    }

    public static <T> QueueOfQueue<T> concatenate(QueueOfQueue<T>... queues) {
        QueueOfQueue<T> result = new QueueOfQueue<>();
        for (QueueOfQueue<T> queueOfQueue : queues) {
            for (Cola<T> queue : queueOfQueue.queueList) {
                result.addQueue(queue);
            }
        }
        return result;
    }

    public Cola<T> flat() {
        Cola<T> flatQueue = new Cola<>();
        for (Cola<T> queue : queueList) {
            for (T element : queue.getElements()) {
                flatQueue.enqueue(element);
            }
        }
        return flatQueue;
    }

    public void reverseWithDepth() {

        for (Cola<T> queue : queueList) {
            LinkedList<T> reversed = new LinkedList<>();
            while (!queue.isEmpty()) {
                reversed.addFirst(queue.dequeue());
            }
            for (T element : reversed) {
                queue.enqueue(element);
            }
        }

        List<Cola<T>> reversedList = new ArrayList<>();
        for (int i = queueList.size() - 1; i >= 0; i--) {
            reversedList.add(queueList.get(i));
        }
        queueList = reversedList;
    }

    public List<Cola<T>> getQueueList() {
        return queueList;
    }

    public void printQueueOfQueue() {
        for (Cola<T> queue : queueList) {
            System.out.println(queue.getElements());
        }
    }
}
